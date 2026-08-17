package Day14_GuessNumber;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10) + 1;


        System.out.println("Play Guess The Number 1 to 10");
        System.out.print("Y/N: ->> ");
        char choice = Character.toUpperCase(scan.next().charAt(0));
        scan.nextLine();
        boolean isRight = false;
        boolean oneMoreTime = true;

        if(choice == 'Y'){
        while(choice == 'Y' && !isRight && oneMoreTime){

            System.out.println("Great! You have 3 Guesses");

            for(int i=1; i<=3; i++) {
                System.out.print("-> ");
                int guess = scan.nextInt();
                scan.nextLine();

                if(guess == randomNumber){
                    System.out.println("You Won!");
                    isRight = true;
                    break;
                }else if(i==3 && guess != randomNumber){
                    System.out.println("You Lose!");
                }else{
                    System.out.println("Try Again!");
                }

                System.out.println("----------------------\n");
            }

            System.out.println("Play Again?");
            System.out.print("Y/N: -> ");
            char playAgain = Character.toUpperCase(scan.next().charAt(0));
            scan.nextLine();

            if(playAgain == 'Y'){
                randomNumber = (int) (Math.random() * 10) + 1;
                    oneMoreTime = true;
                    isRight = false;
            }else if(playAgain == 'N'){
                    oneMoreTime = false;
            }else {
                System.out.println("InvalidInput");
                oneMoreTime = false;
            }


        }

        System.out.println("\nThank you for Playing!");
    scan.close();
    }else if(choice == 'N'){
            System.out.println("Guess the Number Closed!");
        }else {
            System.out.println("Invalid Input");
        }

    }
}
