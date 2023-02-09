package labtest1;
/**
 * @author Yousuf
 * @version 1.0
 * @since 2023-02-09
 */
public class LabTest1 {
	/**
         * 
         * @param This method sorts unsorted7 array.
         */
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len -1; i++) // has to be -1, removed = sign
        { 
            int index = i;
            for (int j = i+1; j < len; j++) 
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t ;
        }
    }
 /**
  * 
  * @param This function sorts unsorted 8 array.
  */
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        for (int i = 0; i < ln; i++) {
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
 * 
 *@param  this method sorts unsorted9
 */
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { // = doesnt work here
            {
            if (index == 0)
                index++; 
            if (unsorted[index-1] <= unsorted[index]) // <= not >
                index++;
            else {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
          
        }
    }
    }
    /**
     * 
     * @param this method allows us to print the sorted functions. 
     */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    /**
 * this contains the unsorted arrays
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
