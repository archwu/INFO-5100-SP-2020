import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

public class SumValue {
  /*generate array of random numbers*/
  static void generateRandomArray(int[] arr) {
    Random r = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = r.nextInt();
    }
  }

  /*get sum of an array using 4 threads*/

  static long sum(int[] arr) {
    long result = 0;
    int len = 1000000;
    Summer[] pool = new Summer[4];
    Thread[] threads = new Thread[4];
    for (int i = 0; i < 4; i++) {
      pool[i] = new Summer(i * len, Math.min((i + 1) * len, arr.length), arr);
      threads[i] = new Thread();
      threads[i].start();
    }
    try {
      for (Thread t : threads) {
        t.join();
      }
    } catch (Exception e) {}
    for (Summer summer: pool) {
      result += summer.getSum();
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = new int[4000000];
    generateRandomArray(arr);
    long sum = sum(arr);
    System.out.println("Sum: " + sum);
  }
}

class Summer extends Thread {
  final private int[] inData;
  final private int minIndex;
  final private int maxIndex;

  public Summer(int minIndex, int maxIndex, int[] inData) {
    this.minIndex = minIndex;
    this.maxIndex = maxIndex;
    this.inData = inData;
  }

  public long getSum(){
    long result = 0;
    for (int i = minIndex; i < maxIndex; i++) {
      result += inData[i];
    }
    return result;
  }
}