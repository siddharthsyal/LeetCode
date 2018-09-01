//Reverse an Integer (Take care of the underflow & overflow)
import java.util.Scanner;

public class question7 {
	public int revNumber(int x)
	{
		int buff=0,number =0,i=0,rev=0;
		while(x!=0)
		{
			buff = x%10;
			if(rev>Integer.MAX_VALUE/10 || (rev>Integer.MAX_VALUE/10 && buff>8))
				return 0;
			if ((rev<Integer.MIN_VALUE/10)||(rev<Integer.MIN_VALUE/10 && buff<-7))
				return 0;
			rev = rev*10+ buff;
			x=x/10;
		}
		return rev;
	}
	public void user_interface()
	{
		int x=0;
		System.out.println("Enter the integer");
		Scanner scan1 = new Scanner(System.in);
		x=scan1.nextInt();
		int revNumber = revNumber(x);
		System.out.println("The new number is " +revNumber);
		return;
	}
	public static void main(String args[])
	{
		question7 m = new question7();
		m.user_interface();
	}
}
