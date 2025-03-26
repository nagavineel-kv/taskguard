package com.authcontrol.taskguard.controller;

import com.authcontrol.taskguard.payload.TaskDto;
import com.authcontrol.taskguard.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    private TaskService taskService;
    //save the task
    @PostMapping("/{userid}/tasks")
    public ResponseEntity<TaskDto> saveTask(
            @PathVariable(name = "userid") long userid,
            @RequestBody TaskDto taskDto
    ){
        return new ResponseEntity<>(taskService.saveTask(userid, taskDto), HttpStatus.CREATED);

    }


    //get all task

    //get individual task

    //delete individual task

}
