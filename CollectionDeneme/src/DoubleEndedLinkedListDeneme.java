
public class DoubleEndedLinkedListDeneme {
	
	DoubleEndedLinkedList head;
	DoubleEndedLinkedList tail;
	
	
	public void insertInFirstPosition( String homeAddress ,String homeNumber )
	{
		DoubleEndedLinkedList newNode = new DoubleEndedLinkedList(homeAddress, homeNumber);
		
		if(head == null && tail== null )
		{
			head = newNode; 
			tail = newNode;
			newNode.previous = null;
			newNode.next = null;			
		}
		else
		{
			newNode.next = head;
			head.previous = newNode ;
			head = newNode;
		}			
	}
	
	public void insertAfterKey(  String homeAddress ,String homeNumber ,String key)
	{
		DoubleEndedLinkedList newNode = new DoubleEndedLinkedList(homeAddress, homeNumber);
		
		DoubleEndedLinkedList tempNode = head;
		DoubleEndedLinkedList prevNode, nextNode;
		
		while( tempNode != null )
		{
			if( tempNode.homeNumber.equals(key))
			{
				nextNode= tempNode.next;
				prevNode = tempNode;
				prevNode.next =newNode;
				newNode.previous = prevNode;
				newNode.next = nextNode;
				
				if(nextNode != null)					
					nextNode.previous = newNode;
				
				break;
			}		
			tempNode = tempNode.next;
		}
	}
	
	public void displayList()
	{
		DoubleEndedLinkedList tempNode ;
		
		tempNode = head ;
		
		while( tempNode!= null )
		{
			System.out.println(tempNode.homeAddress + " " + tempNode.homeNumber);
			tempNode = tempNode.next;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoubleEndedLinkedListDeneme deneme = new DoubleEndedLinkedListDeneme();
		
		deneme.insertInFirstPosition("kadikoy5", "5");
		deneme.insertInFirstPosition("kadikoy3", "3");
		deneme.insertInFirstPosition("kadikoy6", "6");
		deneme.insertInFirstPosition("kadikoy1", "1");
		
		deneme.insertAfterKey("kadikoy2", "2", "5"); 
		
		
		deneme.displayList();
	}

}
