import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: "); 
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        Email em1 = new Email(firstName, lastName);

        em1.setMailboxCapacity(500);
        em1.setAltEmail("umbcretriever@gmail.com");

        String choice = "";
        while (!choice.equals("exit")){
            System.out.println("Enter a command: display, changepass,upgradecap, updatealt, or exit");
            choice = scanner.nextLine();

            if(choice.equals("display")){
                System.out.println(em1.showInfo());
            } 
            else if (choice.equals("changepass")){
                System.out.println("Enter your new password: ");
                String newPassword = scanner.nextLine();
                
                em1.changePassword(newPassword);
                System.out.println("Your new password is: " + newPassword);
            }
            else if (choice.equals("updatealt")){
                System.out.println("Enter your new alternate email: ");
                String newAltEmail = scanner.nextLine();
                
                em1.setAltEmail(newAltEmail);
                System.out.println("Your new alternate email is: " + newAltEmail);
            }
            else if (choice.equals("upgradecap")){
                System.out.println("Enter your new mailbox capacity: ");
                int newCapacity = scanner.nextInt();
                scanner.nextLine();
                
                em1.setMailboxCapacity(newCapacity);
                System.out.println("Your new mailbox capacity is: " + newCapacity);
            }
            else if (choice.equals("exit")){
                System.out.println("Goodbye!");
            }
            else{
                System.out.println("Invalid input. Please try again.");
            }
        
        } 
        
    scanner.close();
    }
}