package com.example.youtube.demo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
public class ApiResponse {
	private String message;
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccuss() {
		return succuss;
	}

	public void setSuccuss(boolean succuss) {
		this.succuss = succuss;
	}

	private boolean succuss;

	public ApiResponse() {
		
	}

	public ApiResponse(String message, boolean succuss) {
		super();
		this.message = message;
		this.succuss = succuss;
	}
	
	
	
}
