/**
 * Bubble Sort - O(n^2) 
 * @author Shohanur Rahaman
 */
public class BubbleSort {
    public static void main(String args[]){
        
        int[] ara = {56,2,9,200,0,-9,1,98,-10};
        
        for(int i=0;i<ara.length;i++){
            for(int j=i+1;j<ara.length;j++){
                    if(ara[i]>ara[j]){
                    int temp = ara[j];
                    ara[j] = ara[i];
                    ara[i] = temp;
                }
            }
        } // sorting complete 
        
        // print sorted array
            for(int i=0;i<ara.length;i++){
              System.out.print(ara[i]+" ");
            }
    }
}
