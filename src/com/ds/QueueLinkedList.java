package com.ds;

public class QueueLinkedList<T> {
	NodeD Front;
	NodeD Rear;
	public QueueLinkedList() {
		Front=null;
		Rear=null;
		
	}
	public void Queue(Object value) {
		NodeD newNode=new NodeD(value, null, null);
		if(Rear==null) {
			Front=newNode;
			Rear=newNode;
		} else {		
			newNode.next=null;
			newNode.previous=Rear;
			Rear.next=newNode;
			Rear=newNode;
		}
		System.out.println("Queued: " + value);
	}
	public T Dequeue() {
		if (Front==null || Rear==null) {
			System.out.println("queue is empty");
			return null;
		}
		T value=(T)Front.value;
		Front=Front.next;
		if (Front!=null) {
		Front.previous=null;
		}
		System.out.println("Dequeued: " + value);		
		return value;	
	}
}
