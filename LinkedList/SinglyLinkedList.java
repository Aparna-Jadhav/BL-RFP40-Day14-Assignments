

class Node {
    public int data;
    public Node next;
 
    public void displayNodeData() {
        System.out.println("{ " + data + " } ");
    }
}

public class SinglyLinkedList 
{
	public Node head,tail;
	
 
	public boolean isEmpty() {
        return (head == null);
    }
 
    
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
 
    
    public Node deleteFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }
 
    
    public void deleteAfter(Node after) {
        Node temp = head;
        while (temp.next != null && temp.data != after.data) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
    }
 
    
    public void insertLast(int data) {
        Node current = head;
        while (current.next != null) {
            current = current.next; 
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

 
	public void deleteFromEnd() 
	{  
  

        	if(head == null) 
		{  
            		System.out.println("List is empty");  
            		return;  
        	}  
        	else 
		{  

            		if(head != tail ) 
			{  
                		Node current = head;  
    
                		while(current.next != tail) 
				{  
                    			current = current.next;  
                		}  

                		tail = current;  
                		tail.next = null;  
            		}  

            		else 
			{  
                		head = tail = null;  
            		}  
        	}
	}  



	public void printLinkedList() 
	{
        	System.out.println("Printing LinkedList (head --> tail) ");
        	Node current = head;
        	
		while (current != null)
		 {
            		current.displayNodeData();
            		current = current.next;
        	}
        System.out.println();
   	 }
}