
class stacknodes{
	char data;
	stacknodes next = null;
}

public class stack {

	stacknodes head = new stacknodes();
	public stack ()
	{
		this.head = new stacknodes();
	}
	boolean init = false;
	public void push (char data)
	{
		if (this.init == false)
		{
			this.head.data = data;
			this.head.next = null;
			this.init = true;
		}
		else 
		{
			stacknodes temp = new stacknodes();
			temp.data = data;
			temp.next =  this.head;
			this.head = temp;
			this.init = true;
		}
		return;
	}
	public char top ()
	{
		char data = this.head.data;
		return data;
	}
	public void pop ()
	{
		if (this.head.next != null)
			this.head = this.head.next;
		else if (this.head.next == null)
		{
			this.init = false;
			this.head = null;
		}
		else
			this.init = false;
		return ;
	}
	
	public boolean isEmpty()
	{
		return this.init;
	}

}
