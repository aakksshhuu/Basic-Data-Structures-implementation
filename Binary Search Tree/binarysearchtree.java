package BST;
import java.util.*;
import java.lang.*;
class binarysearchTrees
{
	int arr[]=new int[50];
	node root;
	node temp=null;
	int count=0;
	
	class node	{
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

	
	void insert(int d)
	{
		node n=new node(d);
		root=insert(root,n);
	}
	
	node insert(node root1,node nn)
	{
		if(root1==null)
		{
			root1=nn;
			
		}
		else if(root1.data>nn.data)
		{
			root1.left=insert(root1.left,nn);
		}
		else
		{
			root1.right=insert(root1.right,nn);
		}
		return root1;
	}
	
	
	void inorder()
	{
	   printin(root);
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
			System.out.print(root.data);
			printin(root.right);
		}
	}
	
	
	void preorder()
	{
		printpre(root);
	}
	void printpre(node root)
	{
		if(root==null)
			return;
		else
		{
			System.out.print(root.data);
			printpre(root.left);
			printpre(root.right);
		}
	}
	
	
	void postorder()
	{
		printpost(root);
	}
	void printpost(node root)
	{
		if(root==null)
			return;
		else
		{
			printpost(root.left);
			printpost(root.right);
			System.out.print(root.data);
		}
	}
	
	
	
	void delete(int d)
	{
		
		buildarray(root);
	    deleteNode(arr,d,count);
	    root=null;
	    for(int i=0;i<count-1;i++)
	    	insert(arr[i]);
	    count=0;
	}
	void buildarray(node root)
	{
	
	
		if(root==null)
		return;
		else
		{
			buildarray(root.left);
			arr[count++]=root.data;
			buildarray(root.right);
		}
	}
	void deleteNode(int arr[],int d,int count)
	{
		int k=0;
		for(int i=0;i<count;i++)
		{
			if(arr[i]==d)
			{
				k=i;
			}
		}
	
		for(int i=k;i<count;i++)
		{
			arr[i]=arr[i+1];
		}
		for(int i=0;i<count-1;i++)
			System.out.print(arr[i]);
	}

	
	
}



public class binarysearchtree {
	public static void main(String[] args) {
	
		binarysearchTrees bt=new binarysearchTrees();
		bt.insert(4);
		bt.insert(7);
		bt.insert(3);
		bt.insert(8);
		bt.insert(1);
		bt.inorder();
		System.out.println(" ");
		bt.preorder();
		System.out.println(" ");
		bt.postorder();
		System.out.println(" ");
		bt.delete(4);
		System.out.println("");
		bt.delete(3);
		System.out.println("");
		bt.delete(7);
		System.out.println("");
		bt.delete(1);
	
		

	}

}
