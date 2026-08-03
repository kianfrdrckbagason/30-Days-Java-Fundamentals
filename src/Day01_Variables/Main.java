package Day01_Variables;

public class Main {
    public static void main(String[] args){

    /* Learn(int double char boolean String)
    Practice
    Create variables for:
    Name Age Height Weight Middle Name isStudent
    Challenge
    Print a profile.
    Example (Name: Kian Age: 22 Height: 166 cm)
     */
        String firstName = "Kian Fredrick";
        String lastName = "Bagason";
        int age =  22;
        double height = 166.2;
        double weight = 70.3;
        char middleInitial = 'O';
        boolean isStudent = false;

        System.out.println("---PROFILE---");
        System.out.println("Name  : "+ firstName + " " + middleInitial + " " + lastName);
        System.out.println("Age   : "+ age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.print("Student : ");

        if(isStudent){
            System.out.println("Yes");
        }else System.out.println("No");







    }
}
