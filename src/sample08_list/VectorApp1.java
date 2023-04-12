package sample08_list;

import java.util.ArrayList;
import java.util.Vector;

public class VectorApp1 {

	public static void main(String[] args) {
		VectorSample sample1 = new VectorSample();
		ArrayListSample sample2 = new ArrayListSample();
		
//		sample1.insertNumber();
//		sample2.insertNumber();
		
		Thread t1= new Thread(sample2, "t1");
		Thread t2= new Thread(sample2, "t2");
		Thread t3= new Thread(sample2, "t3");
		Thread t4= new Thread(sample2, "t4");
		Thread t5= new Thread(sample2, "t5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	
	static class VectorSample implements Runnable {				// Runnable (동시에 실행하는)
		Vector<Integer> numbers = new Vector<>();
		
		public void run() {
			for (int i=0; i<1000; i++) {
				System.out.println(Thread.currentThread().getName()+ " -> " + i);
				numbers.add(i);
			}
		}
	}
																// thread-safe , thread-unsafe
	static class ArrayListSample implements Runnable{
		ArrayList<Integer> numbers = new ArrayList<>();
		
		public void run() {
			for (int i=0; i<1000; i++) {
				System.out.println(Thread.currentThread().getName()+ " -> " + i);
//				System.out.println("arraylistample -> " + i);
				numbers.add(i);
			}
		}
	}
}