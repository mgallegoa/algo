package com.co.manuel.algorithms.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Exercise to find count, sum, min, max, average in an array.
 */
public class SummaryStatisticsExamples {

  protected static class Employee {
    String name;
    String city;
    int salary;

    Employee(String name, String city, int salary) {
      this.name = name;
      this.city = city;
      this.salary = salary;
    }

  }

  public static void main(String[] args) {
    System.out.println("Examples using SummaryStatistics -->");
    List<Integer> numbers = Arrays.asList(3, 2, 6, 7, 5);

    // Collect statistics for: count, sum, min, max, average.
    IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
    System.out.println("Count number is: " + stats.getCount());
    System.out.println("Sum number is: " + stats.getSum());
    System.out.println("Lowest number is: " + stats.getMin());
    System.out.println("Max number is: " + stats.getMax());
    System.out.println("Average number is: " + stats.getAverage());

    System.out.println("");
    System.out.println("Examples custom aggregation using strems and Collectors -->");
    List<Employee> employees = List.of(
        new Employee("Juan", "Medellin", 600),
        new Employee("Maria", "Bogota", 500),
        new Employee("Tom", "Cali", 700),
        new Employee("Luis", "Medellin", 800),
        new Employee("Steph", "Bogota", 300));
    System.out.println("Average salary by city: ");
    Map<String, Double> avgSalaryByCity = employees.stream()
        .collect(
            Collectors.groupingBy(emp -> emp.city, Collectors.averagingInt(emp -> emp.salary)));

    avgSalaryByCity.forEach((dept, avg) -> System.out.println(dept + ": $" + avg));

    System.out.println("");
    System.out.println("Counting by city: ");
    Map<String, Long> countByCity = employees.stream()
        .collect(
            Collectors.groupingBy(
                emp -> emp.city, Collectors.counting()));

    countByCity.forEach((dept, count) -> System.out.println(dept + " = " + count));

    System.out.println("");
    System.out.println("Highest paid employee per City: ");
    Map<String, Optional<Employee>> topEarnedByCity = employees.stream()
        .collect(
            Collectors.groupingBy(
                emp -> emp.city, Collectors.maxBy(Comparator.comparingInt(emp -> emp.salary))));

    topEarnedByCity
        .forEach((dept, emp) -> System.out.println(dept + " = " + emp.get().name));
  }
}
