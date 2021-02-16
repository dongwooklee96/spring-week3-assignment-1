package com.codesoom.assignment.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codesoom.assignment.domain.Task;
import com.codesoom.assignment.domain.TaskRepository;

@Service
public class TaskService {
    final private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public Task getTask(Long id) {
        return taskRepository.find(id);
    }

    public Task createTask(Task source) {
        Task task = new Task();
        task.setTitle(source.getTitle());

        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task source) {
        Task task = taskRepository.find(id);

        task.setTitle(source.getTitle());

        return task;
    }

    public Task deleteTask(Long id) {
        Task task = taskRepository.find(id);
        return taskRepository.remove(task);
    }

}
