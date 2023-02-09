package labtest1;

public class LabTest1 {
	
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
    //Changed 'i<= len' to 'i<len'
        for (int i = 0; i < len; i++) 
        { 
            int index = i;
    //Changed 'len-1' to 'len' & 'j = i+1' to 'j=0'
            for (int j = 0; j < len; j++){ 
     //Changed '<' to '>'
                if (unsorted[j] > unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
            }
        }
    }
    //Fixed
 
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
      //Changed i = 1 to i = 0
        for (int i = 0; i < ln; ++i) {
            int item = unsorted[i];
      //Changed 'j = i+1' to 'j=0'
            int j = i-1; 
//Changed several parameters in the while loop to get rid of syntax error and adjust some logistical error       
            while ((j > 0) && (unsorted[j+1] > unsorted[j])) {
                unsorted[j+1] = unsorted[j];
                j--;
                
            }
            unsorted[j+1] = item;
            
        }
    }
//Sorts in descending order
    
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
 //Changed 'index <= n' to 'index < n'
        while (index < n) { 
            if (index == 0)
                index++; 
 //Changed '>' to '<'
            if (unsorted[index-1] < unsorted[index])
                index++;
            else {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
        }
    }
//Fixed
    
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
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
