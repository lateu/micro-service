package com.lateu.ms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lateu.ms.entities.Trainning;

@RepositoryRestResource
public interface TrainningDAO extends JpaRepository<Trainning, Long> {

}
