package labtest1;
import java.util.Arrays;

//@author Akhilesh Ganapathyraju

public class LabTest1 {
    void sortFunction4(int unsorted[])
    {
        /** 
         * Function generates the array output in ascending order.
         */
        int index = 0;
        int n = unsorted.length;
        while (index <= n-1) { //error was the fact that n was out of bounds,
            //so n - 1 makes it inbounds
            if (index == 0)
                index++; 
            if (unsorted[index - 1] < unsorted[index]) //flipped > sign to < to make it ascending
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
 
    void sortFunction5(int unsorted[]) 
    {
        /** 
         * Function generates the array output in ascending order.
         */
        int n = unsorted.length;
        int min = unsorted[0];
        int max = unsorted[n-1]; // error was again n being out of bounds, being fixed by n-1
        int range, i, j, index;
 
        for(int a=0; a < n; a++) //a has to be less than or equal to n otherwise last element is neglected
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
            while(phole[j]-->0)
                unsorted[index++]=j+min;
    }
     
    void sortFunction6(int unsorted[]) 
    {
        /** 
         * Function generates the array output in ascending order.
         */
        boolean isSorted = false;
        int n = unsorted.length;
        while (!isSorted)
        {
            isSorted = true;
            int temp; // removed zero
 
            for (int i=1; i<=n-2; i=i+2)
            {
                if (unsorted[i+ 1] < unsorted[i]) //flipped > sign to <
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
     
    void printArray(int arr[])
    {
        /** 
         * Method prints array in proper order.
         */
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    
    public static void main(String[] args) {
        /** 
         * Main method calls LabTest1 Class and calls it obj
         * uses all three sortFunctions and sorts the same array
         */
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
