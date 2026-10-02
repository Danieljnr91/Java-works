import java.util.Scanner;
import java.util.HashMap;

public class WordCounter{
    public static void main(String[] args){
        HashMap<String,Integer> wordCountList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your Input:");
        String sentence = scanner.nextLine();

        String[] wordsArray = sentence.toLowerCase().split("\\s+");
        for(String word:wordsArray){
            wordCountList.put(word,wordCountList.getOrDefault(word, 0)+1);
        }

        for(HashMap.Entry<String,Integer> entry : wordCountList.entrySet()){
            String timeword = (entry.getValue()>1) ? " times" : " time";
            System.out.println(entry.getKey()+"--->"+entry.getValue()+timeword);
        }
        scanner.close();
    }
}