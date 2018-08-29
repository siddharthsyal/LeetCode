//Given a string, find the length of the longest substring without repeating characters.
//Input: "abcabcbb"
//Output: 3 
//Explanation: The answer is "abc", which the length is 3.
import java.util.Scanner;
import java.util.HashSet;
public class question3 {
	
	public int sum=0;
	public void longestSubstring(String s, HashSet<Character> set,int i, int buff )
	{
		while(i<s.length())
		{
			if(!set.contains(s.charAt(i)))
			{
				buff++;
				set.add(s.charAt(i));
			}
			else if(set.contains(s.charAt(i)))
			{
				if(this.sum<buff)
					this.sum=buff;
				buff=1;
				set.clear();
				set.add(s.charAt(i));
			}
			i++;
			longestSubstring(s,set,i,buff);
			return;
		}
		return;
	}
	
	public void user_interface()
	{
		String s;
		System.out.println("Enter the string");
		Scanner scan1 = new Scanner(System.in);
		s =  scan1.nextLine();
		HashSet<Character> set = new HashSet<Character>();
		longestSubstring(s,set,0,0);
		System.out.println("The length of longest sequence is "+this.sum);
	}
	public static void main(String args[])
	{
		question3 m = new question3();
		m.user_interface();
	}
}
