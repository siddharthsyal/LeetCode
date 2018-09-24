//Merge two sorted linked lists and return it as a new list. 
//The new list should be made by splicing together the nodes of the first two lists.
//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3->4->4

import java.util.Scanner;
public class question21 {
	
	
	public void mergeList (nodes list1_head, nodes list2_head)
	{
		nodes temp = new nodes();
		nodes temp1 = new nodes();
		nodes buffer = new nodes();
		nodes head = new nodes();
		if(list1_head.data>list2_head.data)
		{
			temp1 = list1_head;
			temp = list2_head;
		}
		else
		{
			temp = list1_head;
			temp1 = list2_head;
		}
		head = temp;
		while(temp1!= null && temp != null)
		{
			if (temp.next!= null&&temp.next!=null)
			{
				if (temp.next.data>=temp1.data)
				{
					buffer = temp.next;
					temp.next = temp1;
					temp1 = temp1.next;
					temp=temp.next;
					temp.next=buffer;
				}
				else if (temp.next.data<temp1.data)
				{
					temp = temp.next;
				}
				continue;
			}
			else if (temp.next == null)
			{
				temp.next = temp1;
				break;
			}
			else if (temp1==null)
			{
				break;
			}
		}
		linkedlist list = new linkedlist();
		list.print(head);
		return;
		
	}
	
	public void user_interface()
	{
		int x=0;
		linkedlist list1 = new linkedlist();
		linkedlist list2 = new linkedlist();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("List 1");
		while(x==0)
		{
			System.out.println("Enter the data");
			list1.insert(scan1.nextInt());
			System.out.println("Do you want more?(y/n)");
			x = scan1.nextInt();
		}
		x=0;
		System.out.println("List 2");
		while(x==0)
		{
			System.out.println("Enter the data");
			list2.insert(scan1.nextInt());
			System.out.println("Do you want more?(y/n)");
			x = scan1.nextInt();
		}
		mergeList(list1.head,list2.head);
	}
	
	public static void main(String args[])
	{
		question21 m = new question21();
		m.user_interface();
	}
}
