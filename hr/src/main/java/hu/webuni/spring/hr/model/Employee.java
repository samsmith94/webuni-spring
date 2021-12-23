package hu.webuni.spring.hr.model;

import java.time.LocalDateTime;

public class Employee {
    Long id;
    String name;
    String rank;
    int salary;
    LocalDateTime firstWorkingDay;

    public Employee(Long id, String name, String rank, int salary, LocalDateTime firstWorkingDay) {
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
