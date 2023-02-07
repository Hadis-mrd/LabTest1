package labtest1;
import java.util.Arrays;
/**
 * 
 * @author Ryan Vemulapalli
 * @version 1.1
 * @since 2-7-2023
*/
public class LabTest1 {
    
    /**
     * Takes in a unsorted int array and when passed through this method,
     * the array is sorted from least to greatest
     * 
     * @param unsorted integer array, 
    */
    void sortFunction4(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { //Changed from <= to < to fix the java.lang.ArrayIndexOutOfBoundsException
            if (index == 0)
                index++; 
            if (unsorted[index - 1] < unsorted[index]) //Was doing greatest to least so made it < rather than >
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
     * Takes in a unsorted int array and when passed through this method,
     * the array is sorted from least to greatest
     * 
     * @param unsorted integer array, 
    */
    void sortFunction5(int unsorted[]) 
    {
        int n = unsorted.length;
        int min = unsorted[0];
        int max = unsorted[n-1]; // Added -1 to fix: java.lang.ArrayIndexOutOfBoundsException
        int range, i, j, index;
 
        for(int a=0; a<n; a++)
        {
            if(unsorted[a] > max) // Changed to > does not make sense as a <
                max = unsorted[a];
            if(unsorted[a] < min) // Changed to < does not make sense as a >
                min = unsorted[a];
        }
 
        range = max - min + 1;
        int[] phole = new int[range];
        Arrays.fill(phole, 0);
 
        for(i = 0; i < n; i++)
            phole[unsorted[i] - min]++;
 
         
        index = 0;
 
        for(j = 0; j<range; j++)
            while(phole[j]-->0)
                unsorted[index++]=j+min;
    }
    
    /**
     * Takes in a unsorted int array and when passed through this method,
     * the array is sorted from least to greatest
     * 
     * @param unsorted integer array, 
    */
    void sortFunction6(int unsorted[]) 
    {
        boolean isSorted = false;
        int n = unsorted.length;
        while (!isSorted)
        {
            isSorted = true;
            int temp =0;
 
            for (int i=1; i<=n-2; i++) //Was adding two each time for some reason, changed to i++
            {
                if (unsorted[i + 1] < unsorted[i]) // Changed to < does not make sense as a >
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
     * Takes in a array of integers and prints each int in the array
     * @param arr is an array of integers
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
