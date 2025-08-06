package com.store.mosh_store.task.domain;

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
}
