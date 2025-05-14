
public class UPIPayment implements PaymentMethod{

    @Override
    public void pay(double amount){
        System.out.println("Paying Rs. "+ amount + " from UPI.");
    }
} 