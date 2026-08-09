package Day07_MiniProject;
import java.util.Scanner;

public class StudentInformationSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String firstName, middleName, lastName;
        int age;
        String course;
        String hobbies = "None";

        System.out.println("Freshman's Student Registration");
        System.out.print("Are you a freshman(Y/N): ");
        char proceed = Character.toUpperCase(scan.next().charAt(0));
        scan.nextLine();

        if(proceed == 'Y') {
            System.out.println("---Student Information System---");
            System.out.print("First Name : ");
            firstName = scan.nextLine();
            System.out.print("Middle Name: ");
            middleName = scan.nextLine();
            System.out.print("Last Name  : ");
            lastName = scan.nextLine();
            System.out.print("Age        : ");
            age = scan.nextInt();
            scan.nextLine();
            System.out.print("Course     : ");
            course = scan.nextLine();

            System.out.print("Add Hobbies(Y/N): ");
            char addHobbies = Character.toUpperCase(scan.next().charAt(0));

            if(addHobbies == 'Y'){
                System.out.println("List of Hobbies");
                System.out.println("1. Basketball");
                System.out.println("2. Volleyball");
                System.out.println("3. Cycling");
                System.out.println("4. Online Games");
                System.out.println("5. Reading");
                System.out.println("6. Others");
                System.out.print("Enter # to choose: ");
                int choice = scan.nextInt();
                scan.nextLine();

                switch(choice){
                    case 1:
                        hobbies = "Basketball";
                        break;
                    case 2:
                        hobbies = "Volleyball";
                        break;
                    case 3:
                        hobbies = "Cycling";
                        break;
                    case 4:
                        hobbies = "Online Games";
                        break;
                    case 5:
                        hobbies = "Reading";
                        break;
                    case 6:
                        System.out.print("Other Hobbies: ");
                        String otherHobbies = scan.nextLine();
                        hobbies = otherHobbies;
                        break;
                    default:
                        System.out.println("No Hobbies Recorded");
                }
            }

            System.out.println("---STUDENT INFORMATION---");
            System.out.println("Fullname: " + lastName + ", " + firstName + " " + middleName);
            System.out.println("Age     : " + age);
            System.out.println("Course  : " + course);
            System.out.println("Hobbies : " + hobbies);

            System.out.println("REGISTRATION COMPLETE!");

        }else if(proceed == 'N'){
            System.out.println("Registration Cancelled!");
        }else {
            System.out.println("Invalid Input!");
        }




    scan.close();
    }
}
