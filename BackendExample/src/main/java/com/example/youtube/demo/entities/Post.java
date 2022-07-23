package com.example.youtube.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.youtube.demo.payload.CatagoryDto;
import com.example.youtube.demo.payload.UserDto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "post")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer postId;

	@Column(name = "post_title")
	private String postTittle;
	
	@Column(name = "content", length = 1000)
	private String Content;

	private String imagename;
	private Date addedDate;

	@ManyToOne
	@JoinColumn(name="category_id")
	private Catagory catagory;
	@ManyToOne
	private User user;

//	public Post() {
//		
//	}
//	
//	
//	public Post(int postId, String postTittle, String content, String imagename, Date addedDate) {
//		super();
//		this.postId = postId;
//		this.postTittle = postTittle;
//		Content = content;
//		this.imagename = imagename;
//		this.addedDate = addedDate;
//	}
//	public int getPostId() {
//		return postId;
//	}
//	public void setPostId(int postId) {
//		this.postId = postId;
//	}
//	public String getPostTittle() {
//		return postTittle;
//	}
//	public void setPostTittle(String postTittle) {
//		this.postTittle = postTittle;
//	}
//	public String getContent() {
//		return Content;
//	}
//	public void setContent(String content) {
//		Content = content;
//	}
//	public String getImagename() {
//		return imagename;
//	}
//	public void setImagename(String imagename) {
//		this.imagename = imagename;
//	}
//	public Date getAddedDate() {
//		return addedDate;
//	}
//	public void setAddedDate(Date addedDate) {
//		this.addedDate = addedDate;
//	}

}
