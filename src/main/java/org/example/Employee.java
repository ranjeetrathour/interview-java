package org.example;

import java.time.LocalDateTime;

public class Employee {
    private String name;
    private String dept;
    private double salary;
    private LocalDateTime dateTime;

    public Employee(String name, String dept, double salary, LocalDateTime dateTime) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", dateTime=" + dateTime +
                '}';
    }
}
