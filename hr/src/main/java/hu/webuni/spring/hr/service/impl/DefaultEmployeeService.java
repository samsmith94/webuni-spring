package hu.webuni.spring.hr.service.impl;

import hu.webuni.spring.hr.config.HrConfigProperties;
import hu.webuni.spring.hr.model.Employee;
import hu.webuni.spring.hr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultEmployeeService implements EmployeeService {

    @Autowired
    HrConfigProperties config;

    @Override
    public int getPayRaisePercent(Employee employee) {
        //return 5; //ez a hard coded verzió (amikor nem yml-ből töltjük be)

        int payRisePercent = config.getSalary().getDef().getPayrisePercent();
        return payRisePercent;
    }

}
