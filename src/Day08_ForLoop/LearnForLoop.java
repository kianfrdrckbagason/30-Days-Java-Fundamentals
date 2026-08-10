package Day08_ForLoop;
import java.util.Scanner;

public class LearnForLoop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;


        System.out.print("Enter numbers of Iteration: ");
        num = scan.nextInt();

        for(int i = 1; i<=num; i++){

            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    scan.close();
    }
}
