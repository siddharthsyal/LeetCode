//Given a linked list, remove the n-th node from the end of list and return its head.
//Input : Given linked list: 1->2->3->4->5, and n = 2.
//After removing the second node from the end, the linked list becomes 1->2->3->5.

import java.util.Scanner;

public class question19 {

	boolean err =  false;
	public void posData(int n, linkedlist list)
	{
		nodes fast = new nodes();
		nodes slow = new nodes();
		int i=0;
		fast = list.head;
		while(i<n)
		{
			if (fast == null)
			{
				System.out.println("Error");
				this.err = true;
				return;
			}
			fast = fast.next;
			i++;
		}
		slow = list.head;
		while(fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return ;
	}
	
	public void user_interface()
	{
		linkedlist list = new linkedlist();
		Scanner scan1 = new Scanner(System.in);
		int x=1;
		while(x==1)
		{
			System.out.println("Enter the data for the linked list");
			int data = scan1.nextInt();
			list.insert(data);
			System.out.println("Do you want to continue?(Y/N)");
			x = scan1.nextInt();
		}
		list.print(list.head);
		System.out.println("Enter the position from the last");
		int pos = scan1.nextInt();
		posData(pos,list);
		list.print(list.head);
		return;		
	}
	
	public static void main(String args[])
	{
		question19 m = new question19();
		m.user_interface();
	}
}
