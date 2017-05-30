package com.ds;

public class QueueLinkedListDemo {
	public static void main(String[] args) {
		QueueLinkedList<String> q= new QueueLinkedList<String>();

		q.Queue("Darth");
		q.Queue("Luke");
		q.Queue("Leia");

		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
	}
}
