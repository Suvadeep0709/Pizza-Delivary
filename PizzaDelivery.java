import java.util.Arrays;
import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**  Task 1: 
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */
        System.out.println("How many pizza toppings do you want ? ");
        int pizzaToppings=scan.nextInt();
        scan.nextLine();

        // Task 2 – Create the array here
        String []toppings =new String[pizzaToppings];

        System.out.println("Great , enter each topping");
        for (int i=0;i<toppings.length;i++){
            System.out.print(i+".");
            toppings[i]=scan.nextLine();
        }
        System.out.println(Arrays.toString(toppings));
        System.out.println("Thank you! Here are the toppings your ordered");
        for (int i=0;i<toppings.length;i++){
            System.out.println(i+" "+ toppings[i]);
        }

        System.out.println("Press anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great a driver is on the way");
       

        scan.close();


         
    }
}
