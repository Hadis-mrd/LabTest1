package labtest1;

/** 
 * This is a LabTest Class that has methods that sort arrays in 3 different ways
 * @author Lucy Al Haj Ali
 * @version 1.2
 * @since February 8, 2023
 * Lab Test #1
 */
public class Labtest1 {
	
    /**
     * This method sorts an array in ascending order (way 1)
     * @param unsorted 
     */
    void sortFunction7(int unsorted[])
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) // changed <= to <
        { 
            int index = i;
            for (int j = i+1; j <= len-1; j++)
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
 
    /**
     * This method sorts an array in ascending order (way 2)
     * @param unsorted 
     */
    void sortFunction8(int unsorted[])
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];
            int j = i - 1;  // changed the + with -
            
            while (j >= 0 && unsorted[j] > item) { // changes j>0 to j>=0
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j + 1] = item;
        }
    }
    
    /**
     * This method sorts an array in ascending order (way 3)
     * @param unsorted 
     */
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { //change <= to <
            if (index == 0)
                index++;
            if (unsorted[index-1] <= unsorted[index]) // change > to <=
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
     * This method prints the elements of the array
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
     * This is the main method and it prints out all the results to the screen
     * @param args 
     */
    public static void main(String[] args) {
        Labtest1 obj = new Labtest1();
        
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
