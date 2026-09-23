import java.util.Scanner;
import java.util.HashMap;

public class hash{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> data = new HashMap<>();
        for(int i=0; i<=3; i++){
            System.out.print("Name:");
            String name = scanner.nextLine();
            System.out.print("Age:");
            int age = scanner.nextInt();
            scanner.nextLine();
            data.put(name,age);
        }
        scanner.close();
        for(HashMap.Entry<String,Integer> entry : data.entrySet()){
            System.out.println(entry.getKey() +"->"+ entry.getValue());
        }
 
    }
}