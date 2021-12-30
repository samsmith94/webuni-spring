package hu.webuni.spring.hr.service;

import hu.webuni.spring.hr.exception.NoDataFoundException;
import hu.webuni.spring.hr.model.Employee;
import hu.webuni.spring.hr.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

public abstract class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    abstract public int getPayRaisePercent(Employee employee);

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        Optional<Employee> employeeFromDb = employeeRepository.findById(id);
        if (employeeFromDb.isPresent()) {
            return employeeFromDb.get();
        } else {
            //throw new EntityNotFoundException();
            throw new NoDataFoundException();
        }
    }

    public Employee createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Optional<Employee> employeeFromDb = employeeRepository.findById(id);
        if (employeeFromDb.isPresent()) {
            Employee _employee = employeeFromDb.get();
            _employee.setName(employee.getName());
            _employee.setRank(employee.getRank());
            _employee.setSalary(employee.getSalary());
            return employeeRepository.save(_employee);
        } else {
            throw new EntityNotFoundException();
        }
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);

    }
}
