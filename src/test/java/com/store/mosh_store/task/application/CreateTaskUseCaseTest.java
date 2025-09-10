package com.store.mosh_store.task.application;

import com.store.mosh_store.database.infrastructure.JSONTaskRepository;
import com.store.mosh_store.task.domain.Task;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CreateTaskUseCaseTest {
    @Mock
    JSONTaskRepository repositoryMock;
    @InjectMocks
    CreateTaskUseCase createTaskUseCase;

    @Test
    void callsRepositoryWithTaskObject() {
        String id = "12";
        String description = "tarea dos";
        String title = "T2";
        Task task = new Task(id, description, title);

        createTaskUseCase.createNewTask(id, description, title);

        verify(repositoryMock).add(task);
    }
}