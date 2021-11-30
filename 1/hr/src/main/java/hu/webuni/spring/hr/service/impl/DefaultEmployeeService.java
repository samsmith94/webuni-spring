package hu.webuni.spring.hr.service.impl;

import hu.webuni.spring.hr.model.Employee;
import hu.webuni.spring.hr.service.EmployeeService;

public class DefaultEmployeeService implements EmployeeService {
    @Override
    public int getPayRaisePercent(Employee employee) {
        return 5;
    }
}
