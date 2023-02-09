package labtest1;

public class LabTest1 {

    void sortFunction7(int unsorted[]) {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) { //Removed = to avoid i reaching the limit of the array value
            int index = i;
            for (int j = i + 1; j < len; j++) {
                if (unsorted[j] < unsorted[index]) {
                    index = j;
                    
                }
            }
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }

    void sortFunction8(int unsorted[]) {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];
            int j = i - 1; //Changed to i - 1 to avoid creating an index of 6 which is larger than array

            while (j >= 0 && unsorted[j] > item) { //j >= 0 allows first element to be sorted as well, otherwise it is skipped 
                unsorted[j + 1] = unsorted[j]; 
                j = j - 1;
            }     
            unsorted[j+1] = item;
        }
    }

    void sortFunction9(int unsorted[]) { //
        int index = 0;
        int n = unsorted.length;
        while (index <= n){
            if (index == 0) {
                index++;
            }
            if (unsorted[index - 1] > unsorted[index]) {
                index++;
            } else {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LabTest1 obj = new LabTest1();

        int[] unsorted7 = {76, 45, 10, 29, 10}; //Changed formatting
        obj.sortFunction7(unsorted7);
        System.out.println("Sorted array7 : ");
        obj.printArray(unsorted7);

        int[] unsorted8 = {76, 45, 10, 29, 10}; //Changed formatting
        obj.sortFunction8(unsorted8);
        System.out.println("Sorted array8 : ");
        obj.printArray(unsorted8);

        int[] unsorted9 = {76, 45, 10, 29, 10}; //Changed formatting
        obj.sortFunction9(unsorted9);
        System.out.println("Sorted array9 : ");
        obj.printArray(unsorted9); 

    }

}
