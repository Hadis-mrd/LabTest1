
package labTest;

import java.lang.*;

/**
 *
 * @author Chase
 * @version 11.1    
 * @since 2023-02-06
 * 
 */
public class LabTest {
    
    /**
     * @param unsorted
     */
    void sortFunction1(int unsorted[]) {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) { //changed to < than not less than or equal to
            int index = i;
            
            for (int j = i + 1; j < len; j++) { //removed the -1 from the len
                if (unsorted[j] < unsorted[index]) {
                    index = j;
                }
            }
            
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }

    /**
     *
     * @param unsorted
     */
    void sortFunction2(int unsorted[])
     {
        int length = unsorted.length;
        
        for (int i = 1; i < length; i++)
        {
            
            for (int j = 0; j < i; j++)
            {
                
                if(unsorted[j] > unsorted[i])
                {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
    }

    /**
     *
     * @param unsorted
     */
    void sortFunction3(int[] unsorted)
 {
    int ln = unsorted.length;
    
    for (int i = 1; i < ln; ++i)
    {
        
        int item = unsorted[i];
        int j = i - 1; //changed from i + 1 to i - 1 

        while (j >= 0 && unsorted[j] > item)
        {
            unsorted[j + 1] = unsorted[j];
            j--;
        }
        unsorted[j + 1] = item;
    }
}

    /**
     *
     * @param arr
     */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        LabTest obj = new LabTest();
        
        int unsorted[] = {64,25,12,22,11};
        obj.sortFunction1(unsorted);
        System.out.println("Sorted array1 : ");
        obj.printArray(unsorted);
        
      
        
        int unsorted2[] = {64,25,12,22,11};
        obj.sortFunction2(unsorted2);
        System.out.println("Sorted array2 : ");
        obj.printArray(unsorted2);
        
        
        
        int unsorted3[] = {64,25,12,22,11};
        obj.sortFunction3(unsorted3);
        System.out.println("Sorted array3 : ");
        obj.printArray(unsorted3);
       
    }
    
}
