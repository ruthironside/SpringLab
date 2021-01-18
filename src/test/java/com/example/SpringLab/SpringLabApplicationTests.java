package com.example.SpringLab;

import com.example.SpringLab.models.Employee;
import com.example.SpringLab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee bob = new Employee("Bob", 25, 73878, "bob@employee.com");
		employeeRepository.save(bob);
	}

}
