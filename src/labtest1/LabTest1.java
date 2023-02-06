package labtest1;

/**
 * @author Kaden Russell
 * @version 1.1
 * @since 02/06/23
 */
public class LabTest1 {

    /**
     * This method sorts an array of numbers
     *
     * @param unsorted is an array of integer numbers
     */
    void sortFunction1(int unsorted[]) {
        int len = unsorted.length;     //len=5  //{64,25,12,22,11}
        for (int i = 0; i < len; i++) {
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
     * This method sorts an array of numbers
     *
     * @param unsorted is an array of integer numbers
     */
    void sortFunction2(int unsorted[]) {
        int length = unsorted.length;          //length=5
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if (unsorted[i] > unsorted[j]) {
                    int t = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = t;
                }
            }
        }
    }

    /**
     * This method sorts an array of numbers
     *
     * @param unsorted is an array of integer numbers
     */
    void sortFunction3(int unsorted[]) {
        int ln = unsorted.length;       //ln=5
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];            //{64,25,12,22,11}
            int j = i-1;

            while (j >= 0 && unsorted[j] > item) {
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j+1] = item;
        }
    }

    /**
     * This method prints an array of numbers
     *
     * @param arr is an array of integer numbers
     */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     *
     * @param args main class parameter
     */
    public static void main(String[] args) {
        LabTest1 obj = new LabTest1();

        int unsorted[] = {64, 25, 12, 22, 11};
        obj.sortFunction1(unsorted);
        System.out.println("Sorted array1 : ");
        obj.printArray(unsorted);

        int unsorted2[] = {64, 25, 12, 22, 11};
        obj.sortFunction2(unsorted2);
        System.out.println("Sorted array2 : ");
        obj.printArray(unsorted2);

        int unsorted3[] = {64, 25, 12, 22, 11};
        obj.sortFunction3(unsorted3);
        System.out.println("Sorted array3 : ");
        obj.printArray(unsorted3);

    }

}
