package singleLinkedList;

public class MiddleElement {
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		
		Node head = null;
		head = LinkedList.addElementAtFront(20, head);
		head = LinkedList.addElementAtFront(25, head);
		head = LinkedList.addElementAtFront(45, head);
	    head = LinkedList.addElementAtFront(58, head);
	    head = LinkedList.addElementAtFront(95, head);
	    head = LinkedList.addElementAtFront(105, head);
	    head = LinkedList.addElementAtFront(15, head);
	    head = LinkedList.addElementAtFront(54, head);
	    head = LinkedList.addElementAtFront(78, head);
	    
	    
	    LinkedList.display(head);
	    
	    int mid = middleElement(head);
	    System.out.println(mid);
	    
	}

	private static int middleElement(Node head) {
		if(head==null) {
			System.out.println("list is empty");
			return -1;
		}
		int length = 0;
		Node middle = head;
		Node current = head;
		while(current!=null) {
			length++;
			if(length%2==0)
				middle = middle.getNode();
			current = current.getNode();
			
		}
			
		System.out.println(length);
		
		return middle.getData(); 
	}
	
	    

}
