package hu.webuni.spring.hr.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;


public class EmployeeDTO {
    Long id;
    String name;
    String rank;
    int salary;

    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")
    LocalDateTime firstWorkingDay;

    public EmployeeDTO(Long id, String name, String rank, int salary, LocalDateTime firstWorkingDay) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.salary = salary;
        this.firstWorkingDay = firstWorkingDay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDateTime getFirstWorkingDay() {
        return firstWorkingDay;
    }

    public void setFirstWorkingDay(LocalDateTime firstWorkingDay) {
        this.firstWorkingDay = firstWorkingDay;
    }
}
