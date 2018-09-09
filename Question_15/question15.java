//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
//Find all unique triplets in the array which gives the sum of zero.
//Given array nums = [-1, 0, 1, 2, -1, -4],
//A solution set is:
//  [
//    [-1, 0, 1],
//    [-1, -1, 2]
//  ]
//Note - The solution set must not contain duplicate triplets.

import java.util.Scanner;
import java.util.*;


public class question15 {
	
	
	public void quickSort(int[] array, int start, int end)
	{
		if(start<end)
		{
			int pindex = pindex(array,start,end);
			quickSort (array,0,pindex-1);
			quickSort (array,pindex+1,end);
		}
		return;
	}
	
	public int pindex(int[] array, int start, int end)
	{
		int pivot = array[end];
		int k=start,i=0;
		for(i=start;i<end;i++)
		{
			if(array[i]<=pivot)
			{
				int temp = array[i];
				array[i]=array[k];
				array[k]=temp;
				k++;
			}			
		}
		int temp= array[k];
		array[k]=array[end];
		array[end]=temp;
		return k;
	}
	
	public void threeSum (int[] array)
	{
		int i=0,j=0,k=0;
		if(array.length<=3||array==null)
			return;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(i=0;i<array.length;i++)
		{
			if(i==0 || array[i]>array[i-1])
			{
				j=i+1;
				k=array.length-1;
				while(j<k)
				{
					if(array[i]+array[k]+array[j]==0)
					{
						List<Integer> buff = new ArrayList<Integer>();
						buff.add(array[i]);
						buff.add(array[j]);
						buff.add(array[k]);
						list.add(buff);
						j++;
						k--;
						while(j<k&&array[j]==array[j-1])
							j++;
						while(j<k&&array[k]==array[k+1])
							k--;
					}
					else if(array[i]+array[k]+array[j]<0)
						j++;
					else if(array[i]+array[k]+array[j]>0)
						k--;
				}
			}
		}
		System.out.println(list);
		return;
	}
	
	public void user_interface() {
		System.out.println("Enter the length of the array");
		Scanner scan1 = new Scanner(System.in);
		int length = scan1.nextInt();
		int[] array = new int[length];
		for(int i=0;i<length;i++)
			array[i]=scan1.nextInt();
		quickSort(array,0,array.length-1);
		threeSum(array);
	}

	public static void main(String args[])
	{
		question15 m = new question15();
		m.user_interface();
	}
}
