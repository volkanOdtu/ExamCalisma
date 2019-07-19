
public class DoubleLnkDeneme {
	DoubleLnkLst firstLink ;
	DoubleLnkLst lastLink ;
	
	public void insertInFirstPosition(DoubleLnkLst node)
	{
		if(firstLink == null)
		{
			 firstLink = node ;
			 lastLink = node ;
			 return;
		}
		
		firstLink.prev = node ;
		node.next = firstLink;
		node.prev = null;
		firstLink = node;
	}
	
	public void insertAfterKey(DoubleLnkLst newNode ,String homeNumber)
	{
		DoubleLnkLst temp  = firstLink;
		DoubleLnkLst nextNode;
		
		while(temp != null)
		{
			if( temp.homeNumber == homeNumber )
			{		
				//Eger bu lastNode ise direk koyariz
				if( temp.next == null )
				{
					temp.next = newNode ; //newNode is adjusted ,because it will be next of tempNode					
					newNode.prev = temp;
					newNode.next = null;
					return;
				}
				
				nextNode = temp.next; //not to loose next node we keep it
				
				temp.next = newNode ; //newNode is adjusted ,because it will be next of tempNode
				
				newNode.prev = temp;
				newNode.next = nextNode;
				
				nextNode.prev = newNode;
			}
			temp = temp.next;
		}
		
	}
	
	public void displayList()
	{
		DoubleLnkLst temp ;
		
		temp = firstLink;
		
		while( temp != null )
		{
			System.out.println(temp.homeNumber + " " + temp.address );
			temp = temp.next;
		}
	}
	
	public static void main(String[] args)
	{
		DoubleLnkDeneme deneme = new DoubleLnkDeneme();
		
		deneme.insertInFirstPosition(new DoubleLnkLst("1", "Kadikoy"));
		deneme.insertInFirstPosition(new DoubleLnkLst("3", "Uskudar"));
		deneme.insertInFirstPosition(new DoubleLnkLst("2", "Beykoz"));
		
		deneme.insertAfterKey(new DoubleLnkLst("9", "Esenler"), "1");		
		deneme.insertAfterKey(new DoubleLnkLst("4", "Cengel"), "2");
		
		deneme.displayList();
		
	}
}
