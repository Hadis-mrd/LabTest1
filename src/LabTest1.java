/**
 * This is a code for sorting unsorted arrays in a ordered sequence form
 * @author HAADI REHAN
 * @version 1.00
 */
/**
 * 
 * @author HAADI REHAN
 */
public class LabTest1 {

    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len - 1; i++) 
        { 
            int index = i;
            for (int j = i + 1; j < len; j++) 
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
/**
 * Here we used sort function 8 and made for loops to order the array
 * @param unsorted 
 */
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
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
 * Here we used sort function 9 and made for loops to order the array
 * @param unsorted 
 */
    void sortFunction9(int unsorted[])
    {
        int n = unsorted.length;
        for (int index = 1; index < n; index++) {
            int item = unsorted[index];
            int j = index - 1;
            while (j >= 0 && unsorted[j] > item) {
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j + 1] = item;
        }
    }
/**
 * Here we are printing out the array to be displayed in order
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
