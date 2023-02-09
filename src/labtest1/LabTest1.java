package labtest1;

/**
 * @author      ZachMcMurray
 * @version     1.1
 * @since       2023-01-09
 */
public class LabTest1 {

    /**
     * sorts an array in increasing order
     *
     * @param unsorted an unsorted array
     */
    public void sortFunction7(int unsorted[]) {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) {//changed range
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

    /**
     * sorts an array in increasing order
     *
     * @param unsorted an unsorted array
     */
    public void sortFunction8(int unsorted[]) {
        int temp;//added to help switch spots
        int ln = unsorted.length;
        for (int i = 0; i < ln - 1; ++i) {//deleted item and changed range
            int j = i + 1;

            while (j > 0 && unsorted[j] <= unsorted[j - 1]) {
                temp = unsorted[j - 1];
                unsorted[j - 1] = unsorted[j];//moved inside the loop
                unsorted[j] = temp;
                j = j - 1;
            }
        }
    }

    /**
     * sorts an array in decreasing order
     *
     * @param unsorted an unsorted array
     */
    public void sortFunction9(int unsorted[]) {
        int index = 0;
        int n = unsorted.length;
        while (index < n) {
            if (index == 0) {
                index++;
            }
            if (unsorted[index - 1] > unsorted[index]) {
                index++;
            } else {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index++;//changed to ++
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

        int unsorted7[] = {76, 45, 10, 29, 10};
        obj.sortFunction7(unsorted7);
        System.out.println("Sorted array7 : ");
        obj.printArray(unsorted7);

        int unsorted8[] = {76, 45, 10, 29, 10};
        obj.sortFunction8(unsorted8);
        System.out.println("Sorted array8 : ");
        obj.printArray(unsorted8);

        int unsorted9[] = {76, 45, 10, 29, 10};
        obj.sortFunction9(unsorted9);
        System.out.println("Sorted array9 : ");
        obj.printArray(unsorted9);

    }

}
