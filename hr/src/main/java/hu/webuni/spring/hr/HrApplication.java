package hu.webuni.spring.hr;

import hu.webuni.spring.hr.model.Employee;
import hu.webuni.spring.hr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		System.out.println("------------------------------");

		LocalDateTime ellaFirstDay = LocalDateTime.of(2019, Month.JANUARY, 1, 10, 10, 30);
		Employee ella = new Employee(1L, "Ella Szalmon", "NÉBIH ellenőr", 150000, ellaFirstDay);
		System.out.println("Ella original salary: " + ella.getSalary());
		salaryService.setEmployeeSalary(ella);
		System.out.println("Ella new salary: " + ella.getSalary());
		System.out.println("------------------------------");

		LocalDateTime arpiFirstDay = LocalDateTime.of(2015, Month.JANUARY, 1, 10, 10, 30);
		Employee arpi = new Employee(2L, "Árpád Nagy", "gyáros", 250000, arpiFirstDay);
		System.out.println("Arpi original salary: " + arpi.getSalary());
		salaryService.setEmployeeSalary(arpi);
		System.out.println("Arpi new salary: " + arpi.getSalary());
		System.out.println("------------------------------");

		LocalDateTime elekFirstDay = LocalDateTime.of(2005, Month.JANUARY, 1, 10, 10, 30);
		Employee elek = new Employee(3L, "Elek Beviz", "vízműves", 350000, elekFirstDay);
		System.out.println("Elek original salary: " + elek.getSalary());
		salaryService.setEmployeeSalary(elek);
		System.out.println("Elek new salary: " + elek.getSalary());
		System.out.println("------------------------------");
	}
}
