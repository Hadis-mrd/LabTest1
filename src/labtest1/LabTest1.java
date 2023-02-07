package labtest1;
import java.util.Arrays;

/**
 * 
 * @author shale
 */
public class LabTest1 {
    
    /**
     * a function to sort an integer array
     * 
     * @param unsorted an unsorted array of integers
     */
    public void sortFunction4(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) {  // changed from <= to < to avoid out of bounds
            if (index == 0)
                index++; 
            
            // flipped if and else statements
            if (unsorted[index - 1] > unsorted[index]) {
                int temp = 0;
                temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
            else{ 
                index++;
                    }
            
        }
    }
 
    /**
     * a second function to sort an integer array
     * 
     * @param unsorted an unsorted array of integers
     */
    public void sortFunction5(int unsorted[]) 
    {
        int n = unsorted.length;
        int min = unsorted[0];
        int max = unsorted[n-1]; // n -> n-1
        int range, i, j, index;
 
        for(int a=0; a<n; a++)
        {
            if(unsorted[a] > max)  // flipped < to >
                max = unsorted[a];
            if(unsorted[a] < min) // flipped > to <
                min = unsorted[a];
        }
 
        range = max - min + 1;
        int[] phole = new int[range];
        Arrays.fill(phole, 0);
 
        for(i = 0; i<n; i++)
            phole[unsorted[i] - min]++;
 
         
        index = 0;
 
        for(j = 0; j<range; j++)
            while(phole[j]-->0)
                unsorted[index++]=j+min;
    }
    
    /**
     * a third function to sort an integer array
     * 
     * @param unsorted an unsorted array of integers
     */
    public void sortFunction6(int unsorted[]) 
    {
        boolean isSorted = false;
        int n = unsorted.length;
        while (!isSorted)
        {
            isSorted = true;
            int temp =0;
 
            for (int i=1; i<=n-2; i=i+2)
            {
                if (unsorted[i + 1] < unsorted[i]) // > -> <
                {
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i+1];
                    unsorted[i+1] = temp;
                    isSorted = false;
                }
            }
 
            for (int i=0; i<=n-2; i=i+2)
            {
                if (unsorted[i] > unsorted[i+1])
                {
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i+1];
                    unsorted[i+1] = temp;
                    isSorted = false;
                }
            }
        }
    }
    
    /**
     * a method to print all the values stored in an array
     * 
     * @param arr 
     */
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    
    public static void main(String[] args) {
        LabTest1 obj = new LabTest1();
        
        int unsorted4[] = {64,25,12,22,11};
        obj.sortFunction4(unsorted4);
        System.out.println("Sorted array4 : ");
        obj.printArray(unsorted4);
        
        
        int unsorted5[] = {64,25,12,22,11};
        obj.sortFunction5(unsorted5);
        System.out.println("Sorted array5 : ");
        obj.printArray(unsorted5);
        
        int unsorted6[] = {64,25,12,22,11};
        obj.sortFunction6(unsorted6);
        System.out.println("Sorted array6 : ");
        obj.printArray(unsorted6);
       
    }
    
}
