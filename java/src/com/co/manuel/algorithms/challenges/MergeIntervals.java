package com.co.manuel.algorithms.challenges;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
 * This challenge is to merge the intervals in an array.
 * Given a list of intervals, merge all the overlapping intervals and return a list of non-overlapping intervals.
 *
 * Example:
 * INPUT: intervals = [{2,6},{1,3},{8,10}]
 * OUTPUT: [{1,6},{8,10}]
 */
public class MergeIntervals {

  private static class Interval {
    public int start;
    public int end;

    public Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }

  public List<Interval> mergeIntervals(List<Interval> intervals) {
    if (intervals.size() < 2) {
      return intervals;
    }
    Comparator<Interval> comparatorByStart = (i1, i2) -> Integer.compare(i1.start, i2.start);
    intervals.sort(comparatorByStart);
    List<Interval> result = new LinkedList<>();
    Interval first = intervals.get(0);
    int start = first.start;
    int end = first.end;
    for (int i = 1; i < intervals.size(); i++) {
      Interval current = intervals.get(i);
      if (current.start <= end) {
        end = Math.max(end, current.end);
      } else {
        result.add(new Interval(start, end));
        start = current.start;
        end = current.end;
      }
    }

    result.add(new Interval(start, end));

    return result;

  }

  public static void main(String[] args) {
    System.out.println("Exercise Merge Intervals -->");
    MergeIntervals mi = new MergeIntervals();
    List<Interval> intervals = new LinkedList<>();
    intervals.add(new Interval(2, 6));
    intervals.add(new Interval(1, 3));
    intervals.add(new Interval(8, 10));
    List<Interval> result = mi.mergeIntervals(intervals);
    result.stream().forEach(list -> System.out.print("{" + list.start + "," + list.end + "}"));
  }

}
