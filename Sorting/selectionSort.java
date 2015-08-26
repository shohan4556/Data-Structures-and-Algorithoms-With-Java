/**
 * Selection Sort : O(n^2) 
 * @author shohan
 */
public class selectionSort {
    public static void main(String args[]){
        int[] ara = {77,33,44,11,88,-22,66,155};
        int minIndex = 0;
        
            for(int i=0;i<ara.length-1;i++){
                minIndex = i;
                    for(int j=i+1;j<ara.length;j++){
                        if(ara[minIndex]>ara[j]){
                            minIndex = j;
                        }
                        int tmp = ara[i];
                        ara[i] = ara[minIndex];
                        ara[minIndex] = tmp;
                    }
              } // end parent loop
            
            for(int i=0;i<ara.length;i++){
             //   System.out.print(ara[i]+" ");
            }
    }
}
