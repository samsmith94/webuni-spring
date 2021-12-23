package hu.webuni.spring.hr.controller;

import hu.webuni.spring.hr.dto.EmployeeDTO;
import hu.webuni.spring.hr.model.Employee;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private LocalDateTime emp1Date = LocalDateTime.of(2021, Month.JANUARY, 1, 10, 10, 30);
    private EmployeeDTO emp1 = new EmployeeDTO(0L, "Hugyo Zoltán", "proktológus", 350000, emp1Date);

    private LocalDateTime emp2Date = LocalDateTime.of(2008, Month.JULY, 5, 10, 10, 30);
    private EmployeeDTO emp2 = new EmployeeDTO(1L, "Kakadu Péter", "miniszter", 430000, emp2Date);

    private ArrayList<EmployeeDTO> employees = new ArrayList<EmployeeDTO>() {
        {
            add(emp1);
            add(emp2);
        }
    };

    @GetMapping()
    public List<EmployeeDTO> getAll() {
        return this.employees;
    }

    @GetMapping("/{id}")
    public EmployeeDTO getById(@PathVariable long id) {
        return this.employees.get((int)id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {

        this.employees.add(employeeDTO);
        return employeeDTO;
    }

    /*
    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable long id, @RequestBody EmployeeDTO employeeDTO) {


    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable long id) {

    }*/

}
