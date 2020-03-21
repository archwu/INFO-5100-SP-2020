public class ReverseHello {
  public static void main(String[] args) {
    rip2(50);
  }

//  public static void rip(int threadNum) {
//    ThreadRipper[] threads = new ThreadRipper[threadNum];
//    Thread[] pool = new Thread[threadNum];
//    for (int i = 0; i < threadNum; i++) {
//      threads[i] = new ThreadRipper(i, 0);
//      pool[i] = new Thread(threads[i]);
//      pool[i].start();
//      threads[i].start();
//    }
//  }

  public static void rip2(int threadNum) {
    ThreadRipper threadRipper = new ThreadRipper(50, 1);
    Thread thread = new Thread(threadRipper);
    thread.start();
//    synchronized (thread) {
//      try {
//        thread.run();
//        thread.join();
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
//    }
  }
}

class ThreadRipper extends Thread {
  private int numberOfThread;
  private int curNum;

  public ThreadRipper(int numberOfThread, int curNum) {
    this.numberOfThread = numberOfThread;
    this.curNum = curNum;
  }

  public void run() {
    if (curNum > 50) {
      return;
    }
    Thread thread = new Thread(new ThreadRipper(50, curNum + 1));
    thread.start();
    try {
      thread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Hello from thread " + curNum);

  }
}