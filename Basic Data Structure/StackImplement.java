 import java.util.Arrays;
 
/**
 *
 * @author shohan
 * 8/22/2015 - 8.17pm 
 */
public class StackImplement {
        
  public int[] stackArray; // declare and array not allocated the array size
    int stackSize;
    int topOfArray = -1;
    
        StackImplement(int size){ 
            stackSize = size;
            stackArray = new int[size]; // here array allocated
            // noew initialize array with a negetaive values
            Arrays.fill(stackArray,-1); 
        }
        
        public void push(int input){
            // simple checking that stack has enough room to add value
            if(topOfArray+1<stackArray.length){
                topOfArray++;
                stackArray[topOfArray] = input;
            }
            else{
                System.out.print("Sorry, The Stack is FULL !.\n");
               // displayStack();
            }
        }
    
        public void pop(){
            // checking that the stack is no
                if(topOfArray >=0){
                    stackArray[topOfArray] = -1;
                    topOfArray--;   
                }
                else{
                    System.out.print("Sorry, The Stack is EMPTY !.\n");
                }
        }
        
        private void displayStack() {
            for(int i=0;i<stackArray.length;i++){
                System.out.print("| "+i+" ");
            }
            
             System.out.print("\n");
            for(int i=0;i<stackArray.length;i++){
                System.out.print("| "+stackArray[i]+"");
            }
             System.out.print("\n");
             System.out.print("------------------------------------------");
             System.out.print("\n");
        }
        
    public static void main(String args[]){
        
        StackImplement myStack = new StackImplement(10);
         myStack.displayStack();
        
      // push elements   
      for(int i = 0;i<myStack.stackArray.length;i++){
          myStack.push(i*5);
      }
      
       myStack.displayStack();
       
        // // poped 5 elements 
        for(int i = 0;i<5;i++){
          myStack.pop();
        }
        
        myStack.displayStack();
    }

}
