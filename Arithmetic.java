//simple use of arithmetic operation

import java.util.Scanner;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter meal cost");
        double mealCost = scan.nextDouble(); // original meal price
        System.out.println("Enter tip percentage");
        int tipPercent = scan.nextInt(); // tip percentage
        System.out.println("Enter tax percentage");
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
      double tip= mealCost*((double)tipPercent/100); // Write your calculation code here.
      double tax= mealCost*((double)taxPercent/100);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost+tip+tax);
      System.out.println("The total meal cost is"+" "+totalCost+" "+"dollars");
        // Print your result
    }
}