import java.util.Scanner;
import java.util.HashMap;

public class hash {
    public static void main(String[] args){
        HashMap<String,Integer> data = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name:");
        String name = scanner.nextLine();
        System.out.print("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        data.put(name,age);
        scanner.close();

        for(HashMap.Entry<String,Integer> entry : data.entrySet()){
            System.out.println(entry.getKey()+"->" + entry.getValue());
        }

    }
    
}