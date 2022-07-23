package com.example.youtube.demo.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.support.MethodArgumentNotValidException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.youtube.demo.payload.ApiResponse;

@RestControllerAdvice
public class GloablalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		String message = ex.getMessage();
	 	ApiResponse apiResponse = new ApiResponse(message,false);
		return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	 public ResponseEntity<Map<String, String >> handleMethodArgsNotValidException(MethodArgumentNotValidException ex){
		// String message = ex.getMessage();
		 Map<String,String> resp= new HashMap<>();
		 
		 ex.getBindingResult().getAllErrors().forEach((error)->{
			 String fieldName = ((FieldError)error).getField();
			 String message = error.getDefaultMessage();
			 resp.put(fieldName, message);
		 });
		 
		 return new ResponseEntity<Map<String, String >>(resp,HttpStatus.BAD_REQUEST);
		 
	 }
}
