public class LinkedListMain
{
 
	public static void main(String args[])
	{
        	SinglyLinkedList myLinkedlist = new SinglyLinkedList();
        	myLinkedlist.insertFirst(56);
        	myLinkedlist.insertFirst(30);
        	myLinkedlist.insertFirst(70);
        	
		myLinkedlist.deleteFirst();
		myLinkedlist.deleteFromEnd();
		
        	myLinkedlist.insertLast(40);
		
               	Node node=new Node();
        	node.data=1;
		
        	myLinkedlist.deleteAfter(node);
        
        	myLinkedlist.printLinkedList();
    	}
}