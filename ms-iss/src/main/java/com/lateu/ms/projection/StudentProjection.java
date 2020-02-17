package com.lateu.ms.projection;

import org.springframework.data.rest.core.config.Projection;

import com.lateu.ms.entities.Student;

@Projection(name = "p",types = Student.class)
public interface StudentProjection {
public String getFirstname();
public String getLastname();
}
