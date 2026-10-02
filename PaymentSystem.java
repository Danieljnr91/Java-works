abstract class PaymentMethod{
    String accountHolder;
    double balance;

    PaymentMethod(String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    abstract boolean processPayment(double amount);

    void displayBalance(){
        System.out.println("Account Balance = "+balance);
    }
}


class CreditCardPayment extends PaymentMethod{
    private double creditLimit;
    CreditCardPayment(String accountHolder,double balance,double creditLimit){
        super(accountHolder, balance);
        this.creditLimit=creditLimit;
    }

    @Override
    boolean processPayment(double amount){
        if(amount<=(balance+creditLimit)){
            balance-=amount;
            System.out.println("Transaction Successful");
            displayBalance();
            return true;
        }else{
            System.out.println("Insuffiecient Balance");
            return false;
        }
    }
}


class PaypalPayment extends PaymentMethod{
    String email;
    PaypalPayment(String accountHolder,double balance,String email){
        super(accountHolder, balance);
        this.email=email;
    }

    @Override 
    boolean processPayment(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Transaction Successful");
            displayBalance();
            return true;
        }else{
            System.out.println("Insufficient Balance");
            return false;
        }
    }
}


public class PaymentSystem{
    public static void main(String[] args){
        PaymentMethod pay = new CreditCardPayment("Daniel Kuhlman",5000,7000);
        PaymentMethod paypal = new PaypalPayment("Daniel Kuhlman", 6000, "larteydaniel02@gmail.com");
        pay.processPayment(500);
        paypal.processPayment(400);
    }
}