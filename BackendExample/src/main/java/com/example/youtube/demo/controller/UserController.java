package com.example.youtube.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.youtube.demo.payload.ApiResponse;
import com.example.youtube.demo.payload.UserDto;
import com.example.youtube.demo.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;
	
//----------------------------------------------------------------------------------------------------------------
	// POST create users
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto) {
		UserDto createUserDto = this.userService.createUser(userDto);
		return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
	}

//------------------------------------------------------------------------------------------------------------------	
	// PUT - Update user
	@PutMapping("/{userId}") // @PathVariable("userId") Integer uid
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable Integer userId) {
		UserDto updatedUser = this.userService.updateUser(userDto, userId);
		return ResponseEntity.ok(updatedUser);
	}

//-----------------------------------------------------------------------------------------------------------------
	// DELETE -delete user
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer userId) {
		this.userService.deleteUser(userId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("user id deleted", true), HttpStatus.OK);
	}

//------------------------------------------------------------------------------------------------------------------
	// GET all users
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllusers() {
		return ResponseEntity.ok(this.userService.getAllusers());
	}

//-------------------------------------------------------------------------------------------------------------------
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleuser(@PathVariable Integer userId) {
		return ResponseEntity.ok(this.userService.getUserById(userId));
	}

}
