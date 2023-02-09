package labtest1;
/**
 *
 * @author Akhilesh Bandaru
 * @version 1
 * @since 09-02-2023
 * 
 */

public class LabTest1 {
    
 /**
 *
 * @Param unsorted array
 * 
 */
	
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) 
        { 
            int index = i;
            for (int j = i+1; j < len; j++){ 
                if (unsorted[j] < unsorted[index]){
                     index = j;
                }
                
                    int t = unsorted[index];
                    unsorted[index] = unsorted[i];
                    unsorted[i] = t;
                }
            }
        }
    
    /**
 *
 * @Param unsorted array
 * 
 */
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        for (int i = 0; i < ln; ++i) {
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
 * @Param unsorted array
 * 
 */
    void sortFunction9(int unsorted[])
    {
        int index;
        int n = unsorted.length;
        
        for (index = 0; index < n-1;index++) { 
            for(int i = 0; i < n - index - 1 ; i++){
                if (unsorted[i] > unsorted[i+1]){
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                }
           }
        }
        
    }
    /**
    *
    * @Param unsorted array
    * 
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
 * @param args the command line arguments
 * 
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
