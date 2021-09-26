package com.tyv.ncc.springjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyv.ncc.springjwt.models.ServiceDetails;
import com.tyv.ncc.springjwt.models.Services;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long> {
	Optional<Services> findById(Long id);
	Optional<Services> findByServiceName(String service_name);
	Optional<Services> findByServiceId(long id);
	Boolean existsByServiceName(String service_name);

	Boolean existsByServiceId(long id);
	
}
