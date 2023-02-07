/**
 * @author Tony Tran
 * @param int
 * @return void
 * 
 */

package labtest1;
import java.util.Arrays;

public class LabTest1 {
    void sortFunction4(int unsorted[])
    {
        int index = 1;
        int n = unsorted.length;
        while (index < n) {
            if(index == 0) index++;
            if (unsorted[index - 1] >= unsorted[index]){//if the first > second
                int temp = unsorted[index]; //swap
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            } 
            else { //else second is greater than first
                index++;
            }
        }
    }
 
    void sortFunction5(int unsorted[]) 
    {
        int n = unsorted.length ; 
        int min = unsorted[0];
        int max = unsorted[n- 1]; //minus one to correct for zero indexing. for indexing
        int range, i, j, index;
 
        for(int a=0; a<n; a++)
        {
            if( max <unsorted[a] ) 
                max = unsorted[a]; 
            if( min > unsorted[a]) 
                min = unsorted[a];
        }

        range = max - min + 1;
        int[] phole = new int[range];
        Arrays.fill(phole, 0);
 
        for(i = 0; i<n; i++)
            phole[unsorted[i] - min]++;
         
        index = 0;
 
        for(j = 0; j<range; j++)
            while(phole[j]-->0)
                unsorted[index++]=j+min;
                
    }
     
    void sortFunction6(int unsorted[]) 
    {
        boolean isSorted = false;
        int n = unsorted.length;
        while (!isSorted)
        {
            isSorted = true;
            int temp =0;
 
            for (int i=1; i<=n-2; i=i+2)
            {
                if (unsorted[i + 1] < unsorted[i]) //if the first is greater than first
                {
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i+1];
                    unsorted[i+1] = temp;
                    isSorted = false;
                }
            }
 
            for (int i=0; i<=n-2; i=i+2)
            {
                if (unsorted[i] > unsorted[i+1])
                {
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i+1];
                    unsorted[i+1] = temp;
                    isSorted = false;
                }
            }
        }
    }
     
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    
    public static void main(String[] args) {
        LabTest1 obj = new LabTest1();
        
        int unsorted4[] = {64,25,12,22,11};
        obj.sortFunction4(unsorted4);
        System.out.println("Sorted array4 : ");
        obj.printArray(unsorted4);
        
        
        int unsorted5[] = {64,25,12,22,11};
        obj.sortFunction5(unsorted5);
        System.out.println("Sorted array5 : ");
        obj.printArray(unsorted5);
        
        int unsorted6[] = {64,25,12,22,11};
        obj.sortFunction6(unsorted6);
        System.out.println("Sorted array6 : ");
        obj.printArray(unsorted6);
       
    }
    
}
