
public class linkedlist {
	public boolean init = false;
	public nodes head = new nodes();
	public int counter =0;
	
	public void insert(int data)
	{
		if(init == false)
		{
			this.head.data = data;
			this.counter++;
			this.init = true;
		}
		else
		{
			nodes temp = new nodes();
			nodes temp1 = new nodes();
			temp1.data = data;
			temp = this.head;
			while(temp.next!=null)
			{
				temp= temp.next;
			}
			temp.next = temp1;		
			this.init = true;
			this.counter++;
		}		
	}
	public void delete(int data)
	{
		nodes temp = new nodes();
		temp = head;
		while(temp!=null)
		{
			if(head.data == data)
			{
				if(head.next == null)
				{
					head = null;
					System.out.println("Linked List empty");
					this.counter =0;
					this.init = false;
					break;					
				}
				else 
				{
					System.out.println("First element deleted");
					head =  head.next;
					this.counter --;
				}
			}
			else if(temp.next.data == data)
			{
				temp.next =  temp.next.next;
				System.out.println("Element deleted");
				this.counter--;
			}
			temp =  temp.next;
		}
	}
	public void print(nodes temp)
	{
		if(temp == null)
			temp=this.head;
		while(temp!=null)
		{
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public int getElement(int  count)
	{
		int result = -1;
		if(count>counter)
		{
			System.out.println("Not a valid entry");
			return -1;
		}
		else
		{
			nodes temp = new nodes();
			temp = head;
			while(temp!=null)
			{
				if(count == 1)
				{
					break;
				}
				temp = temp.next;
				count--;				
			}
			result = temp.data;
		}
		return result;
	}
}
