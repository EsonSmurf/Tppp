
package psa;
import java.util.*;
import java.util.List;
public class PSA {
  private static List<String> admins = new ArrayList<>();
  private static Map<String, String> adminCredentials = new HashMap<>();
   
    public static void add() {
      
    adminCredentials.put("admin", "adminpassword");

        Scanner scanner = new Scanner(System.in);

        boolean isAdminLoggedIn = adminLogin(scanner);

        if (isAdminLoggedIn) {

            adminFunctionalities(scanner);
        } else {
            System.out.println("Login failed. Exiting program.");
        }

        scanner.close();
    }

    private static boolean adminLogin(Scanner scanner) {
        boolean isValidLogin = false;

        do {
                     System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.println("Admin Login:");
            System.out.print("Enter username: ");
            String username = scanner.next();
            System.out.print("Enter password: ");
            String password = scanner.next();
                     System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


            if (adminCredentials.containsKey(username) && adminCredentials.get(username).equals(password)) {
                System.out.println("Login successful. Welcome, Admin!");
                isValidLogin = true;
            } else {
                System.out.println("Login failed. Invalid username or password. Please try again.");
            }

        } while (!isValidLogin);

        return true;
    }

    private static void adminFunctionalities(Scanner scanner) {
        int adminChoice;
        do {
                     System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.println("\nAdmin Functionalities:");
            System.out.println("1. Remove Admin");
            System.out.println("2. Edit user");
            System.out.println("3. View user");
            System.out.println("4. Add admin");
            System.out.println("5. Exit");

            adminChoice = scanner.nextInt();

            switch (adminChoice) {
                case 1:
                    removeAdmin(scanner);
                    break;

                case 2:
                    editUser();
                    break;

                case 3:
                    viewUser();
                    break;

                case 4:
                    addAdmin(scanner);
                    break;

                case 5:
                    PSA.Reg();
                    System.out.println("Exiting Admin panel.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }

        } while (adminChoice != 5);
    }

    private static void removeAdmin(Scanner scanner) {
        System.out.println("Remove admin functionality:");
        System.out.print("Enter the username of the admin to remove: ");
        String adminToRemove = scanner.next();

        if (admins.contains(adminToRemove) && adminCredentials.containsKey(adminToRemove)) {
            admins.remove(adminToRemove);
            adminCredentials.remove(adminToRemove);
            System.out.println("Admin removed successfully.");
        } else {
            System.out.println("Admin not found. Unable to remove.");
        }
    }
    private static void editUser() {
        
        System.out.println("Edit user functionality");
    }

    private static void viewUser() {
     
        System.out.println("View user functionality");
        
    }

    private static void addAdmin(Scanner scanner) {
        System.out.println("Registering a new admin:");
        System.out.print("Enter username for the new admin: ");
        String newAdminUsername = scanner.next();
        System.out.print("Enter password for the new admin: ");
        String newAdminPassword = scanner.next();

        if (admins.contains(newAdminUsername)) {
            System.out.println("Username already exists. Unable to add admin.");
        } else {
            admins.add(newAdminUsername);
            adminCredentials.put(newAdminUsername, newAdminPassword);
            System.out.println("Admin added successfully.");
        }
    }
    
     
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("                                                             _____  _    _ _____ _      _____ _____  _____ _____ _   _ ______ ");
        System.out.println("                                                            |  __ \\| |  | |_   _| |    |_   _|  __ \\|  __ \\_   _| \\ | |____|");
        System.out.println("                                                            | |__) | |__| | | | | |      | | | |__) | |__) || | |  \\| | |__   ");
        System.out.println("                                                            |  ___/|  __  | | | | |      | | |  ___/|  ___/ | | | . ` |  __|  ");
        System.out.println("                                                            | |    | |  | |_| |_| |____ _| |_| |    | |    _| |_| |\\  | |____ ");
        System.out.println("                                                            |_|    |_|  |_|_____|______|_____|_|    |_|   |_____|_| \\_|______|");
        System.out.println("                                                            / ____|__   __|/\\|__   __|_   _|/ ____|__   __|_   _/ ____|/ ____|");
        System.out.println("                                                            | (___    | |  /  \\  | |    | | | (___    | |    | || |    | (___  "); 
        System.out.println("                                                          \\___ \\   | | / /\\ \\ | |    | |  \\___ \\   | |    | || |     \\___ \\ ");
        System.out.println("                                                             ____) |  | |/ ____ \\| |   _| |_ ____) |  | |   _| || |____ ____) |");
        System.out.println("                                                           |_____/  _|_/_/ ___\\_\\_|_ |_____|_____/___|_|__|_____\\_____|_____/_");
        System.out.println("                                                               /\\  | |  | |__   __| |  | |/ __ \\|  __ \\|_   _|__   __\\ \\   / /");
        System.out.println("                                                              /  \\ | |  | |  | |  | |__| | |  | | |__) | | |    | |   \\ \\_/ / ");
        System.out.println("                                                             / /\\ \\| |  | |  | |  |  __  | |  | |  _  /  | |    | |    \\   /  ");
        System.out.println("                                                            / ____ \\ |__| |  | |  | |  | | |__| | | \\ \\ _| |_   | |     | |   ");
        System.out.println("                                                            /_/    \\_\\____/   |_|  |_|  |_|\\____/|_|  \\_\\_____|  |_|     |_|   ");
        System.out.println("");
        System.out.println("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
       try {
          System.out.println("");
              Thread.sleep(500); 
         
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
          Thread.sleep(500); 
         System.out.println("");
             Thread.sleep(500); 
         System.out.println("                                                                         Republic of the Philippines");
                Thread.sleep(500); 
         System.out.println("                                                                        Philippine Statistics Authority");
            Thread.sleep(500); 
         System.out.println("                                                                       Registration and Certificate System");
            Thread.sleep(500); 
         System.out.println("");
            Thread.sleep(500); 
           
                     System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            Thread.sleep(500); 
         System.out.println("");
            Thread.sleep(500); 
           System.out.println("                                                                       [1]Admin               [2]Guest    ");
         System.out.println("");
            Thread.sleep(500); 
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("                                                                                        ");
       
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       int Choice;
       
       do{
        Choice = scanner.nextInt();
       scanner.nextLine();
       if(Choice == 2){
       
                System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");
               System.out.println("                                  Press [B] for BirthCertificate   Press [M] for Marriage  Press [D] for Death Certificate   Press [E] for Exit");
               System.out.println("");
                System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

       
        String choice = scanner.nextLine().toUpperCase();

        switch (choice) {
            case "B":
                performRegistration();
                break;
            case "M":
               Perform();
                break;
            case "D":
               PerformD();
                break;
            case "E":
             Reg();
            default:
                System.out.println("Invalid choice. Please choose B,C,M or D");
                continue;
        }
        }else if (Choice == 1){
             System.out.println("Welcome, Admin!");
 PSA.add();
             

        
        

       

      } 
       }while(Choice !=0);
       
        System.out.println("Exiting The Program");

    } 
public static void Reg(){
       try {
     System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            Thread.sleep(500); 
         System.out.println("");
            Thread.sleep(500); 
           System.out.println("                                                                       [1]Admin               [2]Guest    ");
         System.out.println("");
            Thread.sleep(500); 
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("                                                                                        ");
       
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    int Choice;
        Scanner scanner = new Scanner(System.in);
       do{
        Choice = scanner.nextInt();
       scanner.nextLine();
       if(Choice == 2){
       
                System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");
               System.out.println("                                  Press [B] for BirthCertificate   Press [M] for Marriage  Press [D] for Death Certificate");
               System.out.println("");
                System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

       
        String choice = scanner.nextLine().toUpperCase();

        switch (choice) {
            case "B":
                performRegistration();
                break;
            case "M":
               Perform();
                break;
            case "D":
               PerformD();
                break;
             case "E":
             Reg();
            default:
                System.out.println("Invalid choice. Please choose B,C,M or D");
                continue;
        }
        }else if (Choice == 1){
             System.out.println("Welcome, Admin!");
 PSA.add();
             

        
        

       

      } 
       }while(Choice !=0);
       
        System.out.println("Exiting The Program");

    } 




   public static void performRegistration() {
        Scanner scanner = new Scanner(System.in);
        BirthCertificate birthCertificate = new BirthCertificate();
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("       [Child's Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        birthCertificate.inputInformation(scanner);
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Mother's Maiden Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        birthCertificate.inputMotherInformation(scanner);
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Father's Maiden Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        birthCertificate.inputFatherInformation();
        
        while (true) {
            
          birthCertificate.displayInformation();
          
            System.out.println("\nDo you want to edit?");
            System.out.println("1. Yes       2. No");

            int editChoice = scanner.nextInt();
            scanner.nextLine(); 

            if (editChoice == 1) {
                System.out.print("\nWhich row? : ");
                String rowToEdit = scanner.nextLine();

               
                birthCertificate.editInformation(rowToEdit, scanner);

             
                System.out.println("\nUpdated Information:");
                birthCertificate.displayInformation();
            } else if (editChoice == 2) {
                birthCertificate.displayInformation();
                System.out.println("Do you want to sample copy?: [1] Yes or [2] no");
                int L = scanner.nextInt();
                while(true)
                    if(L == 1){
                    birthCertificate.CombinedInformation();
                        
                    }else if(L == 2){
                        birthCertificate.displayInformation();
                    }else
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
        
        
    }
   
   
   
   
   
   public static void PerformD(){
   Scanner scanner = new Scanner(System.in);
   DeathCertificate deathcertificate = new DeathCertificate();
      System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("       [Deaath Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        deathcertificate.inputInformation(scanner);
    while (true) {
            
          deathcertificate.displayInformation();
          
            System.out.println("\nDo you want to edit?");
            System.out.println("1. Yes       2. No");

            int editChoice = scanner.nextInt();
            scanner.nextLine(); 

            if (editChoice == 1) {
                System.out.print("\nWhich row? : ");
                String rowToEdit = scanner.nextLine();

               
                deathcertificate.editInformation(rowToEdit, scanner);

             
                System.out.println("\nUpdated Information:");
                deathcertificate.displayInformation();
            } else if (editChoice == 2) {
                deathcertificate.displayInformation();
                System.out.println("Do you want to sample copy?: [1] Yes or [2] no");
                int L = scanner.nextInt();
                while (true) {
                    if (L == 1) {
                        deathcertificate.CombinedInformation();
                    } else if (L == 2) {
                      
                    } else {
                        break;
                    }
                }              
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    
         
   }

    public static void Perform() {
   Scanner scanner = new Scanner(System.in);
    Marriage marriage = new Marriage();
   System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("       [Wife Information:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    marriage.wifeInformation(scanner);
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Husband Information:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

           marriage.husbandInformation(scanner);
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

   marriage.displayInformation();
      
     
   
    while (true) {
            
          marriage.displayInformation();
          
            System.out.println("\nDo you want to edit?");
            System.out.println("1. Yes       2. No");

            int editChoice = scanner.nextInt();
            scanner.nextLine(); 

            if (editChoice == 1) {
                System.out.print("\nWhich row? : ");
                String rowToEdit = scanner.nextLine();

               
                marriage.editInformation(rowToEdit, scanner);

             
                System.out.println("\nUpdated Information:");
                marriage.displayInformation();
            } else if (editChoice == 2) {
                marriage.displayInformation();
                System.out.println("Do you want to sample copy?: [1] Yes or [2] no");
                int L = scanner.nextInt();
                while (true) {
                    if (L == 1) {
                        marriage.CombinedInformation();
                    } else if (L == 2) {
                      
                    } else {
                        break;
                    }
                }              
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }
}

     

       

    
    

    


    
    

