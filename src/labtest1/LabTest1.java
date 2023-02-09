package labtest1;
/**
 * 
 * 
 * @author Shane
 * @version 1.0
 * @since 2023 02 09
 */


public class LabTest1 {
	
    /**
     * 
     * 
     * @param unsorted 
     */
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++)//change i <= len to i < len 
        { 
            int index = i;
            for (int j = i+1; j < len; j++) 
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
 
    /**
     * 
     * @param unsorted 
     */
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        for (int i = 0; i < ln; ++i) { //should be i = 0 instead of i =1
            int item = unsorted[i];
            int j = i - 1; //should be i-1 instead of j+1
            
            while (j >= 0 && unsorted[j] > item) { //should be j>= 0
                unsorted[j + 1] = unsorted[j];
                j = j - 1; 
            }
            unsorted[j+1] = item;
        }
    }
    /**
     * 
     * @param unsorted 
     */
   void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { //should be index < n
            if (index == 0)
                index++; 
            if (unsorted[index-1] <= unsorted[index]) //change > to <=
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
