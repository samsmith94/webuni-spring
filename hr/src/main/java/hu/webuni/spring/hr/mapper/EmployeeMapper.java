package hu.webuni.spring.hr.mapper;

import hu.webuni.spring.hr.dto.EmployeeDTO;
import hu.webuni.spring.hr.model.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    List<EmployeeDTO> employeesToDtos(List<Employee> employees);

    EmployeeDTO employeeToDto(Employee employee);

    Employee dtoToEmployee(EmployeeDTO employeeDTO);
}
