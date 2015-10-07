/**
 *Quick sort :
 *  avg case : O(nlogn)
 *  worst case: O(n^2)
 * 
 * @author Shohan
 * 
 */

public class QuickSort {
    
    void quickSort(int ara[], int start, int end){
        if(start<end){
            
            int pIndex = partition(ara,start,end);
            
            quickSort(ara,start,pIndex-1); // left 
            quickSort(ara,pIndex+1,end); // right 
        }
    }
    
    int partition(int ara[],int start, int end){
        int p = start;
        int pivot = ara[end]; // assume the last value as pivot. in randomize quick sort we choose pivot randomly 
            
        for(int i=start;i<end;i++){
            if(ara[i]<=pivot){
                // swap ara[i] and partition index
                int tmp = ara[i];
                ara[i] = ara[p];
                ara[p] = tmp;
                p++;
            }
        }
        // swap pivot and pIndex
        int tmp = ara[p];
        ara[p] = pivot;
        ara[end] = tmp;
        
        return p;
    }
    
    
    public static void main(String args[]){
        
            int[] ara = {2,1,3,4,-8,5,7,0,16,6};
        
            QuickSort mysort= new QuickSort();
            mysort.quickSort(ara, 0, ara.length-1);
            
            for(int i=0;i<ara.length;i++){
                System.out.print(ara[i]+" ");
            }
    }
}
