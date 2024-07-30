package com.epam.learning.controller.impl;

import com.epam.learning.controller.UserController;
import com.epam.learning.dto.UserDto;
import com.epam.learning.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserControllerImpl implements UserController {

    private final UserService userService;

    @Override
    public ResponseEntity<UserDto> createUser(UserDto userDto) {
        userDto.setId(null);
        return ResponseEntity.ok(userService.createUser(userDto));
    }

    @Override
    public ResponseEntity<UserDto> updateUser(Integer id, UserDto userDto) {
        userDto.setId(id);
        return ResponseEntity.ok(userService.updateUser(id, userDto));
    }

    @Override
    public ResponseEntity<String> deleteUser(Integer id) {
        return ResponseEntity.ok(userService.deleteUser(id));
    }

}
