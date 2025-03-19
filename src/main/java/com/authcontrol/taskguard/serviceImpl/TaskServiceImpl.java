package com.authcontrol.taskguard.serviceImpl;

import com.authcontrol.taskguard.entity.Task;
import com.authcontrol.taskguard.entity.Users;
import com.authcontrol.taskguard.payload.TaskDto;
import com.authcontrol.taskguard.repository.TaskRepository;
import com.authcontrol.taskguard.repository.UserRepository;
import com.authcontrol.taskguard.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public TaskDto saveTask(long userid, TaskDto taskDto) {
        Users user = userRepository.findById(userid).get();
        Task task = modelMapper.map(taskDto, Task.class);
        task.setUsers(user);
        //After setting the user we are storing the data in DB
        Task savedTask = taskRepository.save(task);
        return modelMapper.map(savedTask, TaskDto.class);
    }

    @Override
    public List<TaskDto> getAllTasks(long userid) {
        return List.of();
    }
}
