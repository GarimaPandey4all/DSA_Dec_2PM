package com.brainmentors.dsa.stack;

class Stack {
	
	final int max = 100;
	int top = -1; // stack is empty
	
	int arr[] = new int[max];
	
	boolean push(int value)
	{
		if(top > (max - 1))
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			arr[++top] = value;
			System.out.println(value+" pushed into a stack");
			return true;
		}
	}
	
	int pop()
	{
		if(top < 0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		
		else {
			int value = arr[top--];
			return value;
		}
	}
	
	int peek()
	{
		if(top < 0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		
		else {
			int value = arr[top];
			return value;
		}
	}
}

public class StackWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		
		System.out.println(s.pop()+" Popped value from the stack");
		System.out.println(s.peek()+" Peek value of the stack");

	}

}
