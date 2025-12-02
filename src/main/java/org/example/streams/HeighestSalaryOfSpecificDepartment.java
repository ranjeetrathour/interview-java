package org.example.streams;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HeighestSalaryOfSpecificDepartment {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Amit Kumar", "HR", 55000, LocalDateTime.now().minusYears(10)));
        employees.add(new Employee("Rohit Sharma", "IT", 75000, LocalDateTime.now().minusDays(5)));
        employees.add(new Employee("Neha Verma", "Finance", 68000, LocalDateTime.now().minusYears(3)));
        employees.add(new Employee("Suresh Singh", "Sales", 52000, LocalDateTime.now().minusYears(20)));
        employees.add(new Employee("Priya Gupta", "Marketing", 60000, LocalDateTime.now().minusDays(7)));
        employees.add(new Employee("Arjun Yadav", "IT", 80000, LocalDateTime.now().minusYears(15)));
        employees.add(new Employee("Karan Malhotra", "HR", 48000, LocalDateTime.now().minusDays(1)));
        employees.add(new Employee("Deepak Joshi", "Finance", 72000, LocalDateTime.now().minusYears(12)));
        employees.add(new Employee("Sneha Kulkarni", "IT", 65000, LocalDateTime.now().minusDays(8)));
        employees.add(new Employee("Rahul Tiwari", "Sales", 56000, LocalDateTime.now().minusDays(18)));
        employees.add(new Employee("Pooja Sharma", "Marketing", 53000, LocalDateTime.now().minusDays(9)));
        employees.add(new Employee("Aditya Kapoor", "Finance", 78000, LocalDateTime.now().minusDays(4)));
        employees.add(new Employee("Sunil Deshmukh", "HR", 50000, LocalDateTime.now().minusDays(11)));
        employees.add(new Employee("Harsh Mehta", "IT", 90000, LocalDateTime.now().minusDays(6)));
        employees.add(new Employee("Komal Jain", "Sales", 47000, LocalDateTime.now().minusDays(2)));

        Employee it = employees.stream().filter(emp -> emp.getDept().equalsIgnoreCase("it")).toList().stream().distinct().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(it);

    }
}
