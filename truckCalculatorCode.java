import java.util.*;
import java.util.Scanner;
//grade tracker, story telling, school work, Basic Inventory Tracker
public class truckCalculator {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter line haul amount: ");
       double lineHaul = scan.nextDouble();
       System.out.println("Enter fuel charge: ");
       double fuelCharge = scan.nextDouble();
       double lineAndFuel = lineHaul + fuelCharge;
       System.out.println("Here is the amount of the line haul + fuel charge: " + lineAndFuel);
       double afterRate = lineAndFuel * 1.5;
       System.out.println("Here is the amount after the insurance rate: " + afterRate);
       double trailerFee = lineHaul * 23; // ask chat gpt about percents
       System.out.println("Here is the amount after multiplying brokerage fee: " + trailerFee);
       double total = afterRate + trailerFee;
       System.out.println("Here is the total amount. It is the total of the insurance rate and brokerage fee: " + total);
       // need to still do the total net for the week and ask if this is understandable, 
       // also round the decimal stop after 2. 
    }
}
