package com.ds;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class myQueue {

	public static void main(String[] args) {
		System.out.println("Basic Queue");
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(15);
		q.add(11);
		q.add(10);
		q.add(14);
		System.out.println(q.poll());
		
		System.out.println("Priority Queue");
		PriorityQueue<Integer> qp=new PriorityQueue<Integer>();
		qp.add(15);
		qp.add(11);
		qp.add(10);
		qp.add(14);
		System.out.println(qp.poll());
	}

}
