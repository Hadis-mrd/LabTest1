package labtestone;

/**
 * LabTestOne class is a sorting class that has 3 sorting methods
 * (sortFunction1, sortFunction2, and sortFunction3) It also has a method to
 * print each sorted array.
 *
 * @author cbauma05
 */

public class LabTestOne {

    /**
     * sortFunction1 sorts an array of integers using the selection sort
     * algorithm.
     *
     * @param unsorted an unsorted array of integers that is used for each method
     * 
     * Correction: Fixed a run time error where the for loop was going out of the scope of the array. Changed "<=" to "<"
     * 
     * Correction: Fixed a logic error changing "len - 1" to "len" on line 28
     */
    void sortFunction1(int unsorted[]) {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) 
        {
            int index = i;
            for (int j = i + 1; j < len; j++) 
            {
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
     * sortFunction2 sorts an array of integers using the insertion sort algorithm.
     *
     * @param unsorted an unsorted array of integers.
     * 
     * Correction: Changed the initialization of "i = 0" to "i = 1".
     * 
     * Correction: Changed unsorted array index from "j" to "i" and "j + 1" to "j" on line 56 to correct the element swap.
     * 
     * Correction: Changed the unsorted array index from "j + 1" to "j" on line 57.
     */
    void sortFunction2(int unsorted[]) {
        int length = unsorted.length;
        for (int i = 1; i < length; i++) 
        {
            for (int j = 0; j < i; j++) {
                if (unsorted[j] > unsorted[i]) {
                    int t = unsorted[i];
                    unsorted[i] = unsorted[j];  
                    unsorted[j] = t;          
                }
            }
        }
    }

     /**
     * sortFunction3 sorts an array of integers using the insertion sort algorithm.
     *
     * @param unsorted an unsorted array of integers
     * 
     * Correction: Fixed run time error on line 76 by changing "i + 1" to "i - 1" beyond array scope.
     * 
     * Correction: Adjusted while loop condition to ">="
     * 
     * Correction: Changed j variable adjuster to "j--"
     */
    void sortFunction3(int unsorted[]) {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];
            int j = i - 1; // Changed i + 1 to i - 1   --> logic error beyond scope

            while (j >= 0 && unsorted[j] > item) { 
                unsorted[j + 1] = unsorted[j];
                j--;                             // Changed to j--
            }
            unsorted[j + 1] = item;
        }
    }

    
    /**
     * printArray prints the elements of an array.
     *
     * @param arr an array of integers
     */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * main is the entry point of the program. It tests the sorting functions and print the sorted arrays.
     *
     * @param args an array of string arguments
     */
    public static void main(String[] args) {
        LabTestOne obj = new LabTestOne();

        int unsorted[] = {64, 25, 12, 22, 11};
        obj.sortFunction1(unsorted);
        System.out.println("Sorted array1 : ");
        obj.printArray(unsorted);

        int unsorted2[] = {64, 25, 12, 22, 11};
        obj.sortFunction2(unsorted2);
        System.out.println("Sorted array2 : ");
        obj.printArray(unsorted2);

        int unsorted3[] = {64, 25, 12, 22, 11};
        obj.sortFunction3(unsorted3);
        System.out.println("Sorted array3 : ");
        obj.printArray(unsorted3);

    }

}
