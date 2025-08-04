package com.store.mosh_store.task.domain;

import java.util.List;

public interface TaskRepository {

    void add(Task task);
    Task update(Task task);
    Task getByID(String id);
    List<Task> getAll();
    void remove(String id);
}
