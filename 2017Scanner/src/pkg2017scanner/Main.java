
package pkg2017scanner;

import java.util.Scanner;


public class Main {

    
    
    public static void main(String[] args) {
   Scanner kb =  new Scanner(System.in);
    
        // Input customer details
        System.out.print("Enter the customer name: ");
        String customerName = kb.nextLine();

        System.out.print("Enter the talk time in minutes: ");
        int talkTime = kb.nextInt();

        System.out.print("Enter the price per minute: ");
        double pricePerMinute = kb.nextDouble();

        // Create Cell_Billing object and print the bill
        cellphoneCalls cellBill = new cellphoneCalls(customerName, talkTime, pricePerMinute);
       cellBill.runDaTing();
        
    }
    
}
