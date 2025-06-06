package org.coderarmy.CoderArmy.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Learner {
	@Id
	@GeneratedValue(generator = "learner_id")
	@SequenceGenerator(name = "learner_id", initialValue = 1, allocationSize = 2)
	private Long id;
	private String name;
	private String email;
	private String password;
	private Long mobile;

	@ManyToMany(fetch = FetchType.EAGER)
	List<Course> courses;
}
