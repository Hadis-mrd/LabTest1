package labtest1;
//generating Javadoc
/**
 * Lab Test 1
 * @author moosa
 * {@code}
 */

public class LabTest1 {
	
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) // i <= len changed
        { 
            int index = i;
            for (int j = i+1; j < len; j++) // j < len-1 changed
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
 
    void sortFunction8(int unsorted[]) // couldn't fix this code properly
    {
        int ln = unsorted.length;
        for (int i = 0; i < ln; i++) { // i = 1 was changed
            int item = unsorted[i];
            int j = i + 1; 
            
            while (j < 4 && unsorted[j] < item) { // j > 0 was changed
                unsorted[j + 1] = unsorted[j];
                j = j + 1; // j - 1 was changed
            }
            unsorted[j - 1] = item; // j + 1 was changed
        }
    }
    
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { // index <= n changed
            if (index == 0)
                index++; 
            if (unsorted[index-1] < unsorted[index]) // unsorted[index-1] < unsorted[index] changed
                index++;
            else {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
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
