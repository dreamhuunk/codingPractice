

import java.util.*;
import java.lang.*;
import java.io.*;



class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println("Val : ");
	
		LinkedList linkedList = new LinkedList();
        
        insertAtEnd(linkedList,1);
        insertAtEnd(linkedList,2);
        insertAtEnd(linkedList,3);
        insertAtEnd(linkedList,4);
        
        printList(linkedList);

		
	}
	
	public static <T> LinkedList insertAtEnd(LinkedList list, T data)
	{
	    Node head = list.head;
	    
	    Node node = new Node();
	    
	    node.setData(data);
	    node.setNext(null);
	    
	    if(head == null)
	    {
	        list.head = node;
	    }
	    else
	    {
	        Node curr = list.head;
	        while(curr.getNext()!=null)
	        {
	            curr = curr.getNext();
	        }
	        curr.setNext(node);
	    }
	    
	    return list;
	    
	}
	
	
	public static void printList(LinkedList list)
	{
	    Node curr = list.head;
	   
	   //List is empty
	   
	   if(curr==null)
	   {
	       System.out.println("List is empty");
	   }
	   
	   else
	   {
	       while(curr.getNext() != null)
	       {
	           System.out.println(curr.getData());
	           curr = curr.getNext();
	       }
	   }
	}
	
}

class Node <T> {
    
    T data;
    Node next;
    
    public T getData()
    {
        return this.data;
    }
    
    public void setData(T data)
    {
        this.data = data;
    }
    
    public void setNext(Node next)
    {
        this.next = next;
    }
    
    public Node getNext()
    {
        return this.next;
    }
}

class LinkedList {
    public Node head;
}