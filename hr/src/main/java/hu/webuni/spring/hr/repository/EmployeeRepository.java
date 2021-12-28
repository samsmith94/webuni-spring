package hu.webuni.spring.hr.repository;

import hu.webuni.spring.hr.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
