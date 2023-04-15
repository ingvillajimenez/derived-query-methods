package com.skillsoft.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.skillsoft.springdatajpa.model.Employee;
import com.skillsoft.springdatajpa.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}
	@Bean
	public CommandLineRunner EmployeeDemo(EmployeeRepository employeeRepository){
		return (args) -> {

			// Create Employees
			employeeRepository.save(new Employee("Ryan Sato", "ryan.sato@loonycorn.com"));
			employeeRepository.save(new Employee("Kyra Weiss", "kweiss.diallonics@gmail.com"));

		};
	}
}
