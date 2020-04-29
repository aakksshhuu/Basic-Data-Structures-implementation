package singly;

import singly.LinkedList.Node;

class LinkedList
{
	Node head;
	class Node
	{	
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	void insert(int n)            //insert any number at end of list;
	{
		Node newNode = new Node(n);
		if(head == null)
			head = newNode;
		else
		{
			Node last = head;
			while(last.next != null)
				last = last.next;
			last.next = newNode;
		}
	}
	void insert(int num,int c)    // insert number at specific index
	{
		int i=0;
		Node nn=new Node(num);
		Node last=head;
		if(c==1)
		{   
			head=nn;
			nn.next=last;
		}
		else
		{
		while(last.next!=null)
		  {
			i++;
			if(i==c-1)
			{
				nn.next=last.next;
				last.next=nn;
				break;
			}
			last=last.next;
	       }
		}
	}
	void removefirst()             //remove first item of list
	{
		head=head.next;
	}
	
	void removelast()            //remove last item
	{
		Node last=head;
		while(last.next.next!=null)
		  last=last.next;
		last.next=null;
	}
	void removeAt(int d)           //remove item of specific index
	{
		int c=0;
		Node last=head;
		while(last.next!=null)
		{
			c++;
			if(c==d-1)
			{
				last.next=last.next.next;
				
			}
			last=last.next;
		}
		
		
	}
	void removeValue(int d)     // remove a specific value
	{
		Node last;
		last=head;
		
		if(head.data==d)
			head=last.next;
		else
		{
			 while(last.next.data!=d)
				  last=last.next;
			if(last.next.next==null)
				last.next=null;
			else
				last.next=last.next.next;
		}
	}
	 
	
	void reverse()  // reversing the list.
	{
		Node current=head;
		Node prev=null;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		
	}
	
	
	void show()                 //show list items
	{
		Node last = head;
		while(last != null)
		{
			System.out.print(last.data + " ");
			last = last.next;
		}
	}

}



public class singly {
	
public static void main(String[] args) 
{
	
	LinkedList list=new LinkedList();
	list.insert(10);
	list.insert(20);
	list.insert(30);
	list.removefirst();
	list.insert(10);
	list.insert(40);
	list.removelast();
	list.insert(5,1);
	list.removeAt(3);            
	list.removeValue(20);
	list.insert(11);
	list.insert(222);
	list.insert(33);
	list.show();
	System.out.println("");
	list.reverse();
	list.removeValue(11);
	list.show();

	

}

}
