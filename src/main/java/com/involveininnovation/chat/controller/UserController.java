package com.involveininnovation.chat.controller;

import com.involveininnovation.chat.model.User;
import com.involveininnovation.chat.payloads.UserDto;
import com.involveininnovation.chat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController
{
    @Autowired
    private UserService userService;

    //Post-create user
    
    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto)
    {
        UserDto createdUserDto = this.userService.createUser(userDto);
        return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);
    }

    //put - update user
    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,@PathVariable("userId") Integer uid)
    {
        UserDto updateUserDto = this.userService.updateUser(userDto,uid);
        return ResponseEntity.ok(updateUserDto);
    }

    //DELETE delete user
    @DeleteMapping("/{userId}")
    public ResponseEntity<Map> deleteUser(@PathVariable("userId") Integer uid)
    {
        this.userService.deleteUser(uid);
        return new ResponseEntity(Map.of("message","User Deleted Successfully"),HttpStatus.OK);
    }
    //Get - user get

    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getAllusers()
    {
        return ResponseEntity.ok(this.userService.getAllUsers());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getuser(@PathVariable("userId") Integer uid)
    {
        return ResponseEntity.ok(this.userService.getUserById(uid));
    }
}
