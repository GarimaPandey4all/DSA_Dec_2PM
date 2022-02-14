public class MidPointinLinkedList {
	
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
	
	public static MidPointinLinkedList insert(MidPointinLinkedList list, int data)
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
	
	public static void printList(MidPointinLinkedList list)
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
	
	public static void midPoint(MidPointinLinkedList list)
	{
		Node slow = list.start;
		Node fast = list.start;
		
		if(list.start != null)
		{
			while(fast != null && fast.next != null)
			{
				slow = slow.next; // 1 step
				fast = fast.next.next; // 2 steps
			}
			
			System.out.println(slow.data);
		}
	}
	
	public static void main(String[] args) {
		
		MidPointinLinkedList list = new MidPointinLinkedList();
		
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 50);
		list = insert(list, 60);
		list = insert(list, 70);
		
		midPoint(list);
		
		printList(list);
		
	}

}
