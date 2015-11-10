/*
 Insert(int n) : Add a node the tree with value n. Its O(lgn)

Find(int n) : Find a node the tree with value n. Its O(lgn)
                --> iterative way 
                --> recursive way    

Delete (int n) : Delete a node the tree with value n. Its O(lgn)
          (a) : node to be deleted is a leaf node (no child)

Traverse(): Traverse Tree 
 */

/**
 *
 * @author shohan
 * implement Binary Tree
 */

class Node{
    int data;
    Node left;
    Node right;
    
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}


public class BinarySearchTree {
         Node root;
         
         void insertNode(int id){
             Node newNode = new Node(id);
             if(root == null){ // tree empty 
                 root = newNode;
                 return;
             }
             
             Node current = root;
             Node parent = null;
             
             while(true){
                 parent = current;
                 if(id<current.data){ // go left
                        current = current.left; 
                        if(current==null){ // reach the leaf node that has no child
                            parent.left = newNode;
                            return;
                        }
                 }
                 else{ // go right
                     current = current.right;
                     if(current==null){
                         parent.right = newNode;
                         return;
                     }
                 }
             } // end loop
         }
    
         void displayTree(Node root){
             if(root!=null){
                 displayTree(root.left);
                 System.out.print(" "+root.data+" ");
                 displayTree(root.right);
             }
         }
         
         boolean find(int val){ // iterative way
             Node current = root;
                    while(current!=null){
                            if(current.data == val)
                                return true;
                            else if(val<current.data){
                                current = current.left;
                            }
                            else{
                                current = current.right;
                            }
                    }
                    return false;
         }
         
               boolean search(Node root, int id){ // recursive way
               
                if(root == null)
                    return false;
                else if(root.data == id)
                    return true;
                else if(id<root.data)
                   return search(root.left,id);
                else
                   return search(root.right,id);                
         }
         
    public static void main(String args[]){
        
      BinarySearchTree myBST = new BinarySearchTree();
      myBST.insertNode(40);
      myBST.insertNode(20);
      myBST.insertNode(30);
      myBST.insertNode(50);
      
      myBST.displayTree(myBST.root);
      
      if(myBST.find(50) == true){
          System.out.println("Found");
      }
      else{
          System.out.println("Not Found");
      }
    }
}
