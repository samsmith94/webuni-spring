package hu.webuni.spring.hr.controller;

import hu.webuni.spring.hr.dto.EmployeeDTO;
import hu.webuni.spring.hr.mapper.EmployeeMapper;
import hu.webuni.spring.hr.model.Employee;
import hu.webuni.spring.hr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping()
    public List<EmployeeDTO> getAll() {
        List<Employee> employees = employeeService.getAllEmployee();
        return employeeMapper.employeesToDtos(employees);
    }

    @GetMapping("/{id}")
    public EmployeeDTO getById(@PathVariable long id) {
        //return this.employees.get((int)id);
        Employee employee = employeeService.getEmployeeById(id);
        return employeeMapper.employeeToDto(employee);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        Employee newEmployee = employeeMapper.dtoToEmployee(employeeDTO);
        employeeService.createEmployee(newEmployee);
        return employeeDTO;
    }

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable long id, @RequestBody EmployeeDTO employeeDTO) {
        Employee employee = employeeMapper.dtoToEmployee(employeeDTO);
        employeeService.updateEmployee(id, employee);
        return employeeDTO;
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable long id) {

        employeeService.deleteEmployee(id);
    }
}
