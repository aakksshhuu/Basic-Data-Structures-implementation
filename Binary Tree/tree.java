package tree;
import java.util.*;
import java.lang.*;
class binarysearchTrees
{
	node root;
	
	class node
	{
		int data;
		node left;
		node right;
		
	  node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}

	
	void insert(int arr[],int n)
	{
	  root = levelorder(root,arr,0,n);  
	}
	
	node levelorder(node root,int arr[],int i,int n)
	{
		if(i<n)
		{
			node nn=new node(arr[i]);
			root=nn;
			root.left=levelorder(root.left,arr,2*i+1,n);
			root.right=levelorder(root.right,arr,2*i+2,n);
		}
		return root;
	}
	
	
	
	void inorder()
	{
		System.out.print("In ");
	   printin(root);
	   System.out.println("");
		
	}
	void printin(node root)
	{
	
		if(root==null)
		{
			
			return;
		}
		else
		{
			printin(root.left);
			System.out.print(root.data + " ");
			printin(root.right);
		}
	}
	
	void preorder()
	{
		System.out.print("pre ");
		printpre(root);
		System.out.println("");
	}
	void printpre(node root)
	{
		
		if(root==null)
			return;
		else
		{
			System.out.print(root.data + " ");
			printpre(root.left);
			printpre(root.right);
		}
	}
	
	void postorder()
	{
		System.out.print("post ");
		printpost(root);
		System.out.println("");
	}
	void printpost(node root)
	{
		
		if(root==null)
			return;
		else
		{
			printpost(root.left);
			printpost(root.right);
			System.out.print(root.data + " ");
		}
		
	}
	
	void printLevelOrderQ()
	{
		System.out.print("levelorder ");
		node temp;
		if(root==null)
			return;
		else
		{
			Queue<node> q=new LinkedList<>();
			q.add(root);
			System.out.print(root.data + " ");
			while(!q.isEmpty())
			{
				temp=q.remove();
				if(temp.left!=null)
				q.add(temp.left);
				if(temp.right!=null)
				q.add(temp.right);
				if(temp.left!=null)
				System.out.print(temp.left.data + " ");
				if(temp.right!=null)
				System.out.print(temp.right.data + " ");
			}
		}
	}
	
	int heightOfTree()
	{
		int h=height(root);
		return h;
		
	}
	int height(node root)
	{
		int i=0,l=0,r=0;
		if(root==null)
			return 0;
		else
		{
		  l= height(root.left);
		  r= height(root.right); 
		}
		if(l<r)
			return(r+1);
		else
			return(l+1);
	}
	
	void printLevelOrder()
	{
		int h=heightOfTree();
		for(int i=1;i<=h;i++)
	   printl(root,i);
		
	}
	void printl(node root1,int h)
	{
		
		
		
			if(root1==null)
				return;
			
			if(h==1)
				System.out.print(root1.data);
			
			
				printl(root1.left,h-1);
				printl(root1.right,h-1);
			
			
	     
	
	}	
	
	
	
}



public class tree {
	public static void main(String[] args) {
	
		binarysearchTrees bt=new binarysearchTrees();
	    Scanner scn=new Scanner(System.in);
	    int arr[]=new int[50];
	    int n=scn.nextInt();
	    for(int i=0;i<n;i++)
	    	arr[i]=scn.nextInt();
	    bt.insert(arr,n);
	    bt.inorder();
	    bt.preorder();
	    bt.postorder();
	    bt.printLevelOrderQ();
	    System.out.println("");
	    bt.heightOfTree();
	    System.out.println("");
	    bt.printLevelOrder();
	    
	

	}

}
