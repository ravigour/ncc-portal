package com.tyv.ncc.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyv.ncc.springjwt.models.ServiceDetails;

import java.util.Optional;

@Repository
public interface ServiceDetailsRepository extends JpaRepository<ServiceDetails, Long> {
    Optional<ServiceDetails> findById(Long id);
    
}