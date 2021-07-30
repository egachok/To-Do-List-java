package com.dmitrydunai;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Task> taskList = new ArrayList<Task>();
        int taskId = 1;
        System.out.println("Available commands:\nadd - to add task,\ndone - to set task as completed,\n" +
                "list - to view all task list,\ndone list - to view completed tasks,\n" +
                "to do list - to view uncompleted tasks,\nstop - to close application\n");
        Task:
        while (true) {
            System.out.println("Enter your choice:");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            switch (choice) {
                case "add":
                    System.out.println("What task you want add to your To-Do List? ");
                    taskList.add(new Task(scanner.nextLine(), false, taskId));
                    taskId++;
                    break;
                case "list":
                    for (Task task : taskList) {
                        System.out.println(task);
                    }
                    break;
                case "done list":
                    for (Task task : taskList) {
                        if (task.isTaskStatus()) {
                            System.out.println(task);
                        }
                    }
                    break;
                case "to do list":
                    for (Task task : taskList) {
                        if (!task.isTaskStatus()) {
                            System.out.println(task);
                        }
                    }
                    break;
                case "done":
                    System.out.println("Enter the number of completed task: ");
                    taskList.get(scanner.nextInt() - 1).setTaskStatus(true);
                    scanner.nextLine();
                    break;
                case "stop":
                    break Task;
                default:
                    System.out.println("Incorrect command");
                    break;
            }
        }
    }
}