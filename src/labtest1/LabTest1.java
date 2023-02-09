package labtest1;


public class LabTest1 {
	
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length; // length of the array
        for (int i = 0; i < len; i++) //changed from <= to < as the for loop was going too long 
        { 
            int index = i;
            for (int j = i+1; j < len; j++) //-1 taken out as the for loop was running for too long  
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
 
    void sortFunction8(int unsorted[]) 
    {  
    int len = unsorted.length;    
    int item;
        for(int i = len-1; i>=0; --i ){ // for loop was changed to a decrement so j is not outside boundaries of 
         for(int j = i-1; j>=0; --j){ //while loop changed to for loop
            if(unsorted[i]>unsorted[j]){
               item = unsorted[i]; //item defined here rather than further up;
               unsorted[i] = unsorted[j];//i and j swap places similar to original code.
               unsorted[j] = item;
            }
    }
        }
    }
    
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length; //length of array
        while (index < n) { //until index is larger than the length of the array ; changed to < from =< as it inclued n which would be null
            if (index == 0) //if index is 0 plus 1
                index++;  
            else if (unsorted[index-1] > unsorted[index]) //changed to an else if statement so code does not use unsorted[index-1] when index == 0
                index++;    //if val in unsorted[i] is smaller than the one in [i-1]
            else {
                int temp = unsorted[index]; //if index is bigger than index-1, they swap places
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index++; //changed from -- to ++
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
