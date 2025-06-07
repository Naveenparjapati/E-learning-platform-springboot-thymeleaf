package org.coderarmy.CoderArmy.dto;




import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CourseDto {

	
	@Size(min = 5, max = 100, message = "* Title Should be 5~100 charecters")
	private String title;
	@Size(min = 10, max = 500, message = "* Title Should be 10~500 charecters")
	private String description;
	@NotNull(message = "* Select Any One")
	private boolean paid;
	
	
}
