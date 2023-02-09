package labtest1;

/**
 * 
 * @author Qusay Jamous
 * @since 09/02/2023
 * @version 1.0
 * 
 * 
 */
public class LabTest1 {
/**
 * First Method
 * @param unsorted - argument taken that represents the array that needs to be sorted
 */
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) //previously <= len, this is a runtime error because the code is meant to run until it reaches 1 below the length number, otherwise it will be running a number that does not exist in the array
        { 
            int index = i;
            for (int j = i+1; j < len; j++) // previously <len-1 this is an error because <len-1 is = len-2, and we want the code to run until len-1, and starting at i+1, therefore it should be <len
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
    /**
     * Second Method
     * @param unsorted also takes argument 'unsorted' which is an array needing to be sorted
     */
 
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];
            int j = i; // j should start at 1 in order to compare value to the left of i, logical error
            
            while (j > 0 && unsorted[j] > item) { 
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j + 1] = item;
        }
    }
    /**
     * Third Method
     * @param unsorted also takes unsorted array that needs to be sorted
     */
    
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { // less than N because if equal to n will again reach a unfound value that does ntoe exist in the array : runtime error
            if (index == 0)
                index++; 
            if (unsorted[index-1] > unsorted[index])
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
     *
     * @param arr array to be printed
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
     * @param args - unused
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
