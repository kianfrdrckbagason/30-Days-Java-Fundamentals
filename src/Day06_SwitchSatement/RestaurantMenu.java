package Day06_SwitchSatement;
import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;
        char checkMenu;
        int order;
        String ordered = "None";

        System.out.println("Hello, This is SnackHause!");
        System.out.print("Check Menu(Y/N): ");
        checkMenu = Character.toUpperCase(scan.next().charAt(0));

        if(checkMenu == 'Y'){
            System.out.println("---MENUS---");
            System.out.println("1. Burger");
            System.out.println("2. Fries");
            System.out.println("3. Coke");
            System.out.println("4. Exit");
            System.out.print("Order: ");
            order = scan.nextInt();
            scan.nextLine();


                switch(order){
                    case 1:
                        ordered = "Burger";
                        break;
                    case 2:
                        ordered = "Fries";
                        break;
                    case 3:
                        ordered = "Coke";
                        break;
                    case 4:
                        System.out.println("Nothing Ordered");
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            if(order>=1 && order<=3) {
                System.out.print("Name please: ");
                name = scan.nextLine();

                System.out.println(" Name: " + name + "\n Ordered: " + ordered +
                        "\n Thank you! Come Again! ");
            }
        }else if(checkMenu == 'N'){
            System.out.println("Thank you for your Time!");
        }else{
            System.out.println("Invalid Input");
        }

    scan.close();
    }

}
