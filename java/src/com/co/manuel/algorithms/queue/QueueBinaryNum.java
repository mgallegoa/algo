package com.co.manuel.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBinaryNum {

  public String[] generateBinaryNum(int num) {
    String[] result = new String[num];
    Queue<String> q = new LinkedList<>();
    q.offer("1");
    for (int i = 0; i < num; i++) {
      result[i] = q.poll();
      String n1 = result[i] + "0";
      String n2 = result[i] + "1";
      q.offer(n1);
      q.offer(n2);
    }
    return result;
  }

  public static void main(String[] args) {
    QueueBinaryNum qbn = new QueueBinaryNum();
    int number = 15;
    String[] result = qbn.generateBinaryNum(number);
    System.out.println("Binary number for " + number + " is: " + result[number - 1]);
  }
}
