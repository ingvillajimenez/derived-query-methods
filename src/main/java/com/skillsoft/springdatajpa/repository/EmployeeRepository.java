package com.skillsoft.springdatajpa.repository;

import com.skillsoft.springdatajpa.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
