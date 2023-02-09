package labtest1;

/**
 *
 * @author dania
 * @version 1.00
 */
public class LabTest1
{
    /**
     *
     * @param unsorted
     */
    void sortFunction7(int unsorted[])
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) //i should only be less than len, not equal to.
        {
            int index = i;
            for (int j = i + 1; j < len; j++)   //Condition had to be changed to len, instead of len - 1, so the last position compared is zero.
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }

    /**
     *
     * @param unsorted
     */
    void sortFunction8(int unsorted[])
    {
        int ln = unsorted.length;
        for (int i = 0; i < ln; ++i) //i has to start at 0 to account for the starting index of the array.
        {
            int item = unsorted[i];
            int j = i - 1;  //Adjusted "i - 1" instead of "i + 1", to compare with each item in reverse order.

            while (j >= 0 && unsorted[j] > item)    //Loop must account for when j = 0 to account for starting position of array.
            {
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j + 1] = item;
        }
    }

    /*
    For loop added to iterate index from 1 to n-1, ensuring that index always stays within the bounds of the array.
    The original 2 if statements were removed as they were unnecesary.
    While loop adjusted to check if index is greater than 0 and if unsorted[index-1] is greater than unsorted[index].
    If the conditions are not met, the while loop terminates, and the outer for loop increments index to move on to the next iteration.
     */
    /**
     *
     * @param unsorted
     */
    void sortFunction9(int unsorted[])
    {
        int n = unsorted.length;
        for (int index = 1; index < n; index++)
        {
            while (index > 0 && unsorted[index - 1] > unsorted[index])
            {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
        }
    }

    /**
     *
     * @param arr
     */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        LabTest1 obj = new LabTest1();

        int unsorted7[] =
        {
            76, 45, 10, 29, 10
        };
        obj.sortFunction7(unsorted7);
        System.out.println("Sorted array7 : ");
        obj.printArray(unsorted7);

        int unsorted8[] =
        {
            76, 45, 10, 29, 10
        };
        obj.sortFunction8(unsorted8);
        System.out.println("Sorted array8 : ");
        obj.printArray(unsorted8);

        int unsorted9[] =
        {
            76, 45, 10, 29, 10
        };
        obj.sortFunction9(unsorted9);
        System.out.println("Sorted array9 : ");
        obj.printArray(unsorted9);
    }
}
