package hu.webuni.spring.hr.service;

import hu.webuni.spring.hr.model.Employee;
import org.springframework.stereotype.Service;


@Service
public class SalaryService {

    private EmployeeService employeeService;

    public SalaryService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void setEmployeeSalary(Employee employee) {
        int payRaisePercent = this.employeeService.getPayRaisePercent(employee);

        int currentSalary = employee.getSalary();
        int raisedSalary = currentSalary + (int)(currentSalary * payRaisePercent / 100.0);
        employee.setSalary(raisedSalary);
    }
}
