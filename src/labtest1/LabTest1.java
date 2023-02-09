package labtest1;

//add javadoc comments 
/**
 * 
 * @author kush shastri 
 * @version 1
 * @since 2022-02-9 
 */
public class LabTest1 {
	
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        
        for (int i = 0; i < len; i++) { //index was out of bounds 
            int index = i;
            
            for (int j = i+1; j < len; j++) //j had to be less than len, not len-1 
                if (unsorted[j] < unsorted[index])
                    index = j;
            
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
 
    
    /**
     * 
     * @param unsorted receives unsorted array 
     */
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        
        for (int i = 0; i < ln; ++i) { //changed i=1 to i=0 to include the first index 
            
            int item = unsorted[i];
            int j = i - 1; //j should be i-1 instead of i+1
            
            while (j >=0 && unsorted[j] > item) { //j has to be greater than or equal to 0  
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j+1] = item; 
            
        }
    }
    
    
    /**
     * 
     * @param unsorted receives unsorted array  
     */
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        
        while (index<n) { //should be index<n
            
            if (index == 0)
                index++; 
            
            if (unsorted[index-1] <= unsorted[index]) //change > to <= 
                index++;
            
            else {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index-1];
                unsorted[index-1] = temp;   
                index--;
            }
       
        }
    }
    
    /**
     * 
     * @param arr receives unsorted array 
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
