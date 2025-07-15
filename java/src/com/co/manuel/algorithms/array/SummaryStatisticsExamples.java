package com.co.manuel.algorithms.array;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Exercise to find count, sum, min, max, average in an array.
 */
public class SummaryStatisticsExamples {

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

  }
}
