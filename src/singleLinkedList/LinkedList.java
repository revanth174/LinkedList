package singleLinkedList;

public class LinkedList {

	public static void main(String args[]) {
		Node head = null;
		head = addElementAtLast(10, head);
		head = addElementAtLast(20, head);
		head = addElementAtLast(30, head);
		head = addElementAtLast(40, head);
		head = addElementAtLast(50, head);
		head = addElementAtLast(60, head);
		head = insertElementAtPos(100, head, 20);
		
		display(head);
		head = addElementAtFront(10, head);
		head = addElementAtFront(20, head);
		head = addElementAtFront(30, head);
		head = addElementAtFront(40, head);
		head = addElementAtFront(50, head);
		head = addElementAtFront(60, head);
		head = addElementAtFront(70, head);

		//head = insertElementAtPos(100, head, 5);
		display(head);
		reverse(head);
	}
	// print list in reverse order 
	private static void reverse(Node head) {
		if(head == null) {
			return;
		}
		Node next = null;
		Node first = head.node;
		head.node = null;
		Node cur = head;
		while(first!=null) {
			next = first.node;
			first.node = cur;
			cur = first;
			first = next;
		}
		display(cur);
		
	}

	// add element at specified position
	private static Node insertElementAtPos(int data, Node head, int position) {
		
		if(position == 1) {
			Node node = new Node();
			node.setData(data);
			node.setNode(head);
			return node;
		} else {
			int count = 1;
			Node cur = head;
			Node prev = null;
			//Node next = cur.node;
			while(count < position && cur!=null ) {
				count++;
				prev = cur;
				cur = cur.node;
			}
			if(cur ==null) {
				System.out.println("worng insertion operation");
			}
			else {
				Node node = getNode();
				node.setData(data);
				prev.setNode(node);
				node.setNode(cur);
				
			}
			return head;
		}
		
	}

	// add element at beginning
	private static Node addElementAtFront(int value, Node head) {

		if (head == null) {
			Node node = new Node();
			node.setData(value);
			return node;
		} else {
			Node node = new Node();
			node.setData(value);
			node.setNode(head);
			return node;
		}

	}

	// print all nodes in linked list
	private static void display(Node head) {

		if (head == null) {
			System.out.println("null");
		} else {
			System.out.print(head.data + "-->");
			display(head.node);
		}

	}

	private static Node addElementAtLast(int i, Node head) {
		if (head == null) {
			Node node = getNode();
			node.setData(i);
			System.out.println("inserted " + i);
			return node;
		} else {
			Node cur = head;
			while (cur.node != null) {
				System.out.println("hh");
				cur = cur.node;
			}
			Node node = getNode();
			node.setData(i);
			cur.setNode(node);
			System.out.println("inserted " + i);
			return head;
		}
	}

	// to get new node with value = 0 and nextNode = null
	private static Node getNode() {
		Node node = new Node();
		return node;
	}

}
