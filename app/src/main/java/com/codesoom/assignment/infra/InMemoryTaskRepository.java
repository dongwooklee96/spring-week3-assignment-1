package com.codesoom.assignment.infra;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.codesoom.assignment.domain.Task;
import com.codesoom.assignment.domain.TaskRepository;

@Repository
@Primary
public class InMemoryTaskRepository implements TaskRepository {
    private List<Task> tasks = new ArrayList<>();
    private Long newId = 0L;

    @Override
    public List<Task> findAll() {
        return tasks;
    }

    @Override
    public Optional<Task> findById(Long id) {
        return tasks.stream()
            .filter(task -> task.getId().equals(id))
            .findFirst();
    }

    @Override
    public Task save(Task task) {
        task.setId(generateId());

        tasks.add(task);

        return task;
    }
    @Override
    public void delete(Task task) {
        tasks.remove(task);
    }

    public Long generateId() {
        newId += 1;
        return newId;
    }
}
