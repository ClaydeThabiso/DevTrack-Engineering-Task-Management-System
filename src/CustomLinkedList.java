
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
    
    public void addLast(Task task)
    {
    	Node newNode= new Node(task);
    	Node current= head;
    	if(head!=null)
    	{
    		while(current.getNext()!=null)
    		{
    			current=current.getNext();
    		}
    		current.setNext(newNode);
    	}
    	else
    	{
    		head=newNode;
    	}
    }
    
    public Task findTask(String id)
    {
    	Node current=head;
    	while(current!=null)
    	{
    		if(current.getData().getId().equalsIgnoreCase(id))
    		{
    			return current.getData();
    		}
    		current=current.getNext();
    	}
		return null;
    }
    
    public void removeFirst()
    {
    	if(head!=null)
    	{
    		head=head.getNext();
    	}
    	
    }
    
    public void removeLast()
    {
    	Node current=head;
    	Node previous=null;
    	
    	if(head!=null)
    	{
    		if (head.getNext() == null) {
    		    head = null;
    		    return;
    		}
    		
    		while(current.getNext()!=null)
    		{
    			previous=current;
    			current=current.getNext();
    			
    		}
    		previous.setNext(null);
    	}
    	else
    	{
    		return;
    	}
    }
    
    public void removeTask(String id) {

        if (head == null) {
            return;
        }

        if (head.getData().getId().equalsIgnoreCase(id)) {
            head = head.getNext();
            return;
        }

        
        Node current = head;
        Node previous = null;
        while (current != null) {

            if (current.getData().getId().equalsIgnoreCase(id)) {

                previous.setNext(current.getNext());

                return;
            }

            
            previous = current;
            current = current.getNext();
        }
    }
    
}
