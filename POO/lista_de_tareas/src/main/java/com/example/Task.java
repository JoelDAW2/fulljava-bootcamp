package com.example;
import java.util.List;
import java.util.ArrayList;

public class Task {

    enum State {
        completed,
        uncompleted
    }

    private String title;
    private String description;
    private State state;

    public Task(String title, String description, State state)
    {
        this.title = title;
        this.description = description;
        this.state = state;
    }

    // Getters
    public String getTitle()
    {
        return this.title;
    }

    public String getDescription()
    {
        return this.description;
    }

    public State getState()
    {
        return this.state;
    }

    // Setters
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public static void listTasks(List<Task> tasks)
    {
        System.out.println();
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i).getTitle() + " --- " + tasks.get(i).getState());
        }
        System.out.println();
    }

    @Override
    public String toString()
    {
        return "\nTitle: " + title + ", " + "\nDescription: " + description + ", " + "\nstate: " + state; 
    }
}
