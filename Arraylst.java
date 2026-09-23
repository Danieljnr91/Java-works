import java.util.Scanner;
import java.util.ArrayList;

public class Arraylst{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        
        System.out.println("Enter");
        for(int i=0; i<5; i++){
            int x = scanner.nextInt();
            nums.add(x);
        }
        scanner.close();

        System.out.println(nums);
    }
}