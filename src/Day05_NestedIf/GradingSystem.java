package Day05_NestedIf;
import java.util.Scanner;

public class GradingSystem{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double mathGrade,englishGrade,scienceGrade;

        System.out.println("---GRADING SYSTEM---");
        System.out.print("Math Grade   : ");
        mathGrade = scan.nextDouble();
        System.out.print("English Grade: ");
        englishGrade = scan.nextDouble();
        System.out.print("Science Grade: ");
        scienceGrade = scan.nextDouble();

        double sum = mathGrade + englishGrade + scienceGrade;
        double average = sum/3;

        if(mathGrade >= 0 && mathGrade <= 100 &&
           englishGrade >= 0 && englishGrade <= 100 &&
           scienceGrade >= 0 && scienceGrade <= 100){

            System.out.printf("Average: %.2f%n", average);

            if(average >= 95){
                System.out.print("Excellent!");
            } else if (average >= 90) {
                System.out.print("Very Good!");
            } else if (average >= 85) {
                System.out.print("Good!");
            } else if (average >= 75) {
                System.out.print("Passed!");
            }else{
                System.out.print("Failed");
            }

        }else{
            System.out.print("Invalid Input");
        }

    scan.close();
    }
}