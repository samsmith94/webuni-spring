package hu.webuni.spring.hr.mapper;

import hu.webuni.spring.hr.dto.CompanyDto;
import hu.webuni.spring.hr.model.Company;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    List<CompanyDto> companiesToDtos(List<Company> companies);

    CompanyDto companyToDto(Company company);

    Company dtoToCompany(CompanyDto companyDto);
}
