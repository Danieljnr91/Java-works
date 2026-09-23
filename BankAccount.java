import java.util.Scanner;

class AccountManager{
    double acctBalance=0;

    boolean verifyPin(int enteredPin){
        if(enteredPin==2004){return true;}
        else{return false;} 
    }

    void deposit(double amt, int pin){
        if(verifyPin(pin)){
            acctBalance+=amt;
            System.out.println("$" + amt + " has been added to your account\nYour Balance is: " + acctBalance);
        }else{
            System.out.println("Pin Entered is Invalid!");
        }
    }

    void withdraw(double amt, int pin){
        if(amt<0 || amt>acctBalance){
            System.out.println("Invalid Input!");
            return;
        }
        else if(verifyPin(pin)){
            acctBalance -= amt;
            System.out.println("$" + amt + " has been withdrawn from your account\nYour Balance is: " + acctBalance);
        }else{
            System.out.println("Pin Entered is Invalid!");
        }
    }
} 

public class BankAccount{
    public static void main(String[] args){
        int choice;
        Scanner scanner = new Scanner(System.in);
        AccountManager manager = new AccountManager();
        
        while(true){
            System.out.print("1.Deposit \n2.Withdraw \n3.Exit\nChoose:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    double amt;
                    int pin;
                    System.out.print("Enter amount to deposit:");
                    amt = scanner.nextDouble();
                    System.out.print("Enter your pin:");
                    pin = scanner.nextInt();
                    manager.deposit(amt,pin);
                    
                    break;

                case 2:
                    double amount;
                    int entpin;
                    System.out.print("Enter amount to withdraw:");
                    amount = scanner.nextDouble();
                    System.out.print("Enter your pin:");
                    entpin = scanner.nextInt();
                    manager.withdraw(amount,entpin);

                    break;

            }
            if(choice==3){
                System.out.println("Exiting..");
                break;
            }
           
            
        }
        scanner.close();
    }
}



