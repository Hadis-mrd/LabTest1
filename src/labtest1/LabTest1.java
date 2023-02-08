package labtest1;

    /** 
    *  LabTest1
    *  used to sort different arrays
     * @author taitr
     * @version 1.0
     */

public class LabTest1 {
	
    /** 
     * sortfunction7
     * sort an array from lowest value to highest
     * @param unsorted[]
     * @author taitr
     */
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i <= len - 1; i++) 
        { 
            int index = i;
            for (int j = i+1; j < len; j++) //changed len -1 to just len
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
 

    /** 
     * sortfunction8
     * sort an array from lowest value to highest
     * @param unsorted[]
     * @author taitr
     */

    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];
            int j = i - 1; //changed from j = i + 1
        
            while (j >= 0 && unsorted[j] > item) { //changed the greater than to a greater than or equals to
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j + 1] = item;
        }
    }

    /** 
     * sortfunction9
     * sort an array from lowest value to highest
     * @param unsorted[]
     * @author taitr
     */
    
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { //switched <= to just a <
            if (index == 0)
                index++; 
            if (unsorted[index-1] < unsorted[index])//switched > to a <
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
     * printArray
     * print the values within an array
     * @param unsorted[]
     * @author taitr
     */

    
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 

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