import java.util.*;

class ListRep{
	public static void main(String args[]){
		
		// empty arraylist
		ArrayList<ArrayList> graph = new ArrayList<ArrayList>();
		
		int nodes = 5;
		for(int i=0;i<=nodes;i++){
		   graph.add(new ArrayList<Integer>());
		}
		
		graph.get(1).add(2);
		graph.get(1).add(3);
		
		graph.get(2).add(3);
		graph.get(2).add(4);
		
		graph.get(3).add(4);
		graph.get(3).add(5);
		
		graph.get(4).add(5);
		graph.get(5).add(null); // no vertex
		
		prln("Print all the adjacet vertex");
		
		for(int v=0;v<nodes;v++){
		  prln(v+" : "+graph.get(v));
		}
		
		//prln(mylist);
	}
		public static void prln(Object a){
		 System.out.println(a);
		}
	}
