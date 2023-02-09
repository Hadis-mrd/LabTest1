package labtest1;

/**
 * @author mbhatt13 
 */
public class LabTest1 {
	
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i <= len-1; i++) //Need len-1 so it doesnt go out of bounds from the array
        { 
            int index = i;
            for (int j = i; j < len; j++) //No -1 there should be
            if (unsorted[j] < unsorted[index])
            index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
            //fixed indentation
                  
        }
    }
    /**
     * 
     * @param unsorted the array being passed into the sort function
     */
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];
            int j = i-1; 
            
            while (j >= 0 && unsorted[j] > item) { //added >= instead of > so it includes 0
                
                int temparr = unsorted[j+1]; //added a temporary array
                unsorted[j + 1] = unsorted[j];
        unsorted[j] = temparr;
        j = j - 1;
            }
            
        }
    }
    
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { //<= to <n
            if (index == 0)
                index++; 
            if (unsorted[index-1] > unsorted[index])
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
