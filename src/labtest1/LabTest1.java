package labtest1;

/**
 * @author willmancini
 */

/**
 * This class implements a sorting function that sorts an integer array
 * in ascending order using specific algorithms.
 */
public class LabTest1 {
    /**
     * This method sorts an integer array in ascending order the selection sort algorithm.
     * @param unsorted Integer array needs to be sorted (ascending).
     */
    void sortFunction1(int unsorted[])
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) // i<=len changed to i<len
        { 
            int index = i;
            for (int j = i+1; j < len; j++) // j<len-1 changed to j<len
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
    /**
     * This method sorts an integer array in ascending order using the insertion sort algorithm.
     *
     * @param unsorted Integer array that will be sorted (ascending).
     */
    void sortFunction2(int unsorted[])
    {
        int length = unsorted.length;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (unsorted[j] > unsorted[j + 1]) { // unsorted[i] changed to unsorted[j+1]
                    int t = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = t;
                }
    }
    /**
     * This method sorts an integer array in ascending order using the insertion sort algorithm.
     *
     * @param unsorted Integer array that will be sorted (ascending).
     */
    void sortFunction3(int unsorted[])
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];
            int j = i - 1; // j=i+1 changed to j=i-1
            
            while (j >= 0 && unsorted[j] > item) { // j>0 changed to j>=0
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j + 1] = item;
        }
    }
    /**
     * This method prints each integer array.
     *
     * @param arr Integer array that will be printed.
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
