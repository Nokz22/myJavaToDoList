import service.TaskService;
import ui.TaskUI;

import java.util.Scanner;

public class Main {


     public static  void main(String[] args) {

        TaskService taskService = new TaskService();
        TaskUI taskUI = new TaskUI(taskService,new Scanner(System.in));
        taskUI.start();

     }

}