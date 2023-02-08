package labtest1;
/**
* @author Matthew Macdonald (Student number:1234437)
*
*/
public class LabTest1 {
	
void sortFunction7(int unsorted[])
{
int len = unsorted.length;
for (int i = 0; i <= len-1; i++) 	//if there is no -1 by the len then the scan goes out of bounds
{
int index = i;
for (int j = i+1; j < len; j++) 		//there should be no -1 to the len or it doesn't scan the whole array
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
for (int i = 1; i < ln; ++i) {
int item = unsorted[i];
int j = i - 1; 							//set j to equal i - 1 so it covers the first space in the array
while (j >= 0 && unsorted[j] > item) {
	int temp = unsorted[j + 1];			//added a temp variable to to switch the spaces in the array
	unsorted[j + 1] = unsorted[j];
unsorted[j] = temp;
j = j - 1;
}
				//removed the line here to stop it from miss placing the numbers
}
}
void sortFunction9(int unsorted[])
{
int index = 0;
int n = unsorted.length;
while (index < n) { 	//changed it no to be less and equal too n. this stops the loop from going out of bounds
if (index == 0)
index++;
if (unsorted[index-1] > unsorted[index])
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
System.out.print("Sorted array7: ");	//got rid of space infront of :. changed println to print so there is no enter
obj.printArray(unsorted7);
int unsorted8[] = {74,25,13,22,8};
obj.sortFunction8(unsorted8);
System.out.print("Sorted array8: ");//got rid of space infront of :. changed println to print so there is no enter
obj.printArray(unsorted8);
int unsorted9[] = {74,25,13,22,8};
obj.sortFunction9(unsorted9);
System.out.print("Sorted array9: ");//got rid of space infront of :. changed println to print so there is no enter
obj.printArray(unsorted9);
}
}
