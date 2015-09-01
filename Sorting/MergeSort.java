import java.util.*;

class MergeSort{
    int[] resultArray ;
    void mergeSort(int[] ara,int left, int right){
        if(left<right){
            int center = (left+right)/2;
            
            mergeSort(ara,left,center);
            mergeSort(ara,center+1,right);
            
            // merge the result
           mergeArray(ara,left,center+1,right);
        }
    }
    
   void mergeArray(int[] ara,int leftBegin,int rightBegin,int rightEnd){
       int leftEnd = rightBegin-1;
       int numElements = (rightEnd-leftBegin)+1;
      resultArray = new int[numElements];      
       int resultIndex = 0;
       
       while(leftBegin<=leftEnd && rightBegin<=rightEnd){
           if(ara[leftBegin] <= ara[rightBegin]){
               resultArray[resultIndex++] = ara[leftBegin++];
           }
           else{
               resultArray[resultIndex++] = ara[rightBegin++];
           }
       }
       
          // After the main loop completed we may have few more elements in
        // left array copy them
       while(leftBegin<=leftEnd){
           resultArray[resultIndex++] = ara[leftBegin++];
       }
       
       // After the main loop completed we may have few more elements in
        // right array copy them
       while(rightBegin<=rightEnd){
           resultArray[resultIndex++] = ara[rightBegin++];
       }
         
       for (int i = numElements - 1; i >= 0; i--, rightEnd--) {
            ara[rightEnd] = resultArray[i];
        }
       
        // temp array back to main array
        ara = Arrays.copyOf(resultArray, resultArray.length);
       
   }
   
   void display(){
      
   }
    
    public static void main(String args[]){
        
        int[] ara = {310,285,179,652,351,423,861,254,450,520};
        
        MergeSort my_merge = new MergeSort();
        my_merge.mergeSort(ara, 0, ara.length-1);
        my_merge.display();
        
        // print sortes array
        for(int i:ara){
            System.out.print(i + " ");
        }
    }
    
}
