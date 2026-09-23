import java.util.Scanner;

public class Summer{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("fg");
        int age = scanner.nextInt();
        scanner.close();

        System.out.println("Hello " + name + age);
    }
}