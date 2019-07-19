import java.util.ArrayList;
import java.util.Scanner;

class LinkedListNode
{
	int val;
	LinkedListNode next;
}

public class RedundantList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  

		LinkedListNode head = null;
		LinkedListNode head_tail = null;
		
		//int head_size = 8;

		int head_item;
		
		int head_size = Integer.valueOf( in.nextLine());
				
				
		for(int i=0 ; i < head_size; i++)
		{
			head_item = Integer.valueOf( in.nextLine());	
			head_tail =_insert_node_into_singlylinkedlist( head ,head_tail ,head_item );
			
			if(i == 0)
				head =head_tail;
		}
		
		LinkedListNode res = distinct(head);
		System.out.println("result");
		
		while( res != null )
		{
			System.out.println( res.val);
			res = res.next ;
		}
		
		
	}

	public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head ,LinkedListNode head_tail ,int head_item )
	{
		LinkedListNode newNode = new LinkedListNode();
		newNode.val = head_item;
		
		if( head == null )
		{
			head_tail = head = newNode;
			return head_tail;
		}
		
		LinkedListNode temp = head ;
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		//head_tail = temp ; tail i bulduk
		temp.next = newNode;
		head_tail = newNode;
		
		
		
		return head_tail;
	}
	
	static LinkedListNode distinct(LinkedListNode head )
	{
		ArrayList<Integer> processedItems = new ArrayList<Integer>(); 

		// we are going to remove duplicated and keep the linkedList structure
		// yani yeni bir liste olusturucaz diyebiliriz
		LinkedListNode temp = head;
		LinkedListNode head_tail = null ;
		
		LinkedListNode headNew = null ,head_tailNew = null;
		
		while( temp != null )
		{
			if( !processedItems.contains( temp.val))
			{
				processedItems.add(temp.val );
				
				head_tailNew = _insert_node_into_singlylinkedlist(headNew, head_tailNew, temp.val);
				
				if(headNew == null)
					headNew = head_tailNew;				
			}
			temp = temp.next;
		}
		
		return headNew;
	}
	
}
