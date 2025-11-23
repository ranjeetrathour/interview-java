package org.example.streams;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * find the department which hire more employee in last 5 year
 */
public class MostActiveDepartment {
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


        /**
         * filter employee only last 5 year after just grouping by as per dept and their count
         */
        Map<String, Long> departmentCount =
                employees.stream()
                        .filter(e -> e.getDateTime().isAfter(LocalDateTime.now().minusYears(5)))
                        .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

        /**
         * find max count
         */
        Map.Entry<String, Long> mostHiredDepartment =
                departmentCount.entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .get();
        System.out.println("Most Active Department in last 5 years: " + mostHiredDepartment);
    }
}
