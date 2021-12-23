package hu.webuni.spring.hr.config;

import hu.webuni.spring.hr.service.EmployeeService;
import hu.webuni.spring.hr.service.impl.DefaultEmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!smart")
public class EmployeeConfiguration {

    @Bean
    public EmployeeService employeeService() {
        return new DefaultEmployeeService();
    }
}
