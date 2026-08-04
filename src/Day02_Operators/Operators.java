package Day02_Operators;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter number 1: ");
        num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        num2 = scan.nextInt();

        int sum = num1+num2;
        int difference = num1-num2;
        int product = num1*num2;
        int modulo = num1%num2;
        int quotient = num1/num2;

        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+difference);
        System.out.println("Product: " +product);
        System.out.println("Quotient: "+quotient);
        System.out.println("Modulo: "+modulo);

    scan.close();
    }
}
