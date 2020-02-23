package com.lateu.ms.product.company;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.lateu.ms.product.company.DAO.ProductDAO;
import com.lateu.ms.product.company.entities.Product;
@EnableEurekaClient
@SpringBootApplication
public class ProductCompanyApplication implements CommandLineRunner{
    @Autowired
	ProductDAO productDAO;
	public static void main(String[] args) {
		SpringApplication.run(ProductCompanyApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int i=1;
		float ct=20;
		Stream.of("Mangue","Patatoes","Bananas","Cake","Fruit").forEach(description->{
			Product p=new Product();
			p.setCost(ct+50);
			p.setDescription(description);
			productDAO.save(p);
		});
		
	}
}
