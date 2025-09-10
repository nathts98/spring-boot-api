package com.store.mosh_store.task.domain;

import java.util.Objects;

public class Task {
    private String id;
    private String title;
    private String description;

    private STATUS status = STATUS.PENDING;

    public Task(String id, String description, String title){
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getId(){
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(title, task.title) && Objects.equals(description, task.description) && status == task.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, status);
    }
}
