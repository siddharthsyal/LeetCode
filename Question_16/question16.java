//Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. 
//Return the sum of the three integers. You may assume that each input would have exactly one solution.
//Example:
//Given array nums = [-1, 2, 1, -4], and target = 1.
//The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class question16 {
	
	public void threeSumClosest(int[] array, int target)
	{
		List<Integer> list = new ArrayList<Integer>();
		Boolean init = false;
		int i=0,k=0,j=0,min=0;
		for(i=0;i<array.length-2;i++)
		{
			k=array.length-1;
			j=i+1;
			while(j<k)
			{
				int sum = array[i]+array[j]+array[k];
				if(!init)
				{
					min=sum;
					list.add(array[i]);
					list.add(array[j]);
					list.add(array[k]);
					init = true;
				}
				else if (init)
				{
					if (Math.abs(sum-target)<Math.abs(target-min))
					{
						min=sum;
						list.clear();
						list.add(array[i]);
						list.add(array[j]);
						list.add(array[k]);
					}					
				}
				if(sum<target)
					j++;
				else if(sum>target)
					k--;
				else if(sum==target)
				{
					System.out.println(list);
					return;
				}
			}
		}
		System.out.println(list);
		return;
	}
	
	public void user_interface()
	{
		int i=0;
		System.out.println("Enter the length of array");
		Scanner scan1 = new Scanner(System.in);
		int length = scan1.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the array");
		for(i=0;i<length;i++)
			array[i]=scan1.nextInt();
		Arrays.sort(array);
		System.out.println("Enter the target value");
		int target = scan1.nextInt();
		threeSumClosest(array,target);
	}
	public static void main(String args[])
	{
		question16 m = new question16();
		m.user_interface();
	}

}
