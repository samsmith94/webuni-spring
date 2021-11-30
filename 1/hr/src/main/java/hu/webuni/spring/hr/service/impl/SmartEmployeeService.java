package hu.webuni.spring.hr.service.impl;

import hu.webuni.spring.hr.model.Employee;
import hu.webuni.spring.hr.service.EmployeeService;
import org.springframework.cglib.core.Local;

import javax.xml.datatype.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class SmartEmployeeService implements EmployeeService {
    @Override
    public int getPayRaisePercent(Employee employee) {
        LocalDateTime now = LocalDateTime.now();

        long years = ChronoUnit.YEARS.between(employee.getFirstWorkingDay(), now);
        long months = ChronoUnit.MONTHS.between(employee.getFirstWorkingDay(), now);

        long totalMonths = years * 12 + months;

        if (totalMonths >= 10 * 12) {
            return 10;
        } else if (5 * 12 < totalMonths && totalMonths < 10 * 12) {
            return 5;
        } else if (2.5 * 12 < totalMonths && totalMonths < 5 * 12) {
            return 2;
        } else {
            return 0;
        }
    }
}
