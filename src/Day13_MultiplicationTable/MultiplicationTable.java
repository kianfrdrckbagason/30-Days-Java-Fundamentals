package Day13_MultiplicationTable;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Multiply by: ");
    int multiplyBy = scan.nextInt();

    for(int i = 1; i<=10; i++){
        int product = multiplyBy * i;
        System.out.println(multiplyBy + " x " + i + " = " + product);
    }

    scan.close();
    }
}
