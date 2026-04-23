package ui;
import model.Task;
import model.TaskState;
import service.TaskService;
import java.util.Scanner;


public class TaskUI {


    private TaskService taskService;
    private Scanner scanner;

    public TaskUI(TaskService taskService, Scanner scanner) {
        this.taskService = taskService;
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        int option = 0;

        while(option!=5){
            showMenu();
            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1 -> addTask();
                case 2 -> listTasks();
                case 3 -> updateTask();
                case 4 -> removeTask();
                case 5 -> System.out.println("See you next time!");
                default -> System.out.println("Invalid option!.");

            }
        }
    }
    private void showMenu() {
        System.out.println("\n=== TO-DO LIST ===");
        System.out.println("1. Add Task");
        System.out.println("2. List tasks");
        System.out.println("3. Update Task State");
        System.out.println("4. Remove Task");
        System.out.println("5. Quit");
        System.out.print("Choose Option: ");
    }

    private void addTask() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        taskService.addTask(title, description);
        System.out.println("Task Added!");
    }

    private void listTasks() {
        for (Task task : taskService.getTaskList()){
            System.out.println(task);
        }
    }

    private void updateTask() {
        System.out.print("Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("1. PENDING");
        System.out.println("2. IN_PROGRESS");
        System.out.println("3. COMPLETED");
        int taskState = Integer.parseInt(scanner.nextLine());
        switch (taskState){
            case 1 -> {
                taskService.updateTaskState(id, TaskState.PENDING);
                System.out.println("Task Updated!");
                }
            case 2 -> {
                taskService.updateTaskState(id, TaskState.IN_PROGRESS);
                System.out.println("Task Updated!");
            }
            case 3 -> {
                taskService.updateTaskState(id, TaskState.COMPLETED);
                System.out.println("Task Updated!");
            }
            default -> System.out.println("Invalid option!.");

        }

    }

    private void removeTask() {
        System.out.print("Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        taskService.removeTask(id);
        System.out.println("Task Removed!");
    }


}
