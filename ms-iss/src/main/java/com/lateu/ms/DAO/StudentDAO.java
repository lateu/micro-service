package com.lateu.ms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lateu.ms.entities.Student;

@RepositoryRestResource
public interface StudentDAO extends JpaRepository<Student, Long>{

}
