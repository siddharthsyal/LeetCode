//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.
//Input: "()"
//Output: true

import java.util.Scanner;

public class question20 {

	stack buffer = new stack();
	public boolean isValid (String input)
	{
		if (input == " "|| input.length()==0)
			return true;
		this.buffer = new stack();
		char buff;
		int i=0;
		for(i=0;i<input.length();i++)
		{
			switch (input.charAt(i))
			{
			case '}':
				if(this.buffer.isEmpty()==false)
					return false;
				if (this.buffer.top() == '{')
					this.buffer.pop();
				else
					this.buffer.push(input.charAt(i));
				break;
			case ']':
				if(this.buffer.isEmpty()==false)
					return false;
				if (this.buffer.top()=='[')
					this.buffer.pop();
				else
					this.buffer.push(input.charAt(i));
				break;
			case ')':
				if(this.buffer.isEmpty()==false)
					return false;
				if (this.buffer.top()== '(')
					this.buffer.pop();
				else
					this.buffer.push(input.charAt(i));
				break;
			default :
				this.buffer.push(input.charAt(i));
				break;
			}
		}
		if (this.buffer.isEmpty() == false)
			return true;
		return false;
	}
	
	public void user_interface()
	{
		System.out.println("Enter the string");
		Scanner scan1 = new Scanner(System.in);
		String input = scan1.nextLine();
		if(isValid(input))
		{
			System.out.println("Valid string");
		}
		else
			System.out.println("Invalid String");
		return;
	}
	public static void main(String args[])
	{
		question20 m = new question20();
		m.user_interface();
	}	
}
