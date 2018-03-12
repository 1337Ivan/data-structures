import list.List;

public class Run {

	public static void main(String[] args) {

		List list = new List();	 
		list.printList();

		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(6);

		list.printList();
		System.out.println();

		list.removeItem(6);
		list.removeItem(5);
		list.removeItem(12);
		list.removeItem(2);

		list.printList();
		System.out.println();

		list.addFirst(6);
		list.removeFirst();
		list.removeLast(); 
		list.printList();
		System.out.println();

	}

}
