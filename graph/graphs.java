package graphs;
import java.util.*;
class graph
{
	List<Integer> g[];
	
	public graph(int n)
	{
		g=new ArrayList[n];
		for(int i=0;i<n;i++)
			g[i]=new ArrayList<Integer>();
		visited=new boolean[n];
		visited1=new boolean[n];
	}
	public String toString()
	{
		String res="";
		for(int i=0;i<g.length;i++)
			res+=i + "=>" + g[i] + "\n";
		return res;
	}
	void addEdge(int u,int v)   // add edge in a graph
	{
		g[u].add(0,v);
		g[v].add(0,u);
	}
	
	boolean visited[];
	boolean visited1[];
	public void dfs(int start)    // print the depth first search traversal
	{
		Stack<Integer> stk=new Stack<>();
		stk.push(start);
		visited[start]=true;
		while(!stk.isEmpty())
		{
			Integer node=stk.pop();
			System.out.print(node + " ");
			List<Integer> l=g[node];
			for(Integer i:l)
				if(!visited[i])
				{
					stk.push(i);
					visited[i]=true;
				}	
		}
		System.out.println("");
	}
	
	
	
	public void isConnected(int u,int v)    //check if two nodes are connected or not
	{
		int flag=0;
		for(Integer i:g[u])
			if(i==v)
			{
				System.out.println(u + " & " + v + " are Connected");
				flag=1;
				return;
			}
		System.out.println(u + " & " + v + " are Not Connected");
	}
	
}

public class graphs {

	public static void main(String[] args)
	{
		graph g=new graph(9);
		g.addEdge(1, 4);
		g.addEdge(1, 2);
		g.addEdge(1, 5);
		g.addEdge(6, 2);
		g.addEdge(6, 8);
		g.addEdge(8, 7);
		g.addEdge(4, 3);
		g.addEdge(5, 2);
		g.addEdge(3, 2);
		g.addEdge(7, 2);
		System.out.println(g);
		System.out.print("DFS =>:");
        g.isConnected(2, 3);
        g.isConnected(7, 5);
        g.dfs(6);
        g.bfs(6);
	}
}
