package labtest1;
/**
*
*
*@author Kevin Paknia
*@version 2.01
*@since 2023-02-09
*/
public class LabTest1 {
	
    void sortFunction7(int unsorted[]) 
            /**
             * Fixed the errors with the select sort method
             * 
             */
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) // changed <= with <
        { 
            int index = i;
            for (int j = i; j < len; j++) { // removed the i+1 and the len-1 and added appropirate {}
                if (unsorted[j] < unsorted[index]){ // added appropriate {}
                    index = j;
                }
            }
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
 
    void sortFunction8(int unsorted[]) 
             /**
             *  fixed the bugs with the insert sort method
             * 
             */
{
    
    int ln = unsorted.length;
    for (int i = 0; i < ln; i++) { // made i = 0 and changed ++i to i++
        int item = unsorted[i];
        int j = i; // got rid of + 1
        
        while (j > 0 && unsorted[j - 1] > item) { // made it j-1
            unsorted[j] = unsorted[j - 1]; // got rid of the j+1 and did j-1 on the other term
            j--;
        }
        unsorted[j] = item; // got rid of plus 1
    }
}
    void sortFunction9(int unsorted[])
             /**
             * fixed errors with the buble sort method
             * 
             */
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { // got rid of the =
            if (index == 0)
                index++; 
            if (unsorted[index-1] <= unsorted[index]) // changed > to <=
                index++;
            else {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
        }
    }
    
    void printArray(int arr[])
             /**
             * 
             * 
             */ 
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
