
public class Node {
	private Task data;
	private Node next;
	
	public Node(Task data) {
	    this.data = data;
	}
	/**
	 * @return the data
	 */
	public Task getData() {
		return data;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
}
