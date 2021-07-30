package com.dmitrydunai;

public class Task {
    private final String taskName;
    private boolean taskStatus;
    private final int taskId;

    public Task(String taskName, boolean taskStatus, int taskId) {
        this.taskName = taskName;
        this.taskStatus = taskStatus;
        this.taskId = taskId;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    public boolean isTaskStatus() {
        return taskStatus;
    }

    @Override
    public String toString() {
        return taskId + "." + taskName;
    }
}