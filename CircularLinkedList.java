class CircularLinkedList{
	static class Node{
		int data;
		Node next;
	};
	static Node push(Node head_ref,int data){
			Node temp = head_ref;
			Node node = new Node();
			node.data = data;
			node.next = head_ref;
			if(head_ref !=null){
				while(temp.next!=head_ref ){
					temp = temp.next;
				}
				temp.next = node;
			}else{
				node.next = node;
	}
	head_ref = node;
	return head_ref;
	}
	static void printList(Node head){
		Node temp = head;
		if(head!=null){
			do{
				System.out.print("  "+temp.data);
				System.out.print(" -> ");
				temp = temp.next;
			}while(temp!=head );
			System.out.print("NULL");
		}
	}
	public static void main(String [] args){
		Node head =null ;
		head = push(head,2);
		head =push(head,5);
		head= push(head,8);
		head=push(head,6);
		head=push(head,7);
		head=push(head,1);
		System.out.println("Circular Linked List is: ");
		printList(head);
		System.out.println();
	}
}