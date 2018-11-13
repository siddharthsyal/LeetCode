//Given an array nums and a value val, remove all instances of that value in-place and return the new length.
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//Example 1:
//Given nums = [3,2,2,3], val = 3,
//Your function should return length = 2, with the first two elements of nums being 2.
//It doesn't matter what you leave beyond the returned length.

import java.util.Scanner;
public class question27 {
	
	
	public int valRemoval(int[] array, int length, int val) {
		int i=0,counter =0,temp=0,newlength;
		for (i=1;i<length;i++) {
			if (array[i-1]==val) {
				counter=1;
				while(i<length) {
					if (array[i]==val) {
						counter++;
						i++;						
					}
					else
						break;
				}
				if(i<length) {
					temp = array[i];
					array[i]= array[i-counter];
					array[i-counter]=temp;
				}				
				if (i>=length) {
					newlength = i-counter;
					return newlength;
				}
				i =i-counter+1;
			}
		}
		return 0;
	}
	
	public void user_interface() {
		int val,i,length,newLength =0;
		System.out.println("Enter the length of the array");
		Scanner scan1 = new Scanner(System.in);
		length = scan1.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the elements of the array");
		for (i=0;i<length;i++) {
			array[i]= scan1.nextInt();
		}
		System.out.println("Enter the value that needs to be removed");
		val = scan1.nextInt();
		newLength = valRemoval(array,length,val);
		System.out.println("New Length = "+newLength);
		return;
	}
	
	public static void main(String args[]) {
		question27 m = new question27();
		m.user_interface();
	}
}
