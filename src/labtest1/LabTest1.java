package labtest1;


public class LabTest1 {
    void sortFunction1(int unsorted[])
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) //FIXED: java.lang.ArrayIndexOutOfBoundsException, no longer causing i = len.
        { 
            int index = i;
            for (int j = i+1; j < len; j++) //FIXED: Removed the "- 1" from the loop condition. This ensures the nested for-loop intterates over the entire array.
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
 
    void sortFunction2(int unsorted[])
    {
        int length = unsorted.length;
        for (int i = 0; i < length; i++) //FIXED: Removed sort restrictions. Ensures the loops itterated over the entire array, so that it sorts the entire array.
            for (int j = 0; j < length; j++)
                if (unsorted[j] > unsorted[i]) { 
                    int t = unsorted[j];
                    unsorted[j] = unsorted[i]; //FIXED: The swapping operation. There were index offsets that ment the swap was not just the 2 indexes.
                    unsorted[i] = t;
                }
    }
     
    void sortFunction3(int unsorted[])
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];
            int j = i - 1; //FIXED: Changed the addition operator to a subtraction operator. This ensures that j is never be greater than the last index of the passed array.
            
            while (j >= 0 && unsorted[j] > item) { 
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j + 1] = item;
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
