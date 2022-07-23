package com.example.youtube.demo.payload;

public class CatagoryDto {
	
	private Integer catagoryId;
	private String CatagoryTittle;
	private String catagoryDescription;
	
	public CatagoryDto() {
		
	}
	
	
	public CatagoryDto(Integer catagoryId, String catagoryTittle, String catagoryDescription) {
		super();
		this.catagoryId = catagoryId;
		this.CatagoryTittle = catagoryTittle;
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
