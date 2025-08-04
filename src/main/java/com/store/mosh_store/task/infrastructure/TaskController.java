package com.store.mosh_store.task.infrastructure;

import com.store.mosh_store.task.application.CreateTaskUseCase;
import com.store.mosh_store.task.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    private CreateTaskUseCase createTaskUseCase;

    @Autowired
    public TaskController(CreateTaskUseCase createTaskUseCase){
        this.createTaskUseCase = createTaskUseCase;
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createTask(@RequestBody Task task){
        this.createTaskUseCase.createNewTask(task);
    }
}
