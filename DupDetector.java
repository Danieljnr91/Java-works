import java.util.Scanner;
import java.util.HashSet;

public class DupDetector{
    public static void main(String[] args){
        HashSet<String> names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

       
        String[] flist = {"My","Jay","Kay","Kim","Jay","Kay"};
        for(String word : flist){
            if(!names.add(word)){
                System.out.println("Duplicate found "+word);
            }
        }
        scanner.close();
    }
    
}