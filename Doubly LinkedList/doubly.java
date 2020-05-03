package doubly;

class Linkedlist{
	
	Node head;
	Node tail;
	
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		
		Node(int d)
		{
			data=d;
			next=null;
			prev=null;
		}
	}
	
	
	void insert(int d)  //insert at end
	{
		Node current=head;
		Node temp=head;
	  Node nn=new Node(d);	
	  if(head==null)
	  {
		  head=nn;
		  tail=nn;
	  }
	  else
	  {
		  while(current.next!=null)
		  {
			  current=current.next;
		  }
		  current.next=nn;
		  nn.prev=current;
	  }
	  tail=nn;

	}
	
	void insertStart(int d) //insert num at starting
	{
		Node current=head;
		Node nn=new Node(d);
		head=nn;
		nn.next=current;
		current.prev=nn;
		
	}
	void insertFStart(int d,int i) //insert num at index from start
	{

		Node current=head;
		
		Node nn=new Node(d);
		int c=1;
		if(i==1)
		{
			nn.next=head;
			head=nn;
			current.prev=nn;
		}
		else
		{
		while(c<i)
		{
			c++;
			if(c<i)
			current=current.next;
			
		}
		
		nn.next=current.next;
		current.next.prev=nn;
		current.next=nn;
		nn.prev=current;
		
		
		
		}
	}
	void insertFEnd(int d,int i)   //insert at index from end
	{
		Node current=head;
		Node nn=new Node(d);
		Node temp=tail;
		int c=1;
		if(i==1)
		{
			nn.prev=tail;
			tail.next=nn;
			tail=nn;
			
		}
		else
		{
			while(c<i)
			{
				c++;
		        temp=temp.prev;
		    }
			nn.next=temp.next;
			temp.next.prev=nn;
			temp.next=nn;
			nn.prev=temp;
		}
	}
	void reverse()  //printing in reverse order
	{
		Node last=tail;
        while(last!=head)
        {
        	System.out.print(last.data + " ");
        	last=last.prev;
        }
        System.out.print(head.data);
	}
	
	void delStart() //delete element from start of list
	{
		Node current=head;
		head=current.next;
		current.next.prev=head;
		
	}
	
	void delLast()    //delete last element
	{
		tail=tail.prev;
		tail.next=null;
	}
	
	void delAt(int i)
	{int length=0;
	
		Node current=head;
	Node temp=head;
		while(temp!=null)
		{
			length++;
			temp=temp.next;
		}
		
		
		
		if(i==1)
		{
			head=current.next;
			current.next.prev=head;
		}
		else if(i==length)
		{
			Node x=tail;
			tail=x.prev;
			x.prev.next=null; 
		}
		else
		{
	       int c=1;
	       while(c<i)
	          {
	        	  current=current.next;
	        	  c++;
	          }
	       current.prev.next=current.next;
	       current.next.prev=current.prev;
	       
		}
	  
	}
	
	
	void show()     //printing the list values
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data + " ");
			current=current.next;
		}
	}
	
}


public class doubly
{	
	public static void main(String[] args)
	{
		Linkedlist list=new Linkedlist();
		list.insert(8);
		list.insert(3);
		list.insert(2);
		list.insert(9);	
		list.insertStart(6);
		list.insertStart(7);	
		list.insertFStart(0,3);
		list.insertFEnd(4,3);		
		list.delStart();
	    list.delLast();
	    list.delAt(3);
	    list.delAt(5);
	    list.show();
	    
	    
	    // the list will print("6 0 3 4")
	    
		
		
	}
}