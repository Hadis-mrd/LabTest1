package labtest1;

/**
@author WaleedHawwari
@since 2023-02-09
@version 1.0

*/

public class LabTest1 {
	
    /**
    * This method sorts an array of integers in ascending order.
    * 
    * @param unsorted The unsorted array of integers.
    */
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) 
        { 
            int index = i;
            for (int j = i+1; j < len; j++) 
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
  /**
    * This method sorts an array of integers in ascending order.
    * 
    * @param unsorted The unsorted array of integers.
    */
   void sortFunction8(int unsorted[]) 
{
    int len = unsorted.length;
    for (int i = 1; i < len; ++i) {
        int item = unsorted[i];
        int j = i - 1; 
        
        while (j >= 0 && unsorted[j] > item) { 
            unsorted[j + 1] = unsorted[j];
            j = j - 1;
        }
        unsorted[j + 1] = item;
    }
}
    /**
    * This method sorts an array of integers in ascending order.
    * 
    * @param unsorted The unsorted array of integers.
    */ 
  void sortFunction9(int unsorted[])
{
    int n = unsorted.length;
    for (int i = 1; i < n; i++) {
        int j = i;
        while (j > 0 && unsorted[j - 1] > unsorted[j]) {
            int temp = unsorted[j];
            unsorted[j] = unsorted[j - 1];
            unsorted[j - 1] = temp;
            j--;
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
