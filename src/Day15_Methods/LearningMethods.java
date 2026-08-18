package Day15_Methods;
import java.util.Scanner;

public class LearningMethods {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        int choice;


        do {
            System.out.println("---CONSOLE CALCULATOR---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Close");
            System.out.print("-> ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 1:
                    System.out.println("---ADDITION---");
                    System.out.print("Num1: ");
                    num1 = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Num2: ");
                    num2 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Sum : " + Add(num1, num2));
                    break;
                case 2:
                    System.out.println("---SUBTRACTION---");
                    System.out.print("Num1: ");
                    num1 = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Num2: ");
                    num2 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Difference : " + Subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("---MULTIPLICATION---");
                    System.out.print("Num1: ");
                    num1 = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Num2: ");
                    num2 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Product : " + Multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("---DIVISION---");
                    System.out.print("Num1: ");
                    num1 = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Num2: ");
                    num2 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Quotient : " + Divide(num1, num2));
                    break;
                case 5:
                    System.out.println("Closing...");
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }

        System.out.println("----------------------------\n");
        }while(choice != 5);

        System.out.println("Thank You for Using Console Calculator!");

    }
    static int Add(int num1, int num2) {
      return num1 + num2;
    }
    static int Subtract(int num1, int num2) {
        return num1 - num2;
    }
    static int Multiply(int num1, int num2) {
        return num1 * num2;
    }
    static int Divide(int num1, int num2) {
        return num1 / num2;
    }

}


