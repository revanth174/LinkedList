package singleLinkedList;

public class CircularLinkedList {
	
	
	public static void main(String args[]) {
		Node last = null;
		last = addElementAtLast(20,last);
		last = addElementAtLast(30, last);
		last = addElementAtLast(40, last);
		last = addElementAtLast(50, last);
		last = addElementAtLast(60, last);
		last = addElementAtLast(70, last);
		display(last);
	}

	private static void display(Node last) {
		
		if(last==null) {
			System.out.println("no data found");
			
		}
		else {
			Node first = last.getNode();
			do {
				System.out.print(first.getData()+"--->");
				first= first.getNode();
			}while(first!=last.getNode());
			
		}
		
	}

	private static Node addElementAtLast(int value, Node last) {
		if(last == null) {
			Node node = getNode();
			node.setData(value);
			node.setNode(node);
			return node;
		} else {
			Node first = last.getNode();
			Node node = getNode();
			node.setData(value);
			last.setNode(node);
			node.setNode(first);
			return node;
		}
	
	}
	
	
	private static Node getNode() {
		Node node = new Node();
		return node;
	}

}
