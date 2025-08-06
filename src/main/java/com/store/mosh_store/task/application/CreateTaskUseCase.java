package com.store.mosh_store.task.application;

import com.store.mosh_store.task.domain.Task;
import com.store.mosh_store.task.domain.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskUseCase {
    private final TaskRepository taskRepository;

    @Autowired
    public CreateTaskUseCase(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public void createNewTask(String id, String description, String title){
        Task task = new Task(id, description, title);
        this.taskRepository.add(task);
    }
}
