package com.code.employee;

import com.code.employee.audit.AuditorAwareImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//enable the JPA Auditing
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class EmployeeManagementSystemApplication {
	@Bean
	public AuditorAware<String> auditorAware(){
		return new AuditorAwareImpl();
	}
	public static void main(String[] args) {

		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
}
