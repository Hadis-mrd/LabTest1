package labtest1;
/**
 * 
 * @author Jacob 
 * @version 1.0.1
 * @since 2023-2-6
 */

public class LabTest1 {
    /** 
    * @param unsorted[]
    */ 
    void sortFunction1(int unsorted[])
    {
        int len = unsorted.length;
        for (int i = 0; i <= len-1; i++) 
        { 
            int index = i;
            for (int j = i+1; j < len; j++){
                if (unsorted[j] < unsorted[index]){
                    index = j;
                }
            }           
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
            
        }
    }
    /** 
    * @param unsorted[]
    */ 
    void sortFunction2(int unsorted[])
    {
        int length = unsorted.length;//
        for (int i = 0; i < length; i++)//
            for (int j = 0; j < length - 1; j++)//
                if (unsorted[j] > unsorted[i]) { 
                    int t = unsorted[j];
                    unsorted[j] = unsorted[i];
                    unsorted[i] = t;
                }
    }
    /** 
    * @param unsorted[]
    */ 
    void sortFunction3(int unsorted[])
    {
        int ln = unsorted.length;
        for (int i = 0; i < ln-1; i++) {
            
            int j = i + 1; 
            
            while (j > 0 && unsorted[j] < unsorted[j-1]) {
                int item = unsorted[j-1];
                unsorted[j - 1] = unsorted[j];
                unsorted[j] = item;
                j = j - 1;
                
            }
            
           
        }
    }
    /** 
    * @param arr[]
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
        
        int unsorted[] = {64,25,12,22,11};
        obj.sortFunction1(unsorted);
        System.out.println("Sorted array1 : ");
        obj.printArray(unsorted);
        
        
        
        int unsorted2[] = {64,25,12,22,11};
        obj.sortFunction2(unsorted2);
        System.out.println("Sorted array2 : ");
        obj.printArray(unsorted2);
        
        int unsorted3[] = {64,25,12,22,11};
        obj.sortFunction3(unsorted3);
        System.out.println("Sorted array3 : ");
        obj.printArray(unsorted3);
       
    }
    
}
