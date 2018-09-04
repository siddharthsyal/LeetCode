//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn 
//such that the two endpoints of line i is at (i, ai) and (i, 0). 
//Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//link to the problem : https://leetcode.com/problems/container-with-most-water/description/

import java.util.Scanner;

public class question11 {
	
	public int area (int[] array)
	{
		int j=array.length-1,i=1;
		int max =0, area=0;
		while(i<j)
		{
			if(array[i]<array[j])
				i++;
			else if(array[i]>array[j])
				j--;
			else
			{
				i++;
				j--;
			}
			area = Math.abs(i-j)*Math.min(array[i], array[j]);
			if(area>max)
				max= area;
		}
		return max;
	}
	
	public void user_interface()
	{
		System.out.println("Enter the length of the array");
		Scanner scan1 = new Scanner(System.in);
		int length = scan1.nextInt();
		int[] array = new int[length+1];
		System.out.println("Enter non-negative numbers");
		for(int i=1;i<length+1;i++)
			array[i]=scan1.nextInt();
		System.out.println("Max area is "+area(array));
		return;
	}
	
	public static void main(String args[])
	{
		question11 m = new question11();
		m.user_interface();
	}
}
