// Raja Hammad Mehmood
// This program  does summation of values in a linked list with two different methods.
public class IntNode {

	int item; // One of the integers in the list.
	IntNode next; // Pointer to the next node in the list.
	
	public IntNode(int item, IntNode next) {
		this.item=item;
		this.next=next;
	}
	/**
	 *  Compute the sum of all the integers in a linked list of integers.
	 *  @param head a pointer to the first node in the linked list
	 */
	public static void printSum(IntNode head) {
		int sum = 0;
		IntNode runner = head;
		while ( runner != null ) {
		   sum = sum + runner.item;   // Add current item to the sum.
		   runner = runner.next;
		}
		System.out.println("The sum of the list of items is " + sum);
	}
	
	/**
	 *  Compute the sum of all the integers in a linked list of integers recursively.
	 *  @param head a pointer to the first node in the linked list
	 *  @return is the sum.
	 */
	public static int addItemsInList(IntNode head) {
	   if ( head == null ) {
	         // Base case:  The list is empty,  so the sum is zero.
	      return 0;
	   }
	   else {
	         // Recursive case:  The list is non-empty.  Find the sum of
	         // the tail list, and add that to the item in the head node.
	         // (Note that this case could be written simply as
	         //     return head.item + addItemsInList( head.next );)
	      int listsum = head.item;
	      int tailsum = addItemsInList( head.next );
	      listsum = listsum + tailsum;
	      return listsum;
	   }
	}
	
	public static void main(String[] args) {
		IntNode node1  = new IntNode(5, null);
		IntNode node2  = new IntNode(77, node1);
		IntNode node3  = new IntNode(90, node2);
	    printSum(node3);
		System.out.println("Sum using recursion: "+addItemsInList(node3));
	}


}
