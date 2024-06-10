package com.involveininnovation.chat.services;

import com.involveininnovation.chat.model.User;
import com.involveininnovation.chat.payloads.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService
{
    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user,Integer userId);

    UserDto getUserById(Integer userId);
    List<UserDto> getAllUsers();

    void deleteUser(Integer userId);
}
