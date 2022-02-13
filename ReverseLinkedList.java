public class ReverseLinkedList {
	
	Node start;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public static ReverseLinkedList insert(ReverseLinkedList list, int data)
	{
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(list.start == null) // list is empty
		{
			list.start = newNode;
		}
		else { // list is not empty
			Node last = list.start;
			
			while(last.next != null)
			{
				last = last.next;
			}
			
			last.next = newNode;
		}
		
		return list;
	}
	
	public static ReverseLinkedList deleteAtPosition(ReverseLinkedList list, int index)
	{
		Node curNode = list.start;
		Node prev = null;
		
//		case 1: index 0
		
		if(index == 0 && curNode != null)
		{
			list.start = curNode.next;
			
			System.out.println(index+" Position element deleted");
			
			return list;
		}
		
//		case 2: index > 0, index < size of LL
		
		int counter = 0;
		
		while(curNode != null)
		{
			if(counter == index)
			{
				prev.next = curNode.next;
				
				System.out.println(index+" Position element deleted");
				break;
				
			}
			else {
				prev = curNode;
				curNode = curNode.next;
				counter++;
			}
		}
		
//		case 3: index > size of LL
		
		if(curNode == null)
		{
			System.out.println(index+" Position element not found");
		}
		
		return list;
	}
	
	public static void printList(ReverseLinkedList list)
	{
		Node curNode = list.start;
		
		System.out.println("Linked List");
		
		while(curNode != null)
		{
			System.out.print(curNode.data+" ");
			
			curNode = curNode.next;
		}
		
		System.out.println();
	}
	
	public static void reverseLinkedList(ReverseLinkedList list)
	{
		Node prevNode, curNode;
//		P		C
//		1 ---> 2 ---> 3 = 321
//		2 ----> 3 		1
//		3 ---> 2 ----> 1
		if(list.start != null)
		{
			prevNode = list.start; // 1
			curNode = list.start.next; // 2
			list.start = list.start.next;
			
		 	prevNode.next = null; // make first node as last node
		 	
		 	while(list.start != null)
		 	{
		 		list.start = list.start.next;
		 		curNode.next = prevNode;
		 		
		 		prevNode = curNode;
		 		curNode = list.start;
		 	}
		 	
		 	list.start = prevNode;
		 	
		 	System.out.println("Successfully Reversed List");
		}
	}
	
	public static void main(String[] args) {
		
		ReverseLinkedList list = new ReverseLinkedList();
		
		list = insert(list, 11);
		list = insert(list, 134);
		list = insert(list, 156);
		list = insert(list, 10);
		list = insert(list, 12);
		
		printList(list);
		
		deleteAtPosition(list, 0);
		
		printList(list);
		
		deleteAtPosition(list, 2);
		
		printList(list);
		
		deleteAtPosition(list, 7);	
	}
}
