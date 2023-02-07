/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Arrays;
/**
 *
 * @author lhatala
 */
public class JavaApplication1 {
    /**
    * This method implements a sort algorithm to sort the given int array
    * @param unsorted an unsorted integer array
    */
   void sortFunction4(int unsorted[]) {

    // @param Local variables index, n and temp have been declared 
       
       // Index is initialized to 1
       int index = 1;
       // n is assigned the length of the array
       int n = unsorted.length;
       // This while loop will run until index is less than n
       while (index < n) {
           
           // If index is not 0 and the value at index - 1 is greater than the value at index
           if (index != 0 && unsorted[index - 1] > unsorted[index]) {
               
               // Store the value at index in a temp variable
               int temp = unsorted[index];
               // Swap the values at index and index - 1
               unsorted[index] = unsorted[index - 1];
               unsorted[index - 1] = temp;
               // Decrement the index
               index--;
               
           } else {
               
               // Increment the index if the values are in order
               index++;
               
           }
           
       }
       
   }

   /**
    * This method implements a sort algorithm to sort the given int array
    * @param unsorted an unsorted integer array
    */
   void sortFunction5(int unsorted[]) {

       // n is assigned the length of the array
       int n = unsorted.length;
       // min and max are initialized to the first value in the array
       int min = unsorted[0];
       int max = unsorted[0];
       // Variables range, i, j, and index have been declared
       int range, i, j, index;

       // Loop through the array to find the minimum and maximum values
       for(int a=0; a<n; a++) {

           // If a value in the array is less than the minimum, update the minimum value
           if(unsorted[a] < min) 
               min = unsorted[a];
           // If a value in the array is greater than the maximum, update the maximum value
           if(unsorted[a] > max) 
               max = unsorted[a];

       }

       // Calculate the range of values in the array
       range = max - min + 1;
       // Create an integer array phole with the size of the range
       int[] phole = new int[range];
       // Fill the phole array with zeros
       Arrays.fill(phole, 0);

       // Loop through the array and increment the corresponding value in the phole array
       for(i = 0; i<n; i++)
           phole[unsorted[i] - min]++;

       // Initialize the index to 0
       index = 0;

       // Loop through the phole array and fill the unsorted array with the sorted values
       for(j = 0; j<range; j++)
           while(phole[j]-->0)
               unsorted[index++]=j+min+1;

    }

        // A function to sort an array of integers using an approach similar to bubble sort.
    void sortFunction6(int unsorted[]) {

        // A flag to keep track of whether the array is sorted or not.
        boolean isSorted = false;
        // Get the length of the array.
        int n = unsorted.length;
        // Keep looping until the array is sorted.
        while (!isSorted) {

            // Assume the array is sorted.
            isSorted = true;
            // A variable to store a value temporarily during swapping.
            int temp = 0;

            // Loop through the array in increments of 2, comparing and swapping adjacent elements if necessary.
            for (int i = 0; i < n - 1; i = i + 2) {

                // If the current element is greater than the next element, swap them.
                if (unsorted[i + 1] < unsorted[i]) {

                    // Swap the elements.
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    // Set the isSorted flag to false, indicating that the array is not yet sorted.
                    isSorted = false;

                }

            }

            // Loop through the array again, but in increments of 2 starting from the first position, comparing and swapping adjacent elements if necessary.
            for (int i = 1; i < n - 1; i = i + 2) {

                // If the current element is greater than the next element, swap them.
                if (unsorted[i + 1] < unsorted[i]) {

                    // Swap the elements.
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    // Set the isSorted flag to false, indicating that the array is not yet sorted.
                    isSorted = false;

                }

            }

        }

    }
        
    // A function to print out the elements of an array.
    void printArray(int arr[]) {

        // Get the length of the array.
        int n = arr.length;
        // Loop through the array and print each element.
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        // Print a line break after all elements have been printed.
        System.out.println();

    }
    
    // The main function of the program.
    public static void main(String[] args) {

        // Create an instance of the LabTest1 class.
        JavaApplication1 obj = new JavaApplication1();
        
        // Create an array to be sorted by sortFunction4.
        int unsorted4[] = {64,25,12,22,11};
        // Sort the array using sortFunction4.
        obj.sortFunction4(unsorted4);
        // Print out the sorted array.
        System.out.println("Sorted array4 : ");
        obj.printArray(unsorted4);
            
        // Create an array to be sorted by sortFunction5.
        int unsorted5[] = {64,25,12,22,11};
        // Sort the array.
        obj.sortFunction4(unsorted5);
        // print out the sorted array.
        System.out.println("Sorted array4 : ");
        obj.printArray(unsorted5);
         
        // create an arrya to be sorted by sortFucntion6.
        int unsorted6[] = {64,25,12,22,11};
        // sort the array.
        obj.sortFunction6(unsorted6);
        // print out the sorted array.
        System.out.println("Sorted array6 : ");
        obj.printArray(unsorted6);
        
     }
}
