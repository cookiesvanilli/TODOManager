package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;

public class Todos {
    private static final int MAX_TASKS = 7;
    private final ArrayList<String> allTasks;

    public Todos() {
        this.allTasks = new ArrayList<>();
    }

    public void addTask(String task) {
        this.allTasks.add(task);
    }

    public void removeTask(String task) {
        this.allTasks.remove(task);
    }

    private boolean maxNumberOfTasks(String task) {
        if (allTasks.size() < MAX_TASKS) {
            allTasks.add(task);
            return true;
        }
        return false;
    }

    public String getAllTasks() {
        StringBuilder stringBuilder = new StringBuilder();
        Collections.sort(this.allTasks);
        for (String task : this.allTasks
        ) {
            stringBuilder.append(task);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Todos{" +
                "allTasks=" + allTasks +
                '}';
    }

}
