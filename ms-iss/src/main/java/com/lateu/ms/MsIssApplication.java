package com.lateu.ms;

import java.awt.image.RescaleOp;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.lateu.ms.DAO.StudentDAO;
import com.lateu.ms.DAO.TrainningDAO;
import com.lateu.ms.entities.Student;
import com.lateu.ms.entities.Trainning;
//@EnableEurekaClient
@SpringBootApplication
public class MsIssApplication implements CommandLineRunner{
	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private TrainningDAO trainningDAO;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(MsIssApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//to expose the id on browser
		repositoryRestConfiguration.exposeIdsFor(Student.class,Trainning.class);
		
		
		Trainning T1=trainningDAO.save(new Trainning(null,"PHP",60,null));
		Trainning T2=trainningDAO.save(new Trainning(null,"JAVA",20,null));
		Trainning T3=trainningDAO.save(new Trainning(null,"RUBY",40,null));
		Trainning T4=trainningDAO.save(new Trainning(null,"NODE-JS",30,null));
		
		int i=1;
		float ct=20;
		Stream.of("TAMO","WILSON","GOE","MARTIN").forEach(firstname->{
			Student p=new Student();
			p.setFirstname(firstname);
			p.setLastname("TOY"+i);
			p.setDOB(new Date());
			p.setTrainning(T2);
			studentDAO.save(p);
		});
		
		
	}

}
