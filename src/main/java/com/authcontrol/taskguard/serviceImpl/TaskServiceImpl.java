package com.authcontrol.taskguard.serviceImpl;

import com.authcontrol.taskguard.payload.TaskDto;
import com.authcontrol.taskguard.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TaskDto saveTask(long userid, TaskDto taskDto) {
        return null;
    }

    @Override
    public List<TaskDto> getAllTasks(long userid) {
        return List.of();
    }
}
