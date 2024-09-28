
package pkg2017scanner;


public class cellphoneCalls extends telephoneCalls{
    
    public cellphoneCalls(String customerName, int talkTime, double pricePerMinute) {
        super(customerName, talkTime, pricePerMinute);
    }
    
    @Override
    
   public void runDaTing(){
       
        double totalDue = getTalkTime() * getPricePerMinute();
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Talk Time (in minutes): " + getTalkTime());
        System.out.println("Price per Minute: $" + getPricePerMinute());
        System.out.println("Total Amount Due: $" + totalDue);
        
   }
    
}
