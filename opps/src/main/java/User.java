
public class User{
    private String name;
    private String email;
    private double balance;

    public User(String name, String email, double balance){
        this.name = name;
        this.email = email;
        this.balance = balance;
    }

    public void debit(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Debited: "+ amount+", New Balance: "+balance);
        }
        else{
            System.out.println("Insufficient Balance!");
        }
    }

    public double getBalance(){
        return balance;
    }
}