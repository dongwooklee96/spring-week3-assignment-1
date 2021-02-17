package com.codesoom.assignment.infra;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;

import com.codesoom.assignment.domain.Task;
import com.codesoom.assignment.domain.TaskRepository;

public interface JpaTaskRepository
    extends TaskRepository, CrudRepository<Task, Long> {

    @Override
    List<Task> findAll();

    @Override
    Optional<Task> findById(Long id);

    @Override
    Task save(Task task);

    @Override
    void delete(Task task);
}

