class DoubleLinkedList{
	
	static class Node{
		int data;
		Node next;
		Node previous;
		Node(int d){
			data = d;
		}
	}
	static Node push(int d,Node head){
		Node new_node = new Node(d);
		new_node.next = head;
		new_node.previous = null;
		if(head!=null){
			head.previous = new_node;
		
			System.out.println(head.data);
		}
			head=new_node;
		return head;
	}
	static void printList(Node head){
			Node last = null;
			System.out.println("Forward direction : ");
		while(head!=null){
			System.out.print(head.data+" ");
			last = head;
			head = head.next;
		}
		
			System.out.println("Backward direction : ");
			while(last!=null){
			System.out.print(last.data+" ");
			head = last;
			last = last.previous;
				
			}
	}
	
	public static void main(String [] args){
		Node head = null;
		head = push(4,head);
		head = push(5,head);
		head = push(3,head);
		head = push(7,head);
		head = push(9,head);
		printList(head);
	}
}