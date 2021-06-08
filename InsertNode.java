package LinkedList;


class lList{
	Node head;
	static class Node{
		Node next;
		int data;
		Node(int d){
			data=d;
			next=null;
		}
	}
}

public class InsertNode extends lList {
	void insertNodeAtFirst(int ele) {
		//create a new node and call the constructor
		Node newNode =new Node(ele);
		//insert the newNode between head and first Node
		newNode.next = head;
		head=newNode;
	}
	void insertNodeAtLocation(Node after_node,int ele) {
		if(after_node == null) {
			System.out.println("Previous node cannot be empty!!!");
			return;
		}
		Node new_node = new Node(ele);
		new_node.next = after_node.next;
		after_node.next = new_node;
	}
	void insertAtLast(int ele) {
		Node new_node = new Node(ele);

		new_node.next = null;
		if(head == null) {
			head = new_node;
			return;
		}
		Node last = head;
		
		while(last.next!=null) {
			last = last.next; 
		}
		last.next = new_node;
	}
	void traverseList() {
		if(head == null) {
			System.out.println("List is empty insert a element!!!");
			return;
		}
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current= current.next;
		}
	}
	public static void main(String []args) {
		InsertNode n = new InsertNode();
		n.traverseList();
		
		n.insertNodeAtFirst(5);
		n.insertAtLast(3);
		n.insertNodeAtFirst(9);
		n.insertAtLast(4);
		n.insertNodeAtFirst(0);
		n.insertAtLast(1);
		n.insertNodeAtLocation(n.head.next.next, 6);
		
		n.traverseList();
	}
}
