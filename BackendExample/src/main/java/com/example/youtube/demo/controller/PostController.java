package com.example.youtube.demo.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.youtube.demo.payload.ApiResponse;
import com.example.youtube.demo.payload.PostDto;
import com.example.youtube.demo.service.PostService;

@RestController
@RequestMapping("/api/")
public class PostController {

	@Autowired
	private PostService postService;
	private PostDto postDto;

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
//create 
	@PostMapping("/users/{userId}/catagory/{catagoryId}/posts")
	public ResponseEntity<PostDto> createPost(@RequestBody PostDto postdto, @PathVariable Integer userId,
			@PathVariable Integer catagoryId) {
		PostDto CreatPost = this.postService.createPost(postdto, userId, catagoryId);

		return new ResponseEntity<PostDto>(CreatPost, HttpStatus.CREATED);
	}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// get by userId
		@GetMapping("/user/{userId}/posts")
		public ResponseEntity<List<PostDto>> getPostByUser(@PathVariable Integer userId) {

			List<PostDto> posts = this.postService.getPostByUser(userId);

			return new ResponseEntity<List<PostDto>>(posts,HttpStatus.OK);

		}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// get by category
	@GetMapping("/category/{categoryId}/posts")
	public ResponseEntity<List<PostDto>> getPostsByCategory(@PathVariable Integer categoryId) {

		List<PostDto> posts = this.postService.getPostByCatagory();

		return new ResponseEntity<List<PostDto>>(posts, HttpStatus.OK);

	}
	
	
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


	// get all posts
	@GetMapping("/posts")
	public ResponseEntity<List<PostDto>> getAllPosts(
			@RequestParam(value = "pageNumber", defaultValue = "1", required = false) Integer pageNumber,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize) {

		List<PostDto> allpost = this.postService.getAllPost();

		return new ResponseEntity<List<PostDto>>(allpost, HttpStatus.OK);

	}
	
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


	// get single post by id

	@GetMapping("/posts/{postId}")
	public ResponseEntity<PostDto> getPostById(@PathVariable Integer postId) {

		PostDto postDto = this.postService.getPostById(postId);
		return new ResponseEntity<PostDto>(postDto, HttpStatus.OK);

	}

	
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// Delete Post by Id
	@DeleteMapping("/posts/{postId}")
	public ApiResponse deletaPost(@PathVariable Integer postId) {
		this.postService.deletaPost(postId);
		return new ApiResponse("Post sucessfully deleted", true);
	}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// Update Post By id
	@PutMapping("/posts/{postId}")
	public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto, @PathVariable Integer postId) {

		PostDto updatePost = this.postService.updatePost(postDto, postId);
		return new ResponseEntity<PostDto>(updatePost, HttpStatus.OK);

	}
	
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


	@GetMapping("/posts/search/{keywords}")
	public ResponseEntity<List<PostDto>> searchPostByTitle(@PathVariable("keywords") String keywords) {

		List<PostDto> result = this.postService.searchPost(keywords);

		return new ResponseEntity<List<PostDto>>(result, HttpStatus.OK);

	}

}
