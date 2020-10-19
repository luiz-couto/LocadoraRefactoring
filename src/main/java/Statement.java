import java.util.Enumeration;

public abstract class Statement {
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
    
    abstract String valueOne(Customer aCustomer);
    abstract String valueTwo(Rental each);
    abstract String valueThree(Customer aCustomer);
}