//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//Input: "babad"
//Output: "bab"

import java.util.Scanner;

public class question5 {
	
	public void user_interface()
	{
		System.out.println("Enter the string");
		Scanner scan1 = new Scanner(System.in);
		String s = scan1.nextLine();
		boolean[][] matrix = new boolean[s.length()][s.length()];
		int i=0,current_length=0,begins=0,length=0;
		for(i=0;i<s.length();i++)
		{
			matrix[i][i]=true;
		}
		for(i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				matrix[i][i+1]=true;
				begins = i;
				length=current_length;
			}

		}
		for(current_length=3;current_length<=s.length();current_length++)
		{
			for(i=0;i<(s.length()-current_length+1);i++)
			{
				int j=i+current_length-1;
				if(s.charAt(i)==s.charAt(j)&&matrix[i+1][j-1])
				{
					matrix[i][j]=true;
					begins = i;
					length=current_length;
				}
			}
		}
		System.out.println("Longest Palindromix substring begins at "+begins+" is length "+length);
		return;
	}
	
	public static void main(String args[])
	{
		question5 m = new question5();
		m.user_interface();
	}
}
