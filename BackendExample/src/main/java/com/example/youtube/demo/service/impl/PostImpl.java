package com.example.youtube.demo.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.youtube.demo.entities.Catagory;
import com.example.youtube.demo.entities.Post;
import com.example.youtube.demo.entities.User;
import com.example.youtube.demo.exception.ResourceNotFoundException;
import com.example.youtube.demo.payload.PostDto;
import com.example.youtube.demo.repository.CatagoryRepo;
import com.example.youtube.demo.repository.PostRepo;
import com.example.youtube.demo.repository.UserRepo;
import com.example.youtube.demo.service.PostService;

@Service
public class PostImpl implements PostService {

	@Autowired
	private PostRepo postRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private CatagoryRepo catagoryRepo;

//---------------------------------------------------------------------------------------------------------------------------------------------------
	@Override
	public PostDto createPost(PostDto postDto, Integer userId, Integer catagoryId) {
		 
		System.out.println("begining arting of creating post");
		User user = this.userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "Id", userId));

		Catagory catagory = this.catagoryRepo.findById(catagoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Catagory", "Id", catagoryId));

		// Post post = this.dtoToPost(postDto);
		Post post = this.modelMapper.map(postDto, Post.class);
		//post.setPostTittle(postDto.getTitle());
		post.setImagename("defualt.png");
		post.setAddedDate(new Date());
		post.setUser(user);
		post.setCatagory(catagory);

		Post savedPost = this.postRepo.save(post);
		System.out.println("end of creatPost");
		return this.postToDto(savedPost);

	}

//---------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public PostDto updatePost(PostDto postDto, Integer postId) {
		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "Id", postId));
		post.setPostTittle(postDto.getTitle());
		post.setContent(postDto.getContent());
		Post updatedPost = this.postRepo.save(post);
		PostDto newDto = this.postToDto(updatedPost);

		return newDto;
	}

//---------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public void deletaPost(Integer postId) {
		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "Id", postId));
		this.postRepo.delete(post);
	}

//---------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public List<PostDto> getAllPost() {
		List<Post> posts = this.postRepo.findAll();
		List<PostDto> postDtos = posts.stream().map(post -> this.postToDto(post)).collect(Collectors.toList());
		return postDtos;
	}

//---------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public PostDto getPostById(Integer postId) {
		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "Id", postId));
		return this.postToDto(post);
	}

//---------------------------------------------------------------------------------------------------------------------------------------------------
	@Override
	public List<PostDto> getPostByUser(Integer userId) 
	{
		User user = this.userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "user", userId));
		List<Post> posts = this.postRepo.findByUser(user);
		List<PostDto> postDtos = posts.stream().map((post) -> this.modelMapper.map(post, PostDto.class))
				.collect(Collectors.toList());
		return postDtos;
	}

//---------------------------------------------------------------------------------------------------------------------------------------------------

	
	
	
	
	
	@Override
	public List<PostDto> getPostByCatagory() {

		return null;
	}

//---------------------------------------------------------------------------------------------------------------------------------------------------

	

//---------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public List<PostDto> searchPost(String keyword) {
		return null;
	}

//---------------------------------------------------------------------------------------------------------------------------------------------------

	public Post dtoToPost(PostDto postDto) {
		Post post = this.modelMapper.map(postDto, Post.class);
		return post;
	}

//---------------------------------------------------------------------------------------------------------------------------------------------------

	public PostDto postToDto(Post post) {
		PostDto postDto = this.modelMapper.map(post, PostDto.class);
		return postDto;
	}

	

//---------------------------------------------------------------------------------------------------------------------------------------------------

}
