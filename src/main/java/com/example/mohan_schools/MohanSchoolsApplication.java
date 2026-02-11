package com.example.mohan_schools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.mohan_schools.repository")
@EntityScan("com.example.mohan_schools.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class MohanSchoolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MohanSchoolsApplication.class, args);
	}

}
