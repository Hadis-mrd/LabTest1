package labtest1;
import java.util.Arrays;


/**
 * <h2>Sort an Array Using 3 Different Methods</h2>
 * The LabTest1 program implements an application that 
 * sorts an array using 3 different sorting
 * algorithms and prints the sorted arrays to the screen 
 * 
 * 
 * @author tylerwarwick
 * @version 2.0
 */
public class LabTest1 {
    
    /** 
     * This method is used to sort an array
     * @param unsorted array passed to sortFunction4
     */
    void sortFunction4(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { 
            if (index == 0)
                index++; 
            if (unsorted[index - 1] < unsorted[index]) 
                index++;
            else {
                int temp = 0;
                temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
        }
    }
    
    /** 
     * This method is used to sort an array
     * @param unsorted array passed to sortFunction5
     */
    void sortFunction5(int unsorted[]) 
    {
        int n = unsorted.length;
        int min = unsorted[0];
        int max = unsorted[n-1];
        int range, i, j, index;
 
        for(int a=0; a<n; a++)
        {
            if(unsorted[a] > max) 
                max = unsorted[a];
            if(unsorted[a] < min) 
                min = unsorted[a];
        }
 
        range = max - min + 1;
        int[] phole = new int[range];
        Arrays.fill(phole, 0);
 
        for(i = 0; i<n; i++)
            phole[unsorted[i] - min]++;
 
         
        index = 0;
 
        for(j = 0; j<range; j++)
            while(phole[j]-- > 0)
                unsorted[index++]=j+min;
    }
     
    /** 
     * This method is used to sort an array
     * @param unsorted array passed to sortFunction6
     */
    void sortFunction6(int unsorted[]) 
    {
        boolean isSorted = false;
        int n = unsorted.length;
        while (!isSorted)
        {
            isSorted = true;
            int temp =0;
 
            for (int i=1; i<=n-2; i=i+2)
            {
                if (unsorted[i + 1] < unsorted[i]) 
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
     * This method is used to print an array to the screen
     * @param arr array passed to be printed by function
     */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    /**
     * This is the main method that makes use of the sorting and printing methods
     * @param args unused
     */
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
