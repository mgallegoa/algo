package com.co.manuel.algorithms.challenges;

import java.util.LinkedList;
import java.util.List;

/*
 * Insert an interval in a list of non-overlapping intervals.
 *
 * In a list of non-overlapping intervals, and sorted by the start time,
 * insert a new interval in the valid position, merge all overlapping intervals and 
 * return a list of mutually exclusive intervals.
 *
 * Example:
 * Input : [{1,3},{5,7},{8,10}] and newInterval: {4,9}
 * Output: [{1,3},{4,10}]
 *
 * */
public class InsertInterval {

  private static class Interval {
    public int start;
    public int end;

    public Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }

  public List<Interval> insertInterval(List<Interval> intervals, Interval newInterval) {
    if (intervals == null || intervals.size() == 0) {
      throw new IllegalArgumentException("Expected the intervals list.");
    }

    List<Interval> result = new LinkedList<>();
    int i = 0;
    while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
      result.add(intervals.get(i));
      i++;
    }

    while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
      Interval current = intervals.get(i);
      newInterval.start = Math.min(newInterval.start, current.start);
      newInterval.end = Math.max(newInterval.end, current.end);
      i++;
    }

    result.add(newInterval);

    while (i < intervals.size()) {
      result.add(intervals.get(i));
      i++;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("Exercise Insert Intervals -->");
    InsertInterval ii = new InsertInterval();
    List<Interval> intervals = new LinkedList<>();
    intervals.add(new Interval(1, 3));
    intervals.add(new Interval(5, 7));
    intervals.add(new Interval(8, 10));
    List<Interval> result = ii.insertInterval(intervals, new Interval(4, 9));
    result.stream().forEach(list -> System.out.print("{" + list.start + "," + list.end + "}"));
  }
}
