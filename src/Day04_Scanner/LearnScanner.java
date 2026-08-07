package Day04_Scanner;
import java.util.Scanner;

public class LearnScanner{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        String address;

        System.out.println("---USER DETAILS---");
        System.out.print("Name   : ");
        name = scan.nextLine();
        System.out.print("Age    : ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.print("Address: ");
        address = scan.nextLine();

        System.out.print("Confirm Details(Y/N): ");
        char choice = Character.toUpperCase(scan.next().charAt(0));

        if(choice == 'Y') {
            System.out.println("---USER DETAILS---");
            System.out.println("Name    : " + name);
            System.out.println("Age     : " + age);
            if(age>=60){
                System.out.println("Category: Senior");
            }else if(age>=18){
                System.out.println("Category: Adult");
            }else {
                System.out.println("Category: Minor");
            }
            System.out.println("Address : " + address);
        } else if(choice == 'N'){
            System.out.println("Details Not Saved!");
        }else {
            System.out.println("Invalid Input!");
        }
    scan.close();
    }
}