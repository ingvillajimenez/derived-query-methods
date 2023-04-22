package com.skillsoft.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.skillsoft.springdatajpa.model.Employee;
import com.skillsoft.springdatajpa.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}
	@Bean
	public CommandLineRunner EmployeeDemo(EmployeeRepository employeeRepository){
		return (args) -> {

			System.out.println("\n************************");
			System.out.println("\nRetrieving Employees by level");

			System.out.println("\nfindByLevelLessThan");
			List<Employee> emps = employeeRepository.findByLevelLessThan(3);
			System.out.println("Returned data: " + emps.toString());

			System.out.println("\nfindByLevelLessThan");
			emps = employeeRepository.findByLevelLessThanEqual(3);
			System.out.println("Returned data: " + emps.toString());

			System.out.println("\nfindByLevelGreaterThan");
			emps = employeeRepository.findByLevelGreaterThan(3);
			System.out.println("Returned data: " + emps.toString());

			System.out.println("\nfindFirst2ByLevelOrderByBirthDateDesc");
			emps = employeeRepository.findFirst2ByLevelOrderByBirthDateDesc(3);
			System.out.println("Returned data: " + emps.toString());


			System.out.println("\n************************");
			System.out.println("\nRetrieving Employees by birth date");

			Date refDate = new SimpleDateFormat("dd/MM/yyyy").parse("08/05/1994");

			System.out.println("\nfindByBirthDateBefore");
			emps = employeeRepository.findByBirthDateBefore(refDate);
			System.out.println("Returned data: " + emps.toString());

			System.out.println("\nfindByBirthDateAfter");
			emps = employeeRepository.findByBirthDateAfter(refDate);
			System.out.println("Returned data: " + emps.toString());

			System.out.println("\nfindByBirthDateBetween");
			Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1988");
			emps = employeeRepository.findByBirthDateBetween(startDate, refDate);
			System.out.println("Returned data: " + emps.toString());

			System.out.println("\nfindTopByOrderByBirthDateDesc");
			Employee emp = employeeRepository.findTopByOrderByBirthDateDesc();
			System.out.println("Returned data: " + emp.toString());

			employeeRepository.findById(5L);
		};
	}
}
