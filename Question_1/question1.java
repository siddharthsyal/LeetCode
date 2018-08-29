//Given an array of integers, return the indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//Example : Input = Given nums = [2, 7, 11, 15], target = 9
//          Output = [0, 1]

import java.util.Scanner;
import java.util.HashMap;

public class question1 {
	
	public int[] twoSum(int[] nums, int target,HashMap<Integer,Integer> set)
	{
		int[] result = new int[2];
		for(int i=0;i<nums.length;i++)
		{
			if(set.containsKey(Math.abs(target-nums[i])))
			{
				result[0] = set.get(Math.abs(target-nums[i]));
				result[1] = i;
				break;
			}
		}
		return result;		
	}
	
	public void user_interface()
	{
		int length=0,i=0;
		int[] result = new int[2];
		System.out.println("Enter the length of the array");
		Scanner scan1 = new Scanner(System.in);
		length = scan1.nextInt();
		HashMap<Integer,Integer> set =  new HashMap<Integer,Integer>();		
		System.out.println("Enter the array");
		int[] array = new int[length];
		for(i=0;i<length;i++)
		{
			array[i]= scan1.nextInt();
			if(!set.containsKey(array[i]))
				set.put(array[i], i);
		}
		System.out.println("Enter the target sum");
		int target = scan1.nextInt();	
		result = twoSum(array,target,set);
		System.out.println("[ "+result[0]+" "+result[1]+" ]");
	}
	
	public static void main(String args[])
	{
		question1 m = new question1();
		m.user_interface();
	}
}
