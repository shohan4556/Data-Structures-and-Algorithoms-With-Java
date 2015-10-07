/**
 *
 * @author shohan
 * @implement : singly Linked List
 * @operations : traversing,inserting(at last),searching.
 */

public class SinglyList {
    
    protected static SinglyList head;
    public int value;
    public SinglyList next;

    // create a node with a value and the link of next node
    public SinglyList(int v,SinglyList n){
        value = v;
        next = n;
    }

    // return the element of this node 
    public int getValue(){
        return value;
    }
    
    // reutrn the link of next node
    public SinglyList getNext(){
        return next;
    }
    
    // set the value of this node
    public void setValue(int newValue){
        value = newValue;
    }
    
    // set the link of the next node
    public void setLink(SinglyList newNext){
        next = newNext;
    }
    
    // traverse list
    public static void display(SinglyList h){
        while(h!=null){
            System.out.println(h.value);
            h = h.next;
        }
    }
            // searching list 
    public static boolean searchList(int element){
            
        SinglyList tmp = head;
        while(tmp!=null){
            if(tmp.value == element)
                return true;
            tmp = tmp.next;
        }
            return false;
    }
    
    public static void main(String args[]){
       
        SinglyList n1 = new SinglyList(2,null);
        head = n1; // make sure the head will not change anymore
        
        SinglyList n2 = new SinglyList(4,null);
        n1.setLink(n2);
                
        SinglyList n3 = new SinglyList(6,null);
        n2.setLink(n3);
        
        SinglyList n4 = new SinglyList(10,null);
        n3.setLink(n4);
        
        display(head); // traversing node
        
        System.out.println(searchList(10));
    }
}








