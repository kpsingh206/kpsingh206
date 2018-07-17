package com.one97.testing.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.one97.testing.vo.Employee;
import java.lang.String;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	public List<Employee> findByFirstName(String firstName);
}
