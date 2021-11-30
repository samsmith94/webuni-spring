package hu.webuni.spring.hr.service;

import hu.webuni.spring.hr.model.Employee;
import hu.webuni.spring.hr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
public class SalaryService {

    private EmployeeService employeeService;

    public SalaryService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void setEmployeeSalary(Employee employee) {
        int payRaisePercent = this.employeeService.getPayRaisePercent(employee);

        int currentSalary = employee.getSalary();
        int raisedSalary = (int)(currentSalary * payRaisePercent / 100.0);
        employee.setSalary(raisedSalary);
    }
}
