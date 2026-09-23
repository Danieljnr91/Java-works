import java.util.Scanner;


public class Array{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter:");
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
            
        }

        scanner.close();
        for(int i=0; i<5; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
