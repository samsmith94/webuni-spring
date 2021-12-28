package hu.webuni.spring.hr.repository;


import hu.webuni.spring.hr.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
