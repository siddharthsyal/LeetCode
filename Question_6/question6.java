//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
//you may want to display this pattern in a fixed font for better legibility)

//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"

//Write the code that will take a string and make this conversion given a number of rows:
//string convert(string s, int numRows);
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"

import java.util.Scanner;

public class question6 {
	
	public void user_interface()
	{
		String s;
		System.out.println("Enter the String");
		Scanner scan1 = new Scanner(System.in);
		s= scan1.nextLine();
		System.out.println("Enter the number of rows");
		int rows = scan1.nextInt();
		int step = 2*rows -2;
		StringBuffer buff = new StringBuffer();
		for(int i=0;i<rows;i++)
		{
			if(i==0||i==rows-1)
				for(int j=i;j<s.length();j=j+step)
					buff.append(s.charAt(j));
			else
			{
				int j=i;
				boolean flag=true;
				int step2 = 2*(rows -i-1);
				int step1 = Math.abs(step2-step);
				while(j<s.length())
				{
					buff.append(s.charAt(j));
					if(flag)
						j=j+step2;
					else
						j=j+step1;
					flag =!flag;
				}
			}
		}
		System.out.println("Final string is "+buff);
	}
	public static void main(String args[])
	{
		question6 m = new question6();
		m.user_interface();
	}
}
