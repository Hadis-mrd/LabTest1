package labtest1;

/**
 * @author  Adwit Gupta
 * @version 1.0
 * @since   2023-02-09
*/

public class LabTest1 {
	
    /**
     * 
     * 
     * @param unsorted receives unsorted array
     */
    
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) //change i<=len to i<len
        { 
            int index = i;
            for (int j = i+1; j <= len-1; j++) //change j<len-1 to j<=len-1
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }//end of for loop
    }//end of sortFunction7 method
 
    /**
     * 
     * 
     * @param unsorted receives unsorted array
     */
    
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];
            int j = i - 1; //change j=i+1 to j=i-1
            
            while (j >= 0 && unsorted[j] > item) { //change j>0 to j>=0
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j + 1] = item;
        }//end of for loop
    }//end of sortFunction8 method
    
    /**
     * 
     * 
     * @param unsorted receives unsorted array
     */
    
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { //change index<=n to index<n
            if (index == 0)
                index++; 
            if (unsorted[index-1] <= unsorted[index])    //change unsorted[index-1]>unsorted[index] to unsorted[index-1]<=unsorted[index]
                index++;
            else {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }//end of else statment
        }//end of while loop
    }//end of sortFunction9 method
    
    /**
     * 
     * 
     * @param arr receives arr array
     */
    
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }//end of printArray method
 
    
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
       
    }//end of main  method
    
}//end of LabTest1 class
