package com.epam.learning.controller;

import com.epam.learning.dto.UserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@Api(tags = "User Endpoints")
public interface UserController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create User")
    ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto);

    @PutMapping("/{id}")
    @ApiOperation("Update User by id")
    ResponseEntity<UserDto> updateUser(
            @ApiParam(name = "id", value = "User ID", required = true, example = "1")
            @PathVariable Integer id,
            @RequestBody UserDto userDto);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation("Delete User by id")
    @ApiParam(name = "id", value = "User ID", required = true, example = "1")
    ResponseEntity<String> deleteUser(@PathVariable Integer id);

}
