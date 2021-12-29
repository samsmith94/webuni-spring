package hu.webuni.spring.hr.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class CompanyDto {

    @JsonIgnore
    Long id;

    @NotEmpty
    String companyRegistrationNumber;

    @NotEmpty
    String name;

    @NotEmpty
    String address;

    //List<EmployeeDTO> employees;
}
