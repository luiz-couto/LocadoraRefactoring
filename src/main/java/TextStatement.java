import java.util.Enumeration;

public class TextStatement extends Statement {
    
    public String valueOne(Customer aCustomer){ 
	String result = "Rental Record for " + aCustomer.getName() + "\n";
        return result;
    }
    
    
    public String valueTwo(Rental each){
        String result = "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
        return result;
    }
    
    public String valueThree(Customer aCustomer){
	String result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" + "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";	
        return result;
    }
}