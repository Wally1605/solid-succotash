import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an amount of money");
        double money = sc.nextDouble()*100;
        int total = (int)money;
        /* All the outputs */
        int dollars = (total/100);
        int quarters = (total%100) / 25;
        int dimes = ((total%100) % 25) / 10;
        int nickels = (((total%100)%25)%10) / 5;
        int cents = (((total%100)%25) % 10) % 5;


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(money / 100 + " converts to: ");
        System.out.println("----------------");
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Cents: " + cents);
         /* System.out.println(total); */ //For debugging
    }
}
