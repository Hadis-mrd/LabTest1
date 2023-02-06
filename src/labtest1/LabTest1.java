package labtest1;
/**
 *
 * @author epgae
 */

public class LabTest1 {
    void sortFunction1(int unsorted[])
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) //<, previously <=, caused it to go out of array
        { 
            int index = i;
            for (int j = i+1; j < len; j++) //< len instead of len-1, to reach full bounds of array
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
 
    void sortFunction2(int unsorted[])
    {
        int length = unsorted.length;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (unsorted[j] > unsorted[j+ 1]) { //j > j+1 not > i. 
                    int t = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = t;
                }
    }
     
    void sortFunction3(int unsorted[])
{
    int ln = unsorted.length;
    for (int i = 1; i < ln; i++) {
        int item = unsorted[i];
        int j = i - 1; //j - 1 instead of + 1 
        
        while (j >= 0 && unsorted[j] > item) {  //can be = to 0
            unsorted[j + 1] = unsorted[j];
            j--; //changed the way it decreases
        }
        unsorted[j + 1] = item;
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
        
        int unsorted[] = {64,25,12,22,11};
        obj.sortFunction1(unsorted);
        System.out.println("Sorted array1 : ");
        obj.printArray(unsorted);
        
        
        
        int unsorted2[] = {64,25,12,22,11};
        obj.sortFunction2(unsorted2);
        System.out.println("Sorted array2 : ");
        obj.printArray(unsorted2);
        
        int unsorted3[] = {64,25,12,22,11}; //causing most errors after first fixes
        obj.sortFunction3(unsorted3);
        System.out.println("Sorted array3 : ");
        obj.printArray(unsorted3);
       
    }
    
}
