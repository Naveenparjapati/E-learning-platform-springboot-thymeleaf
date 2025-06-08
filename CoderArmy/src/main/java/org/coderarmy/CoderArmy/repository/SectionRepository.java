package org.coderarmy.CoderArmy.repository;

import java.util.List;

import org.coderarmy.CoderArmy.model.Course;
import org.coderarmy.CoderArmy.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SectionRepository extends JpaRepository<Section, Long>{
	
	List<Section> findByCourse(Course course);
}
