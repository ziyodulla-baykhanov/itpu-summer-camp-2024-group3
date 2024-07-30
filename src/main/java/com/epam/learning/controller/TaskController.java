package com.epam.learning.controller;

import com.epam.learning.dto.TaskDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/task")
@Api(tags = "Task Endpoints")
public interface TaskController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create Task")
    ResponseEntity<TaskDto> createTask(@RequestBody TaskDto taskDto);

    @PutMapping("/{id}")
    @ApiOperation("Update Task")
    ResponseEntity<TaskDto> updateTask(
            @ApiParam(name = "id", value = "Task ID", required = true, example = "1")
            @PathVariable Integer id,
            @RequestBody TaskDto taskDto);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation("Delete Task by id")
    @ApiParam(name = "id", value = "Task ID", required = true, example = "1")
    ResponseEntity<String> deleteTask(@PathVariable Integer id);

    @GetMapping("/{id}")
    @ApiOperation("Get Task by id")
    @ApiParam(name = "id", value = "Task ID", required = true, example = "1")
    ResponseEntity<TaskDto> getTask(@PathVariable Integer id);

    @GetMapping
    @ApiOperation("Get list of all Tasks")
    ResponseEntity<List<TaskDto>> getAllTask();
}
