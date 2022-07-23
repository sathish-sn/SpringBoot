package com.example.youtube.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@javax.persistence.Entity
@Table(name="catagories")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Catagory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer catagoryId;
	
	@Column(name="tittle", length=100)
	private String CatagoryTittle;
	
	@Column(name = "description")
	private String catagoryDescription;
	
	@OneToMany(mappedBy = "catagory",cascade = CascadeType.ALL)
	private List<Post> posts = new ArrayList();

	public Catagory(Integer catagoryId, String catagoryTittle, String catagoryDescription) {
		super();
		this.catagoryId = catagoryId;
		CatagoryTittle = catagoryTittle;
		this.catagoryDescription = catagoryDescription;
	}

	
	public Integer getCatagoryId() {
		return catagoryId;
	}
	public void setCatagoryId(Integer catagoryId) {
		this.catagoryId = catagoryId;
	}
	public String getCatagoryTittle() {
		return CatagoryTittle;
	}
	public void setCatagoryTittle(String catagoryTittle) {
		CatagoryTittle = catagoryTittle;
	}
	public String getCatagoryDescription() {
		return catagoryDescription;
	}
	public void setCatagoryDescription(String catagoryDescription) {
		this.catagoryDescription = catagoryDescription;
	}
	
	
	
	

}
