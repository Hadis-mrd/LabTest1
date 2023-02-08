/*************************************
 * Programmer: Joaquin Fernandez
 * Program: LabTest1.java
 * Date: February 8th, 2023
 * Description:
 * Debug the code given (Lab Test 1)
 ************************************/

package labtest1;

public class LabTest1 {
	
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i <= len - 1; i++)//changed 'i <= len' to, "i <= len -1'
        { 
            int index = i;
            for (int j = i + 1; j < len; j++)//changed 'j < len - 1' to, 'j < len'
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }//end of sortFunction7
 
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) 
        {
            int item = unsorted[i];
            int j = i - 1;//changed 'int j = i + 1' to, 'int j = i - 1' 
            
            while (j >= 0 && unsorted[j] > item)//changed 'j > 0' to 'j >= 0' 
            { 
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j + 1] = item;
        }
    }//end of sortFunction8
    
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n)//changed 'index <= n' to 'index < n'
        { 
            if (index == 0)
                index++; 
            if (unsorted[index-1] < unsorted[index])//flipped the operator symbol 
                index++;
            else {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
        }
    }//end of sortFunction9
    
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }//end of printArray
 
    
    public static void main(String[] args) 
    {
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
       
    }//end of main
    
}//end of class
