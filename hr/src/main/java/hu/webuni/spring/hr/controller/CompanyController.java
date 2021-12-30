package hu.webuni.spring.hr.controller;

import hu.webuni.spring.hr.dto.CompanyDto;
import hu.webuni.spring.hr.mapper.CompanyMapper;
import hu.webuni.spring.hr.model.Company;
import hu.webuni.spring.hr.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @Autowired
    CompanyMapper companyMapper;

    @GetMapping
    List<CompanyDto> getAll() {
        List<Company> companies = companyService.getAllCompany();
        return companyMapper.companiesToDtos(companies);
    }

    @GetMapping("/{id}")
    CompanyDto getById(@PathVariable long id) {
        Company company = companyService.getCompanyById(id);
        return companyMapper.companyToDto(company);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    CompanyDto createCompany(@RequestBody CompanyDto companyDto) {
        Company newCompany = companyMapper.dtoToCompany(companyDto);
        companyService.createEmployee(newCompany);
        return companyDto;
    }

    @PutMapping("/{id}")
    CompanyDto updateCompany(@PathVariable long id, @RequestBody CompanyDto companyDto) {
        Company companyToUpdate = companyMapper.dtoToCompany(companyDto);
        companyService.updateCompany(id, companyToUpdate);
        return companyDto;
    }

    @DeleteMapping("/{id}")
    void deleteCompany(@PathVariable long id) {
        companyService.deleteCompany(id);
    }
}
