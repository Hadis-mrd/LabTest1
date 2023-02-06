package labtest1;


public class LabTest1 {
    
    /**
     * Arrays are sorted then printed
     * @param args
     */
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
    
    /**
     * sorts an array of integers from least to greatest
     * @param unsorted - array to be sorted
     */
    public void sortFunction1(int unsorted[])
    {
        int len = unsorted.length;
        for (int i = 0; i <= len; i++) 
        { 
            int index = i;
            for (int j = i+1; j < len; j++) 
                if (unsorted[j] < unsorted[index]){
                    
                    int t = unsorted[j];
                
                    unsorted[j] = unsorted[i];
                    unsorted[i] = t;
                }
        }
    }
 
    /**
     * sorts an array of integers from least to greatest
     * @param unsorted - array to be sorted
     */
    public void sortFunction2(int unsorted[])
    {
        int length = unsorted.length;
        for (int i = 0; i < length; i++)
            for (int j = i+1; j < length; j++)
                if (unsorted[j] < unsorted[i]) { 
                    int t = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = t;
                }
    }
     
    /**
     * sorts an array of integers from least to greatest 
     * @param unsorted - array to be sorted
     */
    public void sortFunction3(int unsorted[])
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            
            int item = unsorted[i];
            
            int j = i - 1; 
            
            while (j >=0 && unsorted[j] > item) { 
                
                unsorted[j+1] = unsorted[j];
                
                j = j-1;
                
            }
            unsorted[j+1] = item;
        }
    }
     
    /**
     * prints an Array
     * @param arr - array to be printed
     */
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
}
