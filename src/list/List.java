package list;

public class List {
	private ListItem head;
	private ListItem tail;

	public void printList()    
	{
		System.out.println("printList");
		// TODO
	}

	public void addLast(int data) {
		ListItem a = new ListItem(); 
		a.data = data;
		if (tail == null) 
		{                         
			head = a;              
			tail = a;
		} else {
			tail.next = a;         
			tail = a;             
		}
	}

	public void addFirst(int data) {
		System.out.println("addFirst");
		// TODO
	}

	public void removeItem(int data) {
		System.out.println("removeItem");
		// TODO 		
	}

	public void removeFirst() {
		System.out.println("removeFirst");
		// TODO 		
	}

	public void removeLast() {
		System.out.println("removeLast");
		// TODO 		
	}

}
