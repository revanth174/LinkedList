package singleLinkedList;

public class Node {
	
	private int data;
	private Node node;
	
	public Node() {
		node = null;
		data = 0;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

}
