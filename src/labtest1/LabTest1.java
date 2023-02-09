package labtest1;

/**
 *
 * @author Carter Rows - 1170615
 * @since February 9th, 2023
 * 
 */

public class LabTest1 {
	
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len-1; i++) 
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
    
    void sortFunction9(int unsorted[])
    {
        int index = 1;
        int n = unsorted.length;
        while (index < n) { 
            int key = unsorted[index];
            int i = index - 1;
            while (i >= 0 && unsorted[i] > key) {
                unsorted[i+1] = unsorted[i];
                i = i - 1;
            }
            unsorted[i+1] = key;
            index = index + 1;
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
