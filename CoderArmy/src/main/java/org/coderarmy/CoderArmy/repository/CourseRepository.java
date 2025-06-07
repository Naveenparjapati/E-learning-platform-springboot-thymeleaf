package org.coderarmy.CoderArmy.repository;



import java.util.List;

import org.coderarmy.CoderArmy.model.Course;
import org.coderarmy.CoderArmy.model.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{
	
	
	List<Course> findByTutor(Tutor attribute);

}
