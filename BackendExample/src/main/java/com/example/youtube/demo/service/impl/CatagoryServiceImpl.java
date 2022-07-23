package com.example.youtube.demo.service.impl;

import java.text.Collator;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.youtube.demo.entities.Catagory;
import com.example.youtube.demo.exception.ResourceNotFoundException;
import com.example.youtube.demo.payload.CatagoryDto;
import com.example.youtube.demo.repository.CatagoryRepo;
import com.example.youtube.demo.service.CatagoryService;


@Service
public class CatagoryServiceImpl implements CatagoryService {
	@Autowired
	private CatagoryRepo catRepo;
	

	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public CatagoryDto createCatagory(CatagoryDto catDto) {
		Catagory cat = this.dtoToCat(catDto);
		Catagory savedCat = this.catRepo.save(cat);
		return this.catTodto(savedCat);
	}

	@Override
	public CatagoryDto updateCatagory(CatagoryDto catDto, Integer catagoryId) {
		Catagory cat = this.catRepo.findById(catagoryId).orElseThrow(()-> new ResourceNotFoundException("catagory","Id",catagoryId));
		cat.setCatagoryTittle(catDto.getCatagoryTittle());
		cat.setCatagoryDescription(catDto.getCatagoryDescription());
		Catagory updatedCatagory = this.catRepo.save(cat);
		CatagoryDto newDto = this.catTodto(updatedCatagory);
		return newDto;
	}

	@Override
	public void deleteCatagory(Integer catagoryId) {
		Catagory cat = this.catRepo.findById(catagoryId).orElseThrow(()-> new ResourceNotFoundException("catagory","Id",catagoryId)); 
		this.catRepo.delete(cat);
	}

	@Override
	public CatagoryDto getCatagory(Integer catagoryId) {
		Catagory cat = this.catRepo.findById(catagoryId).orElseThrow(()-> new ResourceNotFoundException("catagory","Id",catagoryId)); 
		return this.catTodto(cat);
	}
	
	public Catagory dtoToCat(CatagoryDto catDto) {
		Catagory cat = this.modelMapper.map(catDto, Catagory.class);
		return cat;
		
	}
	public CatagoryDto catTodto(Catagory cat) {
		CatagoryDto catDto = this.modelMapper.map(cat, CatagoryDto.class);
		return catDto;
		
	}

	@Override
	public List<CatagoryDto> getAllCatagories() {
		List<Catagory>  catagories = this.catRepo.findAll();
		List<CatagoryDto> catDto = catagories.stream().map((cat)->this.modelMapper.map(cat, CatagoryDto.class )).collect(Collectors.toList() );
		return catDto;
	}

}
