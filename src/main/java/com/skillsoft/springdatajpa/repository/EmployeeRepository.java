package com.skillsoft.springdatajpa.repository;

import com.skillsoft.springdatajpa.model.Employee;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Date;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findByEmail(String email);
    List<Employee> findByName(String name);

    List<Employee> findByNameOrEmail(String name, String email);
    List<Employee> findByNameAndLevel(String name, int level);

    List<Employee> findByNameIs(String name);
    List<Employee> findByNameEquals(String name);

    List<Employee> findByNameIsNot(String name);

    List<Employee> findByNameStartsWith(String prefix);

    List<Employee> findByNameEndingWith(String suffix);

    List<Employee> findByNameIgnoreCase(String name);

    List<Employee> findByNameLike(String pattern);

    Employee findFirstByName(String name);
    Employee findFirstByNameOrderByLevelAsc(String name);

    List<Employee> findByEmailContaining(String infix);

    Employee findFirstByOrderByEmail();
    List<Employee> findByLevelLessThan(int level);
    List<Employee> findByLevelLessThanEqual(int level);

    List<Employee> findByLevelGreaterThan(int level);
    List<Employee> findFirst2ByLevelOrderByBirthDateDesc(int level);

    List<Employee> findByBirthDateBefore(Date before);
    List<Employee> findByBirthDateAfter(Date after);
    List<Employee> findByBirthDateBetween(Date start, Date end);

    Employee findTopByOrderByBirthDateDesc();
}
