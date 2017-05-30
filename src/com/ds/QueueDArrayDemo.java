package com.ds;

public class QueueDArrayDemo {

	public static void main(String[] args) {
		QueueDArray<Integer> q= new QueueDArray<Integer>(2);
		
		q.Queue(13);
		q.Queue(21);
		System.out.println("size: " + q.getSize());
		q.Queue(34);
		System.out.println("size: " + q.getSize());
		q.DeQueue();
		System.out.println("size: " + q.getSize());
		q.DeQueue();
		System.out.println("size: " + q.getSize());
		q.DeQueue();
		System.out.println("size: " + q.getSize());
				
		
	}

}
