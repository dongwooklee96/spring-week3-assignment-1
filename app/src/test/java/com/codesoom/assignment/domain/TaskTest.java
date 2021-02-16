package com.codesoom.assignment.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskTest {

    private Task task;

    @BeforeEach
    void setUp() {
        task = new Task();
    }

    @Test
    void getIdTest() {
        task.setId(1L);
        assertThat(task.getId()).isEqualTo(1L);
    }

    @Test
    void setTitleTest() {
        task.setTitle("test");
        assertThat(task.getTitle()).isEqualTo("test");
    }
}
