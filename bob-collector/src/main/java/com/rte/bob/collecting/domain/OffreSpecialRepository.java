package com.rte.bob.collecting.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffreSpecialRepository extends JpaRepository<OffreSpeciale, Long> {
	

}
