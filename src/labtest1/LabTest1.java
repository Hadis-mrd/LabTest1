package labtest1;

/**
 * LabTest1 class contains methods to sort an array of integers using three different sorting algorithms.
 * sortFunction4 sorts the array using the insertion sort algorithm.
 * sortFunction5 sorts the array using the counting sort algorithm.
 * sortFunction6 sorts the array using the bubble sort algorithm.
 * printArray is used to print the sorted array.
 * 
 * @author  Brendon Milagrosa
 * @version 2
 * @since   2023-02-07
 */


import java.util.Arrays;

public class LabTest1 {
    void sortFunction4(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) {                                                     //only less than 'n' and not '<='
            if (index == 0)
                index++; 
            else if (unsorted[index - 1] > unsorted[index]){                    //changed to 'else if' and swapped contents with the 'else' statement below it
                int temp = 0;
                temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
                
            else {
                index++;
            }
        }
    }
 
    void sortFunction5(int unsorted[]) 
    {
        int n = unsorted.length;
        int min = unsorted[0];
        int max = unsorted[0];                                                  //changed to 0 instead of 'n'
        int range, i, j, index;
 
        for(int a=0; a<n; a++)
        {
            if(unsorted[a] > max)                                               //value sign changed from < to >
                max = unsorted[a];
            if(unsorted[a] < min)                                               //value sign changed from > to <
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
     
    void sortFunction6(int unsorted[]) 
    {
        boolean isSorted = false;
        int n = unsorted.length;
        while (!isSorted)
        {
            isSorted = true;
            int temp =0;
 
            for (int i=0; i<= n-2; i++)                                         //changed 'i' to increment to go through whole array
            {
                if (unsorted[i + 1] < unsorted[i])                              //value sign flipped
                {
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i+1];
                    unsorted[i+1] = temp;
                    isSorted = false;
                }
            } 
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
