import java.util.*;

class matrixRep{
	public static void main(String args[]){
			
			int[][] matrix = new int[7][7];
			int edges,nodes,u,v;
			Scanner in = new Scanner(System.in);
			
			pr("Enter Number of Nodes : ");
			nodes = in.nextInt();
			pr("Enter Number of Edges : ");
			edges = in.nextInt();
			prln("Enter The Graph");
			
			for(int i=0;i<nodes;i++){
				for(int j=0;j<nodes;j++){
				//u = in.nextInt();
				//v = in.nextInt();
				int tmp = in.nextInt();
				matrix[i][j] = tmp;
			  }
			}
			
			// display matrix
			prln("Dsiplay Matrix");
			for(int i=0;i<nodes;i++){
				 System.out.print(i+"-->");
				for(int j=0;j<nodes;j++){
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
				//prln("");
			}
			
	}
	public static void prln(Object a){
		System.out.println(a);
	}
	public static void pr(Object a){
		System.out.print(a);
	}	
}
