package com.example.youtube.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.youtube.demo.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
