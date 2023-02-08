/**
 * @author Leonardo
 * @version 2.0
 * @since 2023-02-08
 */

package labtest1;

public class LabTest1 {
	
    
    /** 
     * @param unsorted[]
     */
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++)  /* set to < */
        { 
            int index = i;
            for (int j = i+1; j <= len-1; j++)  /* changed to <= so j will reach last index */
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
 
    
    /** 
     * @param unsorted[]
     */
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) { 
            int item = unsorted[i];
            int j = i - 1; /* changed to - from + */
            
            while (j >= 0 && unsorted[j] > item) {  /*changed to >= */
                unsorted[j + 1] = unsorted[j];
                j = j - 1;  
            }
            unsorted[j + 1] = item;
        }
    }
    
    
    /** 
     * @param unsorted[]
     */
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { /* changed to < from <= */
            if (index == 0)
                index++; 
            if (unsorted[index-1] <= unsorted[index])  /* changed from > to <= */
                index++;
            else {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
        }
    }
    
    
    /** 
     * @param arr[]
     */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        LabTest1 obj = new LabTest1();
        
        int unsorted7[] = {74,25,13,22,8};
        obj.sortFunction7(unsorted7);
        System.out.println("Sorted array7 : ");
        obj.printArray(unsorted7);
        
        int unsorted8[] = {74,25,13,22,8};
        obj.sortFunction8(unsorted8);
        System.out.println("Sorted array8 : ");
        obj.printArray(unsorted8);
        
        int unsorted9[] = {74,25,13,22,8};
        obj.sortFunction9(unsorted9);
        System.out.println("Sorted array9 : ");
        obj.printArray(unsorted9);
       
    }
    
}
