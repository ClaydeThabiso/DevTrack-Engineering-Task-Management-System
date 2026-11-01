
public class CustomLinkedList {
	private Node head;

    public CustomLinkedList() {
        this.head = null;
    }
    
    public void addFirst(Task task)
    {
    	Node newNode= new Node(task);
    	newNode.setNext(head);
    	head=newNode;
    }
    
    public void display()
    {
    	Node current=head;
    	while(current!=null)
    	{
    		System.out.println(current.getData().getId());
    		current=current.getNext();
    	}
    }
}
