//Letter Combinations of a Phone Number
//Input: "23"
//Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class question17 {
	
	List<String> list = new ArrayList<String>();
	StringBuffer buff = new StringBuffer();
	
	public void letterCombinations(String number, int index ,int j)
	{
		if(index>number.length())
			return;
		if(this.buff.length()==number.length())
		{
			this.list.add(this.buff.toString());
			return;
		}
		String[] pad = new String[10];
		pad[2]= "abc";
		pad[3] ="def";
		pad[4] = "ghi";
		pad[5] = "jkl";
		pad[6] = "mno";
		pad[7] = "pqrs";
		pad[8] = "tuv";
		pad[9] = "wxyz";
		int num_buff = Character.getNumericValue(number.charAt(index));
		int length_1=pad[num_buff].length();
		for(int i=j;i<length_1;i++)
		{
			buff.append(pad[num_buff].charAt(i));
			letterCombinations(number,index+1,0);
			buff.setLength(buff.length()-1);
		}
		return;
	}
	
	public void user_interface()
	{
		String number;
		System.out.println("Enter the number");
		Scanner scan1 = new Scanner(System.in);
		number = scan1.nextLine();
		letterCombinations(number,0,0);
		System.out.println(this.list);
		
	}
	
	public static void main(String args[])
	{
		question17 m = new question17();
		m.user_interface();
	}
}
