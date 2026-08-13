package Day10_DoWhileLoop;
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //variables needed for signup
        String name;
        int age;
        char gender;
        String userName = null;
        String passWord = null;

        //use to compare credentials during login
        String user;
        String pass;

        int choice = 0;

        boolean accountCreated = false;

        while(choice !=3){
        System.out.println("\n---WELCOME TO FAKEBOOK---");
        System.out.println("1. Signup");
        System.out.println("2. Login");
        System.out.println("3. Close");
        System.out.print("-> ");
        choice = scan.nextInt();
        scan.nextLine();


            switch (choice) {
                case 1:
                    System.out.println("---Register User---");
                    System.out.print("Name     : ");
                    name = scan.nextLine();
                    System.out.print("Age      : ");
                    age = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Gender   : ");
                    gender = Character.toUpperCase(scan.next().charAt(0));
                    scan.nextLine();
                    System.out.print("Username : ");
                    userName = scan.nextLine();
                    System.out.print("Password : ");
                    passWord = scan.nextLine();

                    System.out.println("****Account Created****");
                    accountCreated = true;
                    break;
                case 2:
                    if(accountCreated){

                    do {
                        System.out.println("---Login---");
                        System.out.print("Username: ");
                        user = scan.nextLine();
                        System.out.print("Password: ");
                        pass = scan.nextLine();
                        if(!userName.equals(user) || !passWord.equals(pass)){
                            System.out.println("Wrong Credentials");
                        }
                    } while (!(userName.equals(user) && passWord.equals(pass)));
                    System.out.println("LOGGED IN SUCCESSFULLY!");
                    System.out.println("Hello, " + userName);
                    choice = 3;
                        break;
                    }else{
                        System.out.println("****Sign Up first!****");
                    }
                    break;

                case 3:
                    System.out.println("You closed FakeBook");
                    choice = 3;
                    break;
            }

        }

        scan.close();
    }
}
