class InsertSortedCircularList{
		 static class Node{
			int data;
			Node next;
		}
		static Node insertNode(int data, Node head){
			Node temp = head;
			Node node = new Node();
			node.data = data;
			node.next = head;
			if(temp == null){
				node.next =node;
				head= node;
			}else if(node.data<=temp.data ){
				while(temp.next!=head)
					temp = temp.next;
				temp.next = node;
				node.next = head;
				head=node;
			}else{
				while(temp.next !=head && temp.next.data < node.data)
					temp =temp.next;
				node.next = temp.next;
				temp.next = node;
			}
			head = node;
			return head;
		}
		static void printList(Node  head){
			Node temp=head;
			if(head == null){
				System.out.println("No Elements");
			}else{
			do{
					System.out.print(temp.data+" ");
					temp = temp.next;
				}while(temp !=head);
			}
			
		}
		public static void main(String [] args){
			Node head = null;
			head = insertNode(4,head);
			head = insertNode(11,head);
			head = insertNode(9,head);
			head = insertNode(7,head);
			head = insertNode(3,head);
			printList(head);
		}
}