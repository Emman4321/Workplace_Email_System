import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String altEmail;
    private String compSuffix = "company.com";

    //input first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Hello, " + this.firstName + " " + this.lastName + "!");

        //call a method asking for department, then return department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randPass(12);
        System.out.println("Your current password is: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + ".company.com";
        System.out.println("Your new email is: " + email);
    }   

    //ask for department
    private String setDepartment(){
        System.out.println("Enter the department\n1 for Sales\n2 for Tech\n3 for Marketing\n4 for Finance\n" + //
                        "5 for Executive\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) { return "sales"; }
        else if(depChoice == 2) { return "tech"; }
        else if(depChoice == 3) { return "marketing"; }
        else if(depChoice == 4) { return "finance"; }
        else if(depChoice == 5) { return "executive"; }
        else { return ""; }

    }

    //gen random password
    private String randPass(int length){
        length = 12;
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }   
        //set alt email
    public void setAltEmail(String altEmail){  
        this.altEmail = altEmail;
    }
        //change password
    public void changePassword(String password){
        this.password = password;
    }
        //get mailbox capacity
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
        //get alt email
    public String getAltEmail(){
        return altEmail;
    }
        //get password
    public String getPassword(){
        return password;
    }
    //shows current user info
    public String showInfo(){
        return "Display Name: " + firstName + " " + lastName + 
                "\nCompany Email: " + email + 
                "\nAlternate Email: " + altEmail + 
                "\nMailbox Capacity: " + mailboxCapacity + "mb";
    }
}
