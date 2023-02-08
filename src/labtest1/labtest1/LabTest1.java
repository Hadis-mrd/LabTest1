/**
 * LabTest1 sorts an array
 * it contains 5 functions with 3 different sorting arrays
 * greatest
 * @author Chris Walker
 * @version 1.1
 */

package labtest1;

public class LabTest1 {

    /**
     * sortFunction7
     * method that has been debugged in order to print out correct array in least to
     * greatest
     * 
     * @param unsorted[] unsorted array
     * @author Chris Walker
     */
    void sortFunction7(int unsorted[]) {
        int len = unsorted.length;

        // switched the <= to an <
        for (int i = 0; i < len; i++) {

            // got rid of x at the end
            int index = i;

            // got rid of the minus 1
            for (int j = i + 1; j < len; j++)
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }

    /**
     * sortFunction8
     * method that has been debugged in order to print out correct array in least to
     * greatest
     * 
     * @param unsorted[] unsorted array
     * @author Chris Walker
     */

    void sortFunction8(int unsorted[]) {
        int ln = unsorted.length;

        // set i to 0
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];

            // make minus
            int j = i - 1;

            // make >=
            while (j >= 0 && unsorted[j] > item) {
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j + 1] = item;
        }
    }

    /**
     * sortFunction9
     * method that has been debugged in order to print out correct array in least to
     * greatest
     * 
     * @param unsorted[] unsorted array
     * @author Chris Walker
     */
    void sortFunction9(int unsorted[]) {
        int index = 0;
        int n = unsorted.length;

        // get rid of equals sign
        while (index < n) {
            if (index == 0)
                index++;

            // flip sign
            if (unsorted[index - 1] < unsorted[index])
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
     * sortFunction7
     * method that has been debugged in order to print out correct array in least to
     * greatest
     * 
     * @param unsorted[] unsorted array
     * @author Chris Walker
     */

    /**
     * printArray
     * method prints out array values in order
     * 
     * @param arr[] sorted array
     * @author Chris Walker
     */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     * main
     * calls on other methods from the class to sort an array
     * 
     * @param args[]
     * @author Chris Walker
     */
    public static void main(String args[]) {
        LabTest1 obj = new LabTest1();

        int unsorted7[] = { 74, 25, 13, 22, 8 };
        obj.sortFunction7(unsorted7);
        System.out.println("Sorted array7 : ");
        obj.printArray(unsorted7);

        int unsorted8[] = { 74, 25, 13, 22, 8 };
        obj.sortFunction8(unsorted8);
        System.out.println("Sorted array8 : ");
        obj.printArray(unsorted8);

        int unsorted9[] = { 74, 25, 13, 22, 8 };
        obj.sortFunction9(unsorted9);
        System.out.println("Sorted array9 : ");
        obj.printArray(unsorted9);

    }

}