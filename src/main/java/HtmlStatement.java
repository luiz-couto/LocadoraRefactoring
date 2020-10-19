import java.util.Enumeration;

public class HtmlStatement extends Statement {
   
    public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals(); 
      String result = valueOne(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement(); 
         result += valueTwo(each);
      }
      result += valueThree(aCustomer);
      return result;
   }
   
    public String valueOne(Customer aCustomer){
	String result = "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
        return result;
    }
    
    public String valueTwo(Rental each){
	String result = each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
        return result;
    }
    
    public String valueThree(Customer aCustomer){
	String result = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" + "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
        return result;
    }

}