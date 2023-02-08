/**
 * @author marquezc-1234247
 * file:///C:/Users/camer/OneDrive/Documents/NetBeansProjects/LabTest1-marquezc-1234247/dist/javadoc/labtest1/package-summary.html
 */
package labtest1;

public class LabTest1 {

    /**
     * 
     * @param unsorted passes a specified array to the method to sort it in ascending order
     */
    void sortFunction7(int unsorted[]) 
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) //Changed "<=" to "<" since the first element of an array is 0 not 1 meaning if it was "<=" it would check element 5 which does not exist in the array
        { 
            int index = i;
            for (int j = i+1; j < len; j++) //Changed "len - 1" to "len" so that it will include the last element of the array when sorting
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
 
    /**
     * 
     * @param unsorted passes a specified array to the method to sort it in ascending order
     */
    void sortFunction8(int unsorted[]) 
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; i++) { //Changed "++i" to "i++", so it will add 1 to i at the end of the for loop instead of at the start of the for loop
            int item = unsorted[i];
            int j = i; //Changed "j=i+1" to "j=i", so that j does not go over the length of the array
            
            while (j > 0 && unsorted[j - 1] > item) { //Changed "[j]" to "[j-1]", so that it will check before the element of index i instead of the element of index i itself
                unsorted[j] = unsorted[j - 1]; //Changed "[j+1]" to "[j]", and "[j]" to "[j-1]", so that it will make the element of index i equal to the element of index i-1
                j = j - 1;
            }
            unsorted[j] = item; //Changed "[j+1]" to "[j]", so that it will change the element of index i to the element that was replaced in teh previous section of code
        }
    }
    
    /**
     * 
     * @param unsorted passes a specified array to the method to sort it in ascending order
     */
    void sortFunction9(int unsorted[])
    {
        int index = 0;
        int n = unsorted.length;
        while (index < n) { //Changed "<=" to "<" since the first element of an array is 0 not 1 meaning if it was "<=" it would check element 5 which does not exist in the array
            if (index == 0)
                index++; 
            if (unsorted[index-1] < unsorted[index]) //Changed ">" to "<" so that if the element that is being checked is less than the current element it will skip the index that is being checked
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
