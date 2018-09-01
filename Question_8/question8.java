//Implement atoi which converts a string to an integer.
//The function first discards as many whitespace characters as necessary until the first non-whitespace character is found.
//Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, 
//and interprets them as a numerical value.
//The string can contain additional characters after those that form the integral number, 
//which are ignored and have no effect on the behavior of this function.
//If the first sequence of non-whitespace characters in str is not a valid integral number,
//or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
//If no valid conversion could be performed, a zero value is returned.

//Note:

//Only the space character ' ' is considered as whitespace character.
//Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
//Input: "42"
//Output: 42
import java.util.Scanner;
public class question8 {
	
	public int atoi(String s)
	{
		int i=0, buff=0;
		boolean sign = false, init = false;
		for(i=0;i<s.length();i++)
		{
			if(!init)
			{
				if(s.charAt(i)==' ')
				{
					continue;
				}
				else if(s.charAt(i)=='-')
				{
					init = true;
					sign =  true;
					continue;
				}
				else if(Character.getNumericValue(s.charAt(i))>=0&&Character.getNumericValue(s.charAt(i))<=9)
				{
					init = true;
					buff = buff*10+Character.getNumericValue(s.charAt(i));
				}
				else 
					break;
			}
			else
			{
				if(Character.getNumericValue(s.charAt(i))>=0&&Character.getNumericValue(s.charAt(i))<=9)
				{
					if(buff>Integer.MAX_VALUE/10 || (buff>Integer.MAX_VALUE/10 && Character.getNumericValue(s.charAt(i))>8))
						return Integer.MAX_VALUE;
					if ((buff<Integer.MIN_VALUE/10)||(buff<Integer.MIN_VALUE/10 && Character.getNumericValue(s.charAt(i))<-7))
						return Integer.MAX_VALUE;
					buff = buff*10+Character.getNumericValue(s.charAt(i));
					continue;
				}
				else
					break;
			}
		}
		if(sign)
			buff = (-buff);
		return buff;
	}
	public void user_interface()
	{
		System.out.println("Enter the string for atoi");
		Scanner scan1 = new Scanner(System.in);
		String s = scan1.nextLine();
		int buff = atoi(s);
		System.out.println("After conversion "+buff);
		return;		
	}
	public static void main(String args[])
	{
		question8 m = new question8();
		m.user_interface();
	}

}
