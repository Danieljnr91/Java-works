import java.util.Scanner;


public class oopPractice{
    void greet(){
        System.out.println("Hello Everyone");
}
    void sendOff(){
        System.out.println("Ok Everyone can leave now");
}
    void test(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data:");
        double number = scanner.nextDouble();
        scanner.close();
        System.out.println(number);
    }
    public static void main(String[] args){
        oopPractice obj = new oopPractice();
        obj.greet();
        obj.sendOff();
        obj.test();
    }
}

