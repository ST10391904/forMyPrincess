
package pkg2017scanner;


public abstract class telephoneCalls implements printDaTing {


    
    private String customerName;
    private int talkTime;
    private double pricePerMinute;
    
    public telephoneCalls(String customerName, int talkTime, double pricePerMinute){
        
        this.customerName = customerName;
        this.pricePerMinute = pricePerMinute;
        this.talkTime = talkTime;
}
    
        public String getCustomerName() {
        return customerName;
    }

    public int getTalkTime() {
        return talkTime;
    }

    public double getPricePerMinute() {
        return pricePerMinute;
    }
    
}




