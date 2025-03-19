package com.authcontrol.taskguard.service;

import com.authcontrol.taskguard.payload.TaskDto;

import java.util.List;

public interface TaskService {

    public TaskDto saveTask(long userid, TaskDto taskDto);
    public List<TaskDto> getAllTasks(long userid);
}
