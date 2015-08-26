

/**
 *  Insertion sort O(n^2)
 * @author shohanur rahaman
 */
public class insertionSort {
    public static void main(String args[]){
            
        int[] ara = {5,32,99,0,6,-12,19};
            
        for(int i=1;i<ara.length;i++){
            int tmp = ara[i]; 
            int j=i-1;
            while(j>=0 && tmp<ara[j]){
                ara[j+1] = ara[j];
                j--;
            }
            ara[j+1] = tmp;
        } // end parent loop
        
        for(int i=0;i<ara.length;i++){
            System.out.print(ara[i]+ " ");
        }
    }
}
