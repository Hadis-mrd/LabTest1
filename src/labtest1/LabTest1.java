package labtest1;

public class LabTest1 {
	
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++)   //removed = from i<=len to fix error
        { 
            int index = i;
            for (int j = i+1; j < len; j++) //removed -1 from len-1 to fix error
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
        for (int i = 0; i < ln; i++) {  //changed 1 in i=1 to 0 and ++i to i++
            int item = unsorted[i];
            int j = i;  //changed j=i+1 to j=i
            
            while (j > 0 && unsorted[j-1] > item) { //unsorted[j] to unsorted[j-1]
                unsorted[j] = unsorted[j-1];    //changed unsorted[j + 1] = unsorted[j] to unsorted[j] = unsorted[j-1]
                j--;    //changed j=j-1 to j--
            }
            unsorted[j] = item; //changed unsorted[j + 1] = item to unsorted[j] = item
        }
    }
    
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { //removed = from index <=n
            if (index == 0)
                index++; 
            if (unsorted[index-1] <= unsorted[index])    //changed > to <=
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
