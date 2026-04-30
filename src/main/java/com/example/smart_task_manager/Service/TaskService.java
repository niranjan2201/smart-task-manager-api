package com.example.smart_task_manager.Service;

import com.example.smart_task_manager.Entity.Status;
import com.example.smart_task_manager.Entity.Task;
import com.example.smart_task_manager.Repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final AIService aiService;

    public Task createTask(Task task) {
        if (task.getStatus() == null) {
            task.setStatus(Status.PENDING);
        }
        if (task.getDescription() != null) {
            String summary = aiService.generateSummary(task.getDescription());
            task.setDescription(summary);
        }
        return taskRepository.save(task);
    }

    public Task markTaskCompleted(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        task.setStatus(Status.COMPLETED);
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
