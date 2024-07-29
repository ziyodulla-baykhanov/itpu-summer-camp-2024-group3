package com.epam.learning.controller.impl;

import com.epam.learning.controller.TaskUserController;
import com.epam.learning.dto.TaskUserDto;
import com.epam.learning.service.TaskUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskUserControllerImpl implements TaskUserController {

    private final TaskUserService taskUserService;

    @Override
    public ResponseEntity<String> createTask(TaskUserDto taskUserDto) {
        taskUserDto.setId(null);
        return ResponseEntity.ok(taskUserService.createTask(taskUserDto));
    }

    @Override
    public ResponseEntity<TaskUserDto> updateTask(Integer id, TaskUserDto taskDto) {
        taskUserDto.setId(id);
        return ResponseEntity.ok(taskUserService.updateTask(id, taskUserDto));
    }

    @Override
    public ResponseEntity<String> deleteTask(Integer id) {
        return ResponseEntity.ok(taskUserService.deleteTask(id));
    }

    @Override
    public ResponseEntity<TaskUserDto> getTask(Integer id) {
        return ResponseEntity.ok(taskUserService.getTask(id));
    }

    @Override
    public ResponseEntity<List<TaskUserDto>> getAllTaskByUserId(Integer id); {
        return ResponseEntity.ok(taskUserService.getAllTaskByUserId(id));
    }
}
