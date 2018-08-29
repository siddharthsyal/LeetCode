//You are given two non-empty linked lists representing two non-negative integers. 
//The digits are stored in reverse order and each of their nodes contain a single digit. 
//Add the two numbers and return it as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.

import java.util.Scanner;
import java.util.*;
public class question2 {
	public void getSum(nodes temp1, nodes temp2)
	{
		linkedlist list3 = new linkedlist();
		int num1 =0, num2=0, i=0,  length=0,data=0,buffer=0;
		while(temp1!=null)
		{	
			num1 = (int)(temp1.data * Math.pow(10,i) + num1);
			temp1=temp1.next;
			i++;			
		}
		i=0;
		while(temp2!=null)
		{
			num2 =  (int) (temp2.data * Math.pow(10,i) + num2);
			temp2=temp2.next;
			i++;			
		}
		Integer total = num1+num2;
		length = total.toString().length();
		length--;
		while(length>=0)
		{
			data = total/((int)Math.pow(10, length));
			list3.insert(data);
			data = data*((int)Math.pow(10, length));
			total = total - data;
			length--;
		}
		list3.print(list3.head);	
	}
	public void user_interface()
	{
		int n=3;
		linkedlist list1 = new linkedlist();
		linkedlist list2 = new linkedlist();
		System.out.println("Enter the data for list 1");
		Scanner scan1 = new Scanner(System.in);
		while(n>0)
		{
			list1.insert(scan1.nextInt());
			n--;
		}
		System.out.println("Enter the data for list 2");
		n=3;
		while(n>0)
		{
			list2.insert(scan1.nextInt());
			n--;
		}
		getSum(list1.head,list2.head);		
	}
	public static void main(String args[])
	{
		question2 m =  new question2();
		m.user_interface();
	}
}
