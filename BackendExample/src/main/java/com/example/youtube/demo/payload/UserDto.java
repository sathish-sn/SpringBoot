package com.example.youtube.demo.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Data
public class UserDto {

	private int id;
	@NotEmpty
	@Size(min = 4, message = "Username must be min of 4 character")
	private String name;
	@Email(message = " Email address is not valid")
	private String email;
	@NotEmpty
	@Size(min = 3, max = 10, message = " password must be of 3 characters and max pf 10 chars ")
	// @Pattern()
	private String password;
	@NotEmpty
	private String about;

}
