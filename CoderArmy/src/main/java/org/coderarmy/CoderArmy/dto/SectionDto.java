package org.coderarmy.CoderArmy.dto;





import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SectionDto {
	@Size(min = 5, max = 100, message = "* Title Should be 5~100 charecters")
	private String title;
	@NotNull(message = "* It is Required")
	private MultipartFile video;
	@NotNull(message = "* It is Required")
	private MultipartFile notes;
	@NotNull(message = "* It is Required")
	private Long courseId;
}
