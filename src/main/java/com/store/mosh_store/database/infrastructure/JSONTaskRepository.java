package com.store.mosh_store.database.infrastructure;

import com.store.mosh_store.task.domain.Task;
import com.store.mosh_store.task.domain.TaskRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class JSONTaskRepository implements TaskRepository {
    Map<String, Task> storage = new ConcurrentHashMap<>();

    @Override
    public void add(Task task) {
        storage.put(task.getId(), task);
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public Task getByID(String id) {
        return null;
    }

    @Override
    public List<Task> getAll() {
        return List.of();
    }

    @Override
    public void remove(String id) {

    }
}
