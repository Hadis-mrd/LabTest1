package labtest1;


public class LabTest1 {
   
    
    void sortFunction1(int unsorted[])
    {
        int len = unsorted.length;
        for (int i = 0; i < len-1; i++) //the should run from 0 - len - 1(since arrays take elements of one less then what is entered, they start elements at 0) - This will prevent out of bounnds array of index
        { 
            int index = i;
            for (int j = i+1; j < len; j++) //should be j < len, to prevent array out of bounds for accessing elements
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
                if (unsorted[j] > unsorted[j+1]) //change to unsorted [j] > unsorted [j+1], you are comparing the arrays in the 'j' for loop 
                { 
                    int t = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = t;
                }
    }
     
    void sortFunction3(int unsorted[])
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];
            int j = i - 1; //j should be decremented to traverse the array in reverse order 
            
            while (j >= 0 && unsorted[j] > item) { //j should start at 0 and keep incrementing do to the j to take into account of every element in the array and make sure no out of bounds array exception. j will increment itself for each loop due to the j+1 in the loop
                unsorted[j+1] = unsorted[j]; //the new unsorted of element j, becomes the element of one less than itself 
                j = j - 1;
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
        
        int unsorted3[] = {64,25,12,22,11};
        obj.sortFunction3(unsorted3);
        System.out.println("Sorted array3 : ");
        obj.printArray(unsorted3);
       
    }
    
}
