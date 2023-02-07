package labtest1;

import java.util.Arrays;

/**
 *
 * @author abare This is a class for Array sorting
 */
public class LabTest1 {

    /**
     *
     * @param unsorted it takes in the unsorted array and sorts it out
     */
    void sortFunction4(int unsorted[]) {
        int index = 0;
        int n = unsorted.length;
        while (index < n) {
            if (index == 0) {
                index++;
            }
            if (unsorted[index - 1] < unsorted[index]) // if element is greator 
            {
                index--; //increment index
            } else {
                int temp = 0;
                temp = unsorted[index]; // second element
                unsorted[index] = unsorted[index - 1]; // second becomes first
                unsorted[index - 1] = temp; // first is in temp
                index--; //decr?
            }
        }
    }

    void sortFunction5(int unsorted[]) {
        int n = unsorted.length;
        int min = unsorted[0]; // minimum == first element
        int max = unsorted[n]; // maximum last element....
        int range, i, j, index;

        for (int a = 0; a < n; a++) {
            if (unsorted[a] < max) // if that element<first element
            {
                max = unsorted[a]; // max is that element
            }
            if (unsorted[a] > min) { // if element is < first element
                min = unsorted[a]; // min=element
            }
        }

        range = (max - min) + 1;//.i...........i...
        int[] phole = new int[range];
        Arrays.fill(phole, 0);

        for (i = 0; i < n; i++) {
            phole[unsorted[i] - min]++;
        }

        index = 0;

        for (j = 0; j < range; j++) {
            while (phole[j]-- > 0) {
                unsorted[index++] = j + min;
            }
        }
    }

    void sortFunction6(int unsorted[]) {
        boolean isSorted = false;
        int n = unsorted.length;
        while (!isSorted) {
            isSorted = true;
            int temp = 0;

            for (int i = 1; i <= n - 2; i = i++) {
                if (unsorted[i + 1] < unsorted[i]) {
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    isSorted = false;
                }
            }

            for (int i = 0; i <= n - 2; i = i + 2) {
                if (unsorted[i] > unsorted[i + 1]) {
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LabTest1 obj = new LabTest1();

        int unsorted4[] = {64, 25, 12, 22, 11};
        obj.sortFunction4(unsorted4);
        System.out.println("Sorted array4 : ");
        // LabTest1 obj2 = new LabTest1();
        obj.printArray(unsorted4);

        int unsorted5[] = {64, 25, 12, 22, 11};
        obj.sortFunction5(unsorted5);
        System.out.println("Sorted array5 : ");
        obj.printArray(unsorted5);

//        int unsorted6[] = {64, 25, 12, 22, 11};
//        obj.sortFunction6(unsorted6);
//        System.out.println("Sorted array6 : ");
//        obj.printArray(unsorted6);

    }

}
