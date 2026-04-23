package model;

public class Task {


//Atributos


    private int id;
    private String title;
    private String description;
    private TaskState taskState;


//Construtor


    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.taskState = TaskState.PENDING; // sempre PENDING ao criar
    }


//Getters


    public int getId(){return id;}
    public String getTitle(){return title;}
    public String getDescription(){return description;}
    public TaskState getTaskState(){return taskState;}


//Setters

    public void setTaskState(TaskState taskState){this.taskState = taskState;}



    @Override
    public String toString() {
        return "[" + id + "] " + title + "| " + description + "| " + taskState;
    }
}
