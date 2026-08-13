package Day12_ReversePattern;
import java.util.Scanner;

public class ReversePattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scan.nextInt();

        for(int i = 1; i <=num; i++){

            for(int j = num; j >= i; j--){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
