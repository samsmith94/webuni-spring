package hu.webuni.spring.hr.service;

import hu.webuni.spring.hr.model.Company;
import hu.webuni.spring.hr.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompany() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(Long id) {
        Optional<Company> companyFromDb = companyRepository.findById(id);
        if (companyFromDb.isPresent()) {
            return companyFromDb.get();
        } else {
            throw new EntityNotFoundException();
        }
    }

    public Company createEmployee(Company company) {
        companyRepository.save(company);
        return company;
    }

    public Company updateCompany(Long id, Company company) {
        Optional<Company> company1FromDb = companyRepository.findById(id);
        if (company1FromDb.isPresent()) {
            Company _company = company1FromDb.get();
            _company.setCompanyRegistrationNumber(company.getCompanyRegistrationNumber());
            _company.setName(company.getName());
            _company.setAddress(company.getAddress());
            return companyRepository.save(_company);
        } else {
            throw new EntityNotFoundException();
        }
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}
