package com.example.youtube.demo.service;

import java.util.List;

import com.example.youtube.demo.entities.Catagory;
import com.example.youtube.demo.payload.CatagoryDto;

public interface CatagoryService {
	
	CatagoryDto createCatagory(CatagoryDto catDto);
	CatagoryDto updateCatagory(CatagoryDto catDto, Integer catagoryId);
	 void deleteCatagory(Integer catagoryId);
	 CatagoryDto getCatagory(Integer catagoryId);
	 List<CatagoryDto> getAllCatagories();
	 
	

}
