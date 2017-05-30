package com.ds;

public class QueueArrayDemo {

	public static void main(String[] args) {
		QueueArray<Integer> q= new QueueArray<Integer>(5);
		q.Queue(2);
		q.Queue(3);
		q.Queue(5);
		q.Queue(8);
		q.Queue(13);
		
		System.out.println("dequeue: " + q.DeQueue());
		System.out.println("dequeue: " + q.DeQueue());
		System.out.println("dequeue: " + q.DeQueue());
	}

}
