package Day01_Variables;
import java.util.Scanner;

public class UserInputProfile {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String firstName, lastName;
        char middleInitial;
        int age;
        double height,weight;
        boolean isStudent;

        System.out.println("---CREATE YOUR PROFILE---");
        System.out.print("First Name: ");
        firstName = scan.nextLine();
        System.out.print("Last Name : ");
        lastName = scan.nextLine();
        System.out.print("Initial   : ");
        middleInitial = scan.next().charAt(0);
        System.out.print("Age       : ");
        age = scan.nextInt();
        System.out.print("Height    : ");
        height = scan.nextDouble();
        System.out.print("Weight    : ");
        weight = scan.nextDouble();
        System.out.print("Student(Y/N): ");
        isStudent = scan.nextBoolean();



    }
}
