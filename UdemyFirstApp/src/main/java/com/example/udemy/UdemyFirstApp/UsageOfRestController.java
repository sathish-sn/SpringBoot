package com.example.udemy.UdemyFirstApp;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsageOfRestController {
	
 @GetMapping("/courses")
 public List<courses> getAllDetails(){
	return Arrays.asList(new courses(2,"SpringBoot","Sathish"), new courses(1,"CoreJava","Manjunath"));
 }
 
 @GetMapping("/courses/1")
 public courses getAllDetails1(){
	return  new courses(2,"CoreJava","Manjunath");
 }
 
}
