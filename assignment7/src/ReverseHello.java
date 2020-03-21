public class ReverseHello {
  public static void main(String[] args) {
    rip(50);
  }

  public static void rip(int threadNum) {
    ThreadRipper[] threads = new ThreadRipper[threadNum];
    Thread[] pool = new Thread[threadNum];
    for (int i = 0; i < threadNum; i++) {
      threads[i] = new ThreadRipper(i);
      pool[i] = new Thread(threads[i]);
      pool[i].start();
      threads[i].sayHello();
    }
  }
}

class ThreadRipper extends Thread {
  private int numberOfThread;

  public ThreadRipper(int numberOfThread) {
    this.numberOfThread = numberOfThread;
  }

  public void sayHello() {
    System.out.println("Hello from thread " + numberOfThread);
  }
}