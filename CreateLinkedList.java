package LinkedList;
class LinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next = null;
		}
	}
}

public class CreateLinkedList extends LinkedList{
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	public static void main(String []args) {
		CreateLinkedList list = new CreateLinkedList();
		list.head = new Node(5);
		Node second = new Node(6);
		Node third = new Node(7);
		
		list.head.next = second;
		second.next = third;
		
		list.printList();
		
		}
}
