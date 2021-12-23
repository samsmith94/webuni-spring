package hu.webuni.spring.hr.controller;

import hu.webuni.spring.hr.dto.EmployeeDTO;
import hu.webuni.spring.hr.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    /*
    @GetMapping()
    public List<EmployeeDTO> getAll() {

    }

    @GetMapping("/{id}")
    public EmployeeDTO getById(@PathVariable long id) {

    }

    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {

    }

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable long id, @RequestBody EmployeeDTO employeeDTO) {

    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable long id) {

    }
    */
}
