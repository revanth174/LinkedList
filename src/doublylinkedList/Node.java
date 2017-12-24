package doublylinkedList;

public class Node {
	
	private int value;
	private Node llink;
	private Node rlink;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getLlink() {
		return llink;
	}
	public void setLlink(Node llink) {
		this.llink = llink;
	}
	public Node getRlink() {
		return rlink;
	}
	public void setRlink(Node rlink) {
		this.rlink = rlink;
	}

}
