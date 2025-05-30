package org.coderarmy.CoderArmy.dto;




import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter

public class UserDto {
	
	
	@Size(min = 3, max = 30, message = "* Enter proper Name")
	private String name;
	@NotEmpty(message = "* It is Required")
	@Email(message = "* Enter Proper Email")
	private String email;
	@Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "* Password should contain atleast one uppercase,lowercase,special charecter and number and minimum 8 charecters")
	private String password;
	@Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "* Password should contain atleast one uppercase,lowercase,special charecter and number and minimum 8 charecters")
	private String confirmPassword;
	@DecimalMin(value = "6000000000", message = "* Enter Proper Number")
	@DecimalMax(value = "10000000000", message = "* Enter Proper Number")
	private long mobile;
	@NotNull(message = "* It is required")
	private AccountType type;

}
