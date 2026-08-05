package Day03_IfStatement;
import java.util.Scanner;

public class CheckAge {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int age;
        
        System.out.print("Enter your Age: ");
        age = scan.nextInt();

        System.out.println("Age: "+ age);
        
        if(age>=60){
            System.out.println("Senior");
        } else if (age>=18) {
            System.out.println("Adult");
            
        } else if (age>=0) {
            System.out.println("Minor");
        }else System.out.println("Invalid Input!");

        scan.close();
    }
}
