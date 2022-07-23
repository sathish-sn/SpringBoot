package com.example.youtube.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.youtube.demo.entities.Catagory;
import com.example.youtube.demo.entities.Post;
import com.example.youtube.demo.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
	List<Post> findByUser(User user);
	List<Post> findByCatagory(Catagory catagory);
}
