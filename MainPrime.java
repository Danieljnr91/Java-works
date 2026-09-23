import java.util.Scanner;

class Prime{
    boolean isPrime(int x){
       if(x==0 || x==1){
        return false;
       }
       for(int i=2; i<x; i++){
            if(x%i==0){
                return false;
            }
       }
       return true;
    }
}

public class MainPrime{
    public static void main(String[] args){
        Prime prime = new Prime();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter range number one:");
        int number = scanner.nextInt();

        System.out.print("Enter range number two:");
        int number2 =  scanner.nextInt();

        scanner.close();
        
        int counter = 0;
        for(int i=number; i<=number2; i++){
            if(prime.isPrime(i)){
                System.out.print(i+" ");
                counter+=1;
            }
        }
        System.out.println();
        System.out.println("There are "+counter+" prime numbers between "+number+" and "+number2);
    }
}
