package hu.webuni.spring.hr;

import hu.webuni.spring.hr.model.Employee;
import hu.webuni.spring.hr.service.EmployeeService;
import hu.webuni.spring.hr.service.SalaryService;
import hu.webuni.spring.hr.service.impl.DefaultEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.Month;

@SpringBootApplication
public class HrApplication implements CommandLineRunner {

	@Autowired
	SalaryService salaryService;

	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//1, 3, 7, 15
		LocalDateTime joskaFirstDay = LocalDateTime.of(2021, Month.JANUARY, 1, 10, 10, 30);
		Employee joska = new Employee(0L, "József Bajszos", "borbély", 300000, joskaFirstDay);
		System.out.println("Jóska original salary: " + joska.getSalary());
		salaryService.setEmployeeSalary(joska);
		System.out.println("Jóska new salary: " + joska.getSalary());


		LocalDateTime ellaFirstDay = LocalDateTime.of(2019, Month.JANUARY, 1, 10, 10, 30);
		Employee ella = new Employee(1L, "Ella Szalmon", "NÉBIH ellenőr", 150000, ellaFirstDay);

		LocalDateTime arpiFirstDay = LocalDateTime.of(2015, Month.JANUARY, 1, 10, 10, 30);
		Employee arpi = new Employee(2L, "Árpád Nagy", "gyáros", 250000, arpiFirstDay);

		LocalDateTime elekFirstDay = LocalDateTime.of(2005, Month.JANUARY, 1, 10, 10, 30);
		Employee elek = new Employee(3L, "Elek Beviz", "vízműves", 350000, elekFirstDay);

	}

	@Bean
	public EmployeeService employeeService() {
		return new DefaultEmployeeService();
	}
}
