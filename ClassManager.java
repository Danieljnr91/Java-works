import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class StudentData{
    ArrayList<String> studentNames;
    ArrayList<Integer> studentScores;

    StudentData(ArrayList<String> studentNames, ArrayList<Integer> studentScores){
            this.studentNames = studentNames;
            this.studentScores = studentScores;
    }

    void lines(){
        System.out.println("-------------------------------------------------------------------------");
    }

    void display(){
        lines();
        for(int i=0; i<studentNames.size(); i++){
            System.out.println(studentNames.get(i) + ": " + studentScores.get(i));
        }
        lines();
    }
}

class StudentDataOperations extends StudentData{
    StudentDataOperations(ArrayList<String> names, ArrayList<Integer> scores){
        super(names,scores);
    }

    void searchfor(String name){
        lines();
        if(studentNames.contains(name)){
            for(int i=0; i<studentNames.size(); i++){
                if(studentNames.get(i).equals(name)){
                    System.out.println(studentNames.get(i) + ": " + studentScores.get(i));
                }
            }
        }
        else{
            System.out.println("Student Data not found");
        }
        lines();
    }

    void update(String name, int score){
        lines();
        if(studentNames.contains(name)){
            for(int i=0; i<studentNames.size(); i++){
                if(studentNames.get(i).equals(name)){
                    studentScores.set(i, score);
                    System.out.println("Score changed Successfully.");
                }
            }
        }else{
            System.out.println("Student Data not found");
        }
        lines();

    }

    void remove(String name){
        lines();
        if(studentNames.contains(name)){
            for(int i=0; i<studentNames.size(); i++){
                if(studentNames.get(i).equals(name)){
                    studentNames.remove(name);
                    studentScores.remove(studentScores.get(i));
                    System.out.println("Data deleted successfully.");
                }
            }
        }else{
            System.out.println("Student Data not found");
        }
        lines();
    }

    void doStatistics(){
        int sum=0;
        for(int i : studentScores){
            sum+=i;
        }
        double average = sum/studentScores.size();

        int highest = Collections.max(studentScores);
        int lowest = Collections.min(studentScores);
        lines();
        System.out.println("The Average score: "+average);
        System.out.println("The highest score was "+highest+" scored by "+studentNames.get(studentScores.indexOf(highest)));
        System.out.println("The lowest score was "+lowest+" scored by "+studentNames.get(studentScores.indexOf(lowest)));
        lines();
    }
}

public class ClassManager{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int y,num;
        String x;
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentScores = new ArrayList<>();

        System.out.print("How many students:");
        num=scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<num; i++){
            System.out.print("Enter students name:");
            x=scanner.nextLine();
            System.out.print("Enter " + x+ "'s score:");
            y=scanner.nextInt();

            studentNames.add(x);
            studentScores.add(y);

            scanner.nextLine();
        }

        StudentDataOperations dataOps = new StudentDataOperations(studentNames, studentScores);

        boolean loopControl = false;
        int choice;
        while(!loopControl){
            dataOps.lines();
            System.out.print(
                "1. View all Entered data\n"+
                "2. Search for a student\n"+
                "3. Update a student Grade\n"+
                "4. Delete a students Data\n"+
                "5. View Data Statistics\n"+
                "6. Exit\n"
            );
            dataOps.lines();
            System.out.print("Choose:");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    dataOps.display();
                    break;
                case 2:
                    String name;
                    System.out.print("Enter the name of the student you seek:");
                    name = scanner.nextLine();

                    dataOps.searchfor(name);
                    break;
                case 3:
                    int score;
                    String sName;
                    System.out.print("Enter students name you wish to edit the score:");
                    sName = scanner.nextLine();
                    System.out.print("Enter the new score:");
                    score = scanner.nextInt();

                    dataOps.update(sName,score);
                    break;
                case 4:
                    String rName;
                    System.out.print("You wish to delete(name):");
                    rName = scanner.nextLine();

                    dataOps.remove(rName);
                    break;
                case 5:
                    dataOps.doStatistics();
                    break;
                case 6:
                    loopControl = true;
                    break;
                default:
                    System.out.println("Invalid Entry");
                
            }

        }
        scanner.close();

    }
}

