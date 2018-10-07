//Given a linked list, swap every two adjacent nodes and return its head.
//Example:
//Given 1->2->3->4, you should return the list as 2->1->4->3.
//Note:
//Your algorithm should use only constant extra space.
//You may not modify the values in the list's nodes, only nodes itself may be changed.

import java.util.Scanner;
public class question24 {
	
	
	public nodes swap (nodes head)
	{
		nodes temp = new nodes();
		nodes node = new nodes();
		node = head;
		boolean init = false;
		while((node.next!=null))
		{
			
			if (init == false)
			{
				temp.next=node.next;
				if (node.next.next!=null)
					node.next = node.next.next.next;
				else
					node.next=node.next.next;
				head = temp.next;
				temp= temp.next.next;
				head.next=node;
				node = temp;
				if (node==null)
						break;
				init = true;				
			}
			else
			{	temp=node.next;
				System.out.println("Here2 "+node.next.data);
				node.next = node.next.next;
				temp.next=node;
				if (node.next==null)
					break;
				else
					node=node.next;
			}
		}
		return head;
	}
	
	public void user_interface()
	{
		int x=1;
		linkedlist list = new linkedlist();
		while(x==1)
		{
			System.out.println("Enter the node data");
			Scanner scan1 = new Scanner(System.in);
			list.insert(scan1.nextInt());
			System.out.println("Enter more data?(1==y)");
			x = scan1.nextInt();
		}
		System.out.println("Original List");
		list.print(list.head);
		list.head=swap(list.head);
		System.out.println("New List");
		list.print(list.head);
	}
	
	public static void main(String args[])
	{
		question24 m = new question24();
		m.user_interface();
	}
}
