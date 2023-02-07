package labtest1;

/**
 * @author Christian Arence Macalintal
 */
import java.util.Arrays;

public class LabTest1 {

    public void sortFunction4(int unsorted[]) {
        int index = 0;
        int n = unsorted.length;
        for (int i = 0; i < n; i++) { // run the sorting function n amount of time to get all the elements in order
            index = 0;
            while (index < n) {
                if (index == 0) {
                    index++;
                }
                if (unsorted[index - 1] < unsorted[index]) { // if the the element on top is greater than the bottom, continue
                    index++;
                } else {// if not, then switch the top and the bottom
                    int temp = 0;
                    temp = unsorted[index];
                    unsorted[index] = unsorted[index - 1];
                    unsorted[index - 1] = temp;
                    index++;
                }
            }
        }
    }

    public void sortFunction5(int unsorted[]) {
        int n = unsorted.length;
        int min = unsorted[0]; //minimum should be the first 
        int max = unsorted[n - 1];// maximum should be the last
        int range, i, j, index;

        for (int a = 0; a < n; a++) {
            if (unsorted[a] > max) { // if the number is greater than the maximum, it becomes the maximum
                max = unsorted[a];
            }
            if (unsorted[a] < min) {
                min = unsorted[a]; // if the number is less than the minimum, it becomes the minimum
            }
        }

        range = max - min + 1;
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

    public void sortFunction6(int unsorted[]) {
        boolean isSorted = false;
        int n = unsorted.length;
        while (false == isSorted) {

            int temp = 0;
            for (int x = 0; x < n; x++) { // repeat the process n-1 amount of times
                for (int i = 0; i <= n - 2; i++) {
                    if (unsorted[i + 1] < unsorted[i]) { // if then number on top is less than the number on the bottom
                        temp = unsorted[i];
                        unsorted[i] = unsorted[i + 1];// switch the numbers
                        unsorted[i + 1] = temp;

                    }
                }
            }
            for (int i = 0; i <= n - 2; i++) {
                if (unsorted[i] < unsorted[i + 1]) { //if all then numbers are in order, isSorted becomes true which ends the loop

                    isSorted = true;

                } else {
                    isSorted = false;
                }

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

        int unsorted4[] = {64, 25, 12, 22, 11};
        obj.sortFunction4(unsorted4);
        System.out.println("Sorted array4 : ");
        obj.printArray(unsorted4);

        int unsorted5[] = {64, 25, 12, 22, 11};
        obj.sortFunction5(unsorted5);
        System.out.println("Sorted array5 : ");
        obj.printArray(unsorted5);

        int unsorted6[] = {64, 25, 12, 22, 11};
        obj.sortFunction6(unsorted6);
        System.out.println("Sorted array6 : ");
        obj.printArray(unsorted6);

    }

}
