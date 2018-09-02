//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//Think of a method without using strings
//Input: 121
//Output: true

import java.util.Scanner;

public class question9 {
	
	public boolean isPalindrome(int number)
	{
		int buff=0,i=0,buff1=number;
		if(number<0)
			return false;
		if(number == 0)
			return true;
		while(number>buff)
		{
			buff = buff*10+ number%10;
			number = number/10;
		}
		if((buff == number)||(number == buff/10))
			return true;
		return false;
	}
	public void user_interface()
	{
		int number;
		System.out.println("Enter the number");
		Scanner scan1 = new Scanner(System.in);
		number = scan1.nextInt();
		if(isPalindrome(number)==true)
			System.out.println("The number is a palindrome");
		else
			System.out.println("The number is not a palindrome");
		return;		
	}
	public static void main(String args[])
	{
		question9 m = new question9();
		m.user_interface();
	}
}
