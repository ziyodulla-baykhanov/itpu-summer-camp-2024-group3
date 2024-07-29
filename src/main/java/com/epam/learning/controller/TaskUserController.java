package com.epam.learning.controller;

import com.epam.learning.dto.TaskUserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/task_user")
@Api(tags = "Task with Users Endpoints")
public interface TaskUserController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create Task with User")
    ResponseEntity<String> createTask(@RequestBody TaskUserDto taskUserDto);

    @PutMapping("/{id}")
    @ApiOperation("Update Task with User by task id")
    ResponseEntity<TaskUserDto> updateTask(
            @ApiParam(name = "id", value = "Task ID", required = true, example = "1")
            @PathVariable Integer id,
            @RequestBody TaskUserDto taskUserDto);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation("Delete Task with User by task id")
    @ApiParam(name = "id", value = "Task ID", required = true, example = "1")
    ResponseEntity<String> deleteTask(@PathVariable Integer id);

    @GetMapping("/{id}")
    @ApiOperation("Get Task with User by task id")
    @ApiParam(name = "id", value = "Task ID", required = true, example = "1")
    ResponseEntity<TaskUserDto> getTask(@PathVariable Integer id);

    @GetMapping("/user/{id}")
    @ApiOperation("Get list of all Tasks for user by user id")
    ResponseEntity<List<TaskUserDto>> getAllTaskByUserId(@PathVariable Integer id);
}
