//Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//Example :
//Given nums = [0,0,1,1,1,2,2,3,3,4]
//Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
//It doesn't matter what values are set beyond the returned length.

import java.util.Scanner;
public class question26 {
	
	public int removeDuplicates(int[] array, int length) {
		int newLength =0;
		if(length==0)
			return 0;
		int max = array[length-1];
		for(int i=0;i<length-1;i++) {
			if((array[i]==array[i+1])||(array[i]>array[i+1])) {
				int j=i+1;
				while((array[i]==array[j])||(array[i]>array[j])) {
					if(j==length-1)
						break;
					j++;
				}
				int temp = array[i+1];
				array[i+1] = array[j];
				array[j]=temp;
				newLength++;
				if(array[i+1]==max)
					break;
				}
		}
		return newLength+1;
	}
	
	public void user_interface() {
		int length =0;
		int newLength =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		length = scan.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the values for the array");
		for (int i=0;i<length;i++) {
			array[i]= scan.nextInt();
		}
		System.out.println("Old Array is ");
		for(int i=0;i<length;i++)
		{
			System.out.print(array[i]+" ");
		}
		newLength = removeDuplicates(array,  length);
		System.out.println("\nNew Array is :\n");
		for(int i=0;i<newLength;i++)
		{
			System.out.print(array[i]+" ");
		}
		return;		
	}
	
	public static void main(String args[]) {
		question26 m = new question26();
		m.user_interface();
	}
}
