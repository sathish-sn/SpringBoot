package com.example.youtube.demo.controller;

import java.util.List;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.RestController;

import com.example.youtube.demo.payload.ApiResponse;
import com.example.youtube.demo.payload.CatagoryDto;
import com.example.youtube.demo.service.CatagoryService;

@RestController
@RequestMapping("/api/catagory")
public class catagoryController {
	
	@Autowired
	private CatagoryService catService;

	
//--------------------------------------------------------------------------------------------------------------------------
	@PostMapping("/")
	public ResponseEntity<CatagoryDto> createCatagory(@Valid @RequestBody CatagoryDto catDto)
	{
		CatagoryDto createCatDto = this.catService.createCatagory(catDto);
		return new ResponseEntity<>(createCatDto,HttpStatus.CREATED);
	}
	
//----------------------------------------------------------------------------------------------------------------------------
	@PutMapping("/{catId}")
	public ResponseEntity<CatagoryDto> updateCatagory(@Valid @RequestBody CatagoryDto catDto ,@PathVariable Integer catId)
	{
		CatagoryDto updatecatagory = this.catService.updateCatagory(catDto,catId);
		return  ResponseEntity.ok(updatecatagory);	
	}
	
//-----------------------------------------------------------------------------------------------------------------------------
	@DeleteMapping("/{catId}")
	public ResponseEntity<ApiResponse> deleteCatagoryser(@PathVariable Integer catId)
	{
		this.catService.deleteCatagory(catId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("user id deleted",true),HttpStatus.OK);
	}
//-----------------------------------------------------------------------------------------------------------------------------
	// GET all users
		@GetMapping("/{catId}")
		public ResponseEntity<CatagoryDto> getCatagory(@PathVariable Integer catId ) 
		{
			return ResponseEntity.ok(this.catService.getCatagory(catId));
		}
		
		@GetMapping("/")
		public ResponseEntity<List<CatagoryDto>> getAllCatagories( ) 
		{
			return ResponseEntity.ok(this.catService.getAllCatagories());
		}

}
	

