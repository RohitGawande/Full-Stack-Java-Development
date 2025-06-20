class MyThread extends Thread {  // Define a thread by extending Thread class.
    @Override
    public void run() {          // Task of the thread.
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread");
        }
    }
}
public class MultiThreadingExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();  // Thread instantiation.
        t.start();                   // Start the thread (calls run() internally).

        // Main thread's task.
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
