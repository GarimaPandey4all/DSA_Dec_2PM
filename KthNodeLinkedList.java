public class KthNodeLinkedList {
	
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
	
	public static KthNodeLinkedList insert(KthNodeLinkedList list, int data)
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
	
	public static void printList(KthNodeLinkedList list)
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
	
	public static void kthNode(KthNodeLinkedList list, int kth)
	{
		Node p, q;
		
		p = q = list.start;
		
		for(int i = 1; i <= kth; i++)
		{
			q = q.next;
		}
		
		while(q != null)
		{
			p = p.next;
			q = q.next;
		}
		
		System.out.println(p.data);
	}
	
	public static void main(String[] args) {
		
		KthNodeLinkedList list = new KthNodeLinkedList();
		
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 50);
		list = insert(list, 60);
		list = insert(list, 70);
		
		kthNode(list, 3);
		
		printList(list);
		
	}

}
