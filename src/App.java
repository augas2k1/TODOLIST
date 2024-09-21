import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    private List<String> Tasks;
    private Scanner scanner;
    public App(){
        Tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    private void run(){
        boolean running = true;
        while(running){
            System.out.println("\n ----------------TO DO LIST---------------\n");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. View Task");
            System.out.println("4. Quit");
            System.out.println("\n Enter Choice:  ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                addtask();
                    break;
                case 2:
                deletetask();
                    break;
                case 3:
                viewtask();
                    break;
                case 4:
                running = false;
                break;
                default:
                System.out.println("Invalid Choice");
                    break;
            }


        }
    }
    private void addtask(){
        System.out.println("\nEnter Task:  ");
        String Task = scanner.nextLine();
        Tasks.add(Task);
        System.out.println("Task Added Successfully");
    }
    private void deletetask(){
        System.out.println("\nEnter Task Number to Delete:  ");
        int tasknum = scanner.nextInt();
        scanner.nextLine();
        if(tasknum > 0 && tasknum <= Tasks.size()){
            Tasks.remove(tasknum-1);
            System.out.println("Task deleted Successfully");
        }else{
            System.out.println("Invalid Task Number");
        }
    }
    private void viewtask(){
        if(Tasks.isEmpty()){
            System.out.println("No Task to View");
        }else{
            for(int i=0;i<Tasks.size()-1;i++){
                System.out.println((i+1)+ ". "+ Tasks.get(i));
            }
        }
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run();
    }
}
