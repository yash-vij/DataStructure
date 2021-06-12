class SplitCircularLinkedList{
	static class Node{
		int  data;
		Node next;
	}
	static Node push(Node head_ref, int data){
		Node node = new Node();
		node.data = data;
		node.next = head_ref;
		Node temp = head_ref;
		if(head_ref == null){
			node.next = node;
		}else{
			while(temp.next!=head_ref){
				temp = temp.next;
			}
			temp.next = node;
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
	static int countList(Node head){
		int count=0;
		Node temp = head;
		if(head == null){
			count =0;
		}else{
			do{
				count++;
				temp = temp.next;
			}while(temp!=head);
	}
	return count;
	}
	static void printTwoList(Node head , int l,int r){
		Node left ;
		Node right;
		Node tempLeft = head;
		Node temRight;
		System.out.println("Left most list : ");
		while(l>0){
			System.out.print(head.data+" ");
			head = head.next;
			l--;
		}
		
		tempLeft.next = head;
		System.out.println(" ");
		
		System.out.println("Right most list : ");
		while(head!=tempLeft){
			System.out.print("   "+head.data);
			head = head.next;
		}
	}
	public static void main(String[] args){
		Node head = null;
		head = push(head,40);
		head = push(head,49);
		head = push(head,43);
		head = push(head,5);
		head = push(head,7);
		head = push(head,4);
		printList(head);
		int total = countList(head);
		int left,right;
		if(total%2==0){
			left = total/2;
			right = total - left;
		}else{
			left = total/2 +1;
			right = total - left;
		}
		System.out.println("");
		printTwoList(head,left,right);
	}
}
