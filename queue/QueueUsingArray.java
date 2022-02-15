package com.brainmentors.dsa.queue;

class Queue {
	
	int data[];
	int front;
	int rear;
	int size;
	
	Queue(int len)
	{
		data = new int[len];
		front = rear = -1;
		size = 0;
	}
	
	void enqueue(int value)
	{
		if(size == data.length) {
			System.out.println("Queue is Full");
		}
		
		if(size == 0)
		{
			front = 0;
		}
		
		rear++;
		size++;
		
		if(rear == data.length)
		{
			rear = 0;
		}
		
		data[rear] = value;
		
	}
	
	int dequeue()
	{
		if(size == 0)
		{
			System.out.println("Queue is empty");
		}
		
		int temp = data[front];
		front++;
		
		if(front == data.length)
		{
			front = 0;
		}
		
		size--;
		
		if(size == 0)
		{
			front = rear = -1;
		}
		
		return temp;
	}
	
	boolean isEmpty()
	{
		return size == 0;
	}
	
	void print()
	{
		while(!isEmpty())
		{
			System.out.println(dequeue());
		}
	}
}

public class QueueUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue queue = new Queue(5);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.dequeue();

		//queue.print();
		queue.enqueue(10);
	
	}

}
