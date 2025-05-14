public class Main{
    public static void main(String [] args){
        User user =  new User("Ravi", "ravi12@gmail.com", 500);
        PaymentMethod paymentMethod1 =  new CreditCardPayment();
        paymentMethod1.pay(400);
        user.debit(400);

        PaymentMethod paymentMethod2 =  new UPIPayment();
        paymentMethod2.pay(300);
        user.debit(300);

    }
}