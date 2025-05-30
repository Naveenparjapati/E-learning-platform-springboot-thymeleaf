package org.coderarmy.CoderArmy.repository;

import org.coderarmy.CoderArmy.model.Learner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearnerRepository extends JpaRepository<Learner, Long>{

	boolean existsByMobile(long mobile);

	boolean existsByEmail(String email);

}
