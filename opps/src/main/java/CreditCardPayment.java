
public class CreditCardPayment implements PaymentMethod{

    @Override
    public void pay(double amount){
        System.out.println("Paying Rs. " + amount + " using Credit Card");
    }
    
}