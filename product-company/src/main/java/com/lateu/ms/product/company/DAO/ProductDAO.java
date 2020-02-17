package com.lateu.ms.product.company.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lateu.ms.product.company.entities.Product;

@RepositoryRestResource
public interface ProductDAO extends JpaRepository<Product, Long>{

}
