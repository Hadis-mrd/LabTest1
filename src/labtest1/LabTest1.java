/**
 * @author Zain Siddiqui
 * @version 2.0
 * @since 2022-02-08
 */

package labtest1;

public class LabTest1 {
 /**
 * @param args use to sort input numbers using different methods.
 * 
 */
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++)// removed <=
        { 
            int index = i;
            for (int j = i+1; j < len; j++)//removed -1
            
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
        for (int i = 0; i < ln; i++) {//look
            int item = unsorted[i];
            int j = i - 1; //chaged to minus
            
            while (j >= 0 && unsorted[j] > item) {//changed to j greater and equal to
                unsorted[j + 1] = unsorted[j];//chamged sin
                j = j - 1;
            }
            unsorted[j + 1] = item;
        }
    }
    
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n)//removed equals
        { 
            if (index == 0)//added curly brackets
            {
                index++;
            }
            if (unsorted[index-1] < unsorted[index])// flipped the sign
            {
                index++;  
            } 
            else 
            {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
        }
    }
    
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
 
    
    public static void main(String[] args) {
        LabTest1 obj = new LabTest1();
        
        int unsorted7[] = {74,25,13,22,8};
        obj.sortFunction7(unsorted7);
        System.out.println("Sorted array7 : ");
        obj.printArray(unsorted7);
        
        int unsorted8[] = {74,25,13,22,8};
        obj.sortFunction8(unsorted8);
        System.out.println("Sorted array8 : ");
        obj.printArray(unsorted8);
        
        int unsorted9[] = {74,25,13,22,8};
        obj.sortFunction9(unsorted9);
        System.out.println("Sorted array9 : ");
        obj.printArray(unsorted9);
       
    }
    
}
