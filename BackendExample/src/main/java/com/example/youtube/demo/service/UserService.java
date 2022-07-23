package com.example.youtube.demo.service;

import java.util.List;

import com.example.youtube.demo.payload.UserDto;

public interface UserService {
	
	 UserDto createUser(UserDto user);
	 UserDto updateUser(UserDto user, Integer UserId);
	 UserDto getUserById(Integer UserId);
	 List<UserDto> getAllusers();
	 void deleteUser(Integer UserId);

}
