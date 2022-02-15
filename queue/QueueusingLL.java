package com.brainmentors.dsa.queue;

class Node 
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class QueueLL {
	Node front, rear;
	
	public QueueLL()
	{
		this.front = this.rear = null;
	}
	
	void enqueue(int data)
	{
		Node temp = new Node(data);
		
		if(this.rear == null)
		{
			this.front = this.rear = temp;
			
			return;
		}
		
		//if queue is not empty
		this.rear.next = temp;
		this.rear = temp;
	}
	
	void dequeue()
	{
		if(this.front == null)
		{
			System.out.println("Queue is empty");
			return;
		}
		
		Node temp = this.front;
		this.front = this.front.next;
		
		if(this.front == null)
		{
			this.rear = null;
		}
	}
}

public class QueueusingLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueLL q = new QueueLL();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.dequeue();
		
		System.out.println("Front value is: "+q.front.data);
		System.out.println("Rear value is: "+q.rear.data);
		

	}

}
