package Multithreading1;

import java.util.Iterator;
class MyThread extends Thread{
	
	@Override
	public void run() {
		// Job of Thread
		for (int i = 0; i <11; i++) {
			System.out.println("Child Thread");
		}
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.start();
		for (int i = 0; i <11; i++) {
			System.out.println("Main Thread");
		}
	}

}
