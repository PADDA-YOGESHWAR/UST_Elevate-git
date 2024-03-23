class Table {
  synchronized void printTable(int n) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(n * i);
      try {
        Thread.sleep(400);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class MyThread1 extends Thread {
  Table obj;

  MyThread1(Table obj1) {
    obj = obj1;
  }

  public void run() {
    obj.printTable(5);
  }
}

class MyThread2 extends Thread {
  Table obj2;

  MyThread2(Table obj3) {
    obj2 = obj3;
  }

  public void run() {
    obj2.printTable(3);
  }
}

public class ThreadSyncJava {
  public static void main(String[] args) {
    Table ob = new Table();

    MyThread1 ob1 = new MyThread1(ob);
    MyThread2 ob2 = new MyThread2(ob);
    ob1.start();
    ob2.start();
  }
}
