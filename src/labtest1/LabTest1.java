package labtest1;

/**
 * 
 * @author aleks
 */

public class LabTest1 {
    /**
     * 
     * @param unsorted passes specified array to method to sort it
     */
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++)   //Changed <= to <
        { 
            int index = i;
            for (int j = i+1; j < len; j++)  //changed len - 1 to len 
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
    /**
     * 
     * @param unsorted passes specified array to method to sort it
     */
    
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; i++) {   // changed ++i to i++
            int item = unsorted[i];
            int j = i; //Changed j = i+1 to j= i
            
            while (j > 0 && unsorted[j - 1] > item) {    //changed [j]to j - 1
                unsorted[j] = unsorted[j - 1];   //Changed j + 1 to j
                j = j - 1;  
            }
            unsorted[j] = item;     //Changed [j + 1] to [j]
        }
    }
    
    /**
     * 
     * @param unsorted 
     */
    
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n)  //Changed <= to <
        {                        //Changed <= to <
            if (index == 0)
                index++; 
            if (unsorted[index-1] <= unsorted[index])     //Changed > to <=
                index++;
            else 
            {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
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
        LabTest1 obj = new LabTest1();
    
        int unsorted7[] = {76,45,10,29,10};
        obj.sortFunction7(unsorted7);
        System.out.println("Sorted array7 : ");
        obj.printArray(unsorted7);
        
        int unsorted8[] = {76,45,10,29,10};
        obj.sortFunction8(unsorted8);
        System.out.println("Sorted array8 : ");
        obj.printArray(unsorted8);
        
        int unsorted9[] = {76,45,10,29,10};
        obj.sortFunction9(unsorted9);
        System.out.println("Sorted array9 : ");
        obj.printArray(unsorted9);
       
    }
    
}
