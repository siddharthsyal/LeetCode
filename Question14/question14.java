//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string ""
//Input: ["flower","flow","flight"]
//Output: "fl"

import java.util.Scanner;

public class question14 {
	
	public int getMinLen(String[] array)
	{
		int min = array[0].length();
		for(int i=0;i<array.length;i++)
		{
			if(min>array[i].length())
				min= array[i].length();
		}

		return min;
	}
	
	public String getPrefix(String[] array, int minLen)
	{
		int i, j;
		StringBuffer buffer = new StringBuffer();
		boolean flag = false;
		for(i=0;i<minLen;i++)
		{
			for(j=1;j<array.length;j++)
			{
				if(array[j].charAt(i)!=array[0].charAt(i))
				{
					flag = false;
					break;
				}
				flag = true;
			}
			if(flag)
				buffer.append(array[0].charAt(i));
			else
				break;
		}
		String s = buffer.toString();
		return s;
	}
	public void user_interface()
	{
		System.out.println("Enter the number of strings");
		Scanner scan1 = new Scanner(System.in);
		int len = scan1.nextInt();
		String[] array = new String[len];
		System.out.println("Enter the strings");
		for(int i=0;i<len;i++)
			array[i]=scan1.next();
		int minLen = getMinLen(array);
		String buff = getPrefix(array,minLen);
		if(buff.length()>0)
			System.out.println("Common prefix is "+buff);
		else
			System.out.println("No common prefix");
		return;
	}
	public static void main(String args[])
	{
		question14 m = new question14();
		m.user_interface();
	}
}
