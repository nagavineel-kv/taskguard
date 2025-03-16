package com.authcontrol.taskguard.repository;

import com.authcontrol.taskguard.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
