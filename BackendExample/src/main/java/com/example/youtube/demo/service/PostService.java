package com.example.youtube.demo.service;

import java.util.List;

import com.example.youtube.demo.entities.Post;
import com.example.youtube.demo.payload.PostDto;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto , Integer userId, Integer catagoryId);

	// Update
	PostDto updatePost(PostDto postDto, Integer postId);

	// delete
	void deletaPost(Integer postId);

	// get all posts
	List<PostDto> getAllPost();

	// get single post
	PostDto getPostById(Integer postId);

	// get all post by catagory
	List<PostDto> getPostByCatagory();

	// get all posts by user
	List<PostDto> getPostByUser(Integer userId);
	
	//search posts
	List<PostDto> searchPost(String keyword);


	

}
