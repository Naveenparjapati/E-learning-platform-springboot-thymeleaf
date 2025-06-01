package org.coderarmy.CoderArmy.repository;

import org.coderarmy.CoderArmy.model.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor,Long >{

	boolean existsByMobile(long mobile);

	boolean existsByEmail(String email);

	Tutor findByEmail(String email);



}
