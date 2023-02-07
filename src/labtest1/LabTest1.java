package labtest1;
import java.util.Arrays;
public class LabTest1 {
    void sortFunction4(int unsorted[])
    {
        int index = 0;
        int length = unsorted.length;
        while (index < length) { 
            if (index == 0)
                index++; 
            if (unsorted[index - 1] < unsorted[index])     
                index++;
            else {
                int temp = 0;
                temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index--;
            }
        }
    }

void sortFunction5(int unsorted[]) 
{
    int length = unsorted.length;
    int min = unsorted[0];
    int max = unsorted[length - 1];
    int range, i, j, index;

    for(int a=0; a<length; a++)
    {
        if(unsorted[a] < min) 
            min = unsorted[a];
        if(unsorted[a] > max) 
            max = unsorted[a];
    }

    range = max - min + 1;
    int[] phole = new int[range];
    Arrays.fill(phole, 0);

    for(i = 0; i<length; i++)
        phole[unsorted[i] - min]++;


    index = 0;

    for(j = 0; j<range; j++)
        while(phole[j]-->0)
            unsorted[index++]=j+min;
}

void sortFunction6(int unsorted[]) 
    {
        boolean isSorted = false;
        int length = unsorted.length;
        while (!isSorted)
        {
            isSorted = true;
            int temp =0;

            for (int i=0; i<length-1; i++)
            {
                if (unsorted[i + 1] < unsorted[i]) 
                {
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i+1];
                    unsorted[i+1] = temp;
                    isSorted = false;
                }
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

        int unsorted4[] = {64,25,12,22,11};
        obj.sortFunction4(unsorted4);
        System.out.println("Sorted array4 : ");
        obj.printArray(unsorted4);


        int unsorted5[] = {64,25,12,22,11};
        obj.sortFunction5(unsorted5);
        System.out.println("Sorted array5 : ");
        obj.printArray(unsorted5);

        int unsorted6[] = {64,25,12,22,11};
        obj.sortFunction6(unsorted6);
        System.out.println("Sorted array6 : ");
        obj.printArray(unsorted6);

    }

}