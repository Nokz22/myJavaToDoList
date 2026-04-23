package service;
import model.Task;
import model.TaskState;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> taskList = new ArrayList<>();
    private int nextId = 1;

    public void addTask(String title, String description) {
        Task task = new Task(nextId, title, description);
        taskList.add(task);
        nextId++;

    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void updateTaskState(int id, TaskState newState) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                task.setTaskState(newState);
                return;
            }
        }
    }

    public void removeTask(int id) {
        for  (Task task : taskList) {
            if (task.getId() == id){
                taskList.remove(task);
                return;
            }
        }
    }
}
