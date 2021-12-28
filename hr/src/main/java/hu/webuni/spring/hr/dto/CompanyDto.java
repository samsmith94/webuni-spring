package hu.webuni.spring.hr.dto;

import java.util.List;

public class CompanyDto {

    Long id;
    String companyRegistrationNumber;
    String name;
    String address;
    List<EmployeeDTO> employees;

    public CompanyDto(Long id, String companyRegistrationNumber, String name, String address, List<EmployeeDTO> employees) {
        this.id = id;
        this.companyRegistrationNumber = companyRegistrationNumber;
        this.name = name;
        this.address = address;
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
        this.companyRegistrationNumber = companyRegistrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<EmployeeDTO> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDTO> employees) {
        this.employees = employees;
    }
}
