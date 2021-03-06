package com.lateu.ms.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lateu.ms.entities.Company;

@RepositoryRestResource
public interface CompanyDAO extends JpaRepository<Company, Long>{

}
