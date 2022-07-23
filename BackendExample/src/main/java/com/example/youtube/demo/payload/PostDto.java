package com.example.youtube.demo.payload;

import java.util.Date;

import com.example.youtube.demo.entities.Catagory;
import com.example.youtube.demo.entities.User;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class PostDto {

	private String title;
	private String content;
	private String imagename;
	private Date addedDate;
	private CatagoryDto catagory;
	private UserDto user;
	
	
	
	

//	
//	public PostDto() {
//		
//	}
//	
//	
//	public PostDto(String title, String content) {
//		super();
//		this.title = title;
//		this.content = content;
//	}
//	
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getContent() {
//		return content;
//	}
//	public void setContent(String content) {
//		this.content = content;
//	}
//	

}
