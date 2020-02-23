package com.lateu.ms;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.lateu.ms.dao.CompanyDAO;
import com.lateu.ms.entities.Company;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceCompanyApplication implements CommandLineRunner{
	@Autowired
private  CompanyDAO companyDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceCompanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int i=1;
		double ct=20;
		Stream.of("M","P","B","C","F").forEach(description->{
			Company p=new Company();
			p.setPrice(ct+Math.random()*100);
			p.setName(description);
			companyDAO.save(p);
		});
		
		
	}

}
