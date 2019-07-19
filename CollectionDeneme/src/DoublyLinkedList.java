
public class DoublyLinkedList<T> {

	Node<T> head =null ;
	Node<T> tail =null;
	int size =0 ;
	
	private class Node<T>
	{
		T data;
		Node next;
		Node prev;
		
		public Node(T data ,Node next, Node prev)
		{
			this.data= data ; this.next = next; this.prev = prev;
		}
		public Node(T data)
		{   this.data = data;}
		
		@Override
		public String toString()
		{
			return data.toString();
		}
	}
	
	public void clear()
	{
		Node<T> temp ;
		
		temp = this.head;
		
		while( temp != null )
		{
			Node<T> tempNext = temp.next;
			temp.data= null; 
			temp.prev = null ;temp.next = null ;
			
			temp = tempNext;
		}
		this.head = this.tail= temp = null;
		size = 0;
	}
	
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size == 0 ;
	}
	public void add(T elem)
	{
		addLast(elem);
	}
	public void addFirst(T elem) //O(1)
	{
		Node<T> temp = new Node<T>(elem);
		
		if( head == null )
		{  //Tail degismiyo ,no need to touch
			head = tail = temp ;  //tail = head;
		}
		else
		{			
			temp.prev = null; 
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
		size++;
	}
			
	public void addLast(T elem)
	{
		Node<T> temp = new Node<T>(elem);
		
		if( isEmpty() )
		{
			temp.prev =null; temp.next =null;
			head = tail = temp;
		}
		else
		{
			tail.next = temp;
			temp.prev = tail;
			temp.next = null;
			tail = temp;
		}
		size++;
	}
	
	public T peekFirst()
	{
		if( isEmpty()) throw new RuntimeException("Empty List");
		return head.data;
	}
	
	public T peekLast()
	{
		if( isEmpty()) throw new RuntimeException("Empty List");
		return tail.data;
	}
	
	public T removeFirst()
	{
		if( isEmpty()) throw new RuntimeException("Empty List");
		
		T data = head.data;
		
		if(head == tail)
		{
			head = null ;tail = null; //head ve tail next ,prev zaten null burda
		}
		
		if(head.next != null ) 
		{
			head = head.next;
			head.prev = null; //Memory clean gerekir burda ,tail le ilgili bi sey yapmiyoruz
		
		}
		size--;
		return data;
	}
	
	public T removeLast()
	{
		if( isEmpty()) throw new RuntimeException("Empty List");
		
		T data = tail.data;
		
		if(head == tail)
		{
			head = null ;tail = null; //head ve tail next ,prev zaten null burda
		}
		if(tail.prev != null)
		{
			tail = tail.prev;
			tail.next = null; //Memory clean yapalim
		}
		size--;
		
		return data;
	}
	

	public boolean remove( T data)
	{
		boolean result = false;
		//Eger remove edilcek node either tail or head ise removeFirst ,removeLast ile head veya tail e dokunmadan remove edebiliriz
		if(head.data == data ) {removeFirst(); return true; };
		if(tail.data == data ) {removeLast(); return true; };
			
		Node<T> tempNode = head ;
		
		while(tempNode != null )
		{
			if(tempNode.data == data )
			{
				Node<T> prevNode ,nextNode ;
				
				prevNode = tempNode.prev;
				nextNode = tempNode.next;
				
				prevNode.next = nextNode;
				nextNode.prev = prevNode;
				//burda endiseliydik ,ama pointer lar sadece kendini null liyor ,point ettigi yeri degil?
				//Yani point ettigi yerlerden bagini koparinca artik o adres point edilmez ve garbage collected icin ready olur
				tempNode.prev = null ; tempNode.next= null ;tempNode =null; 
				//burda tempNode kendisi Node tipinde obje onun icin null liyourz, point ettigi adres zaten memory de adres
				--size;
				result = true;
				break;
			}
			
			tempNode = tempNode.next;
		}
		
		
		return result;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		
		Node<T> temp = head;
		while( temp!= null )
		{
			sb.append(temp.data + " ");
			temp = temp.next;
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		DoublyLinkedList<Integer> intDoubleLinkedList = new DoublyLinkedList<Integer>();
		
		intDoubleLinkedList.add( 5 );
		intDoubleLinkedList.add( 10 );
		intDoubleLinkedList.add( 4 );
		intDoubleLinkedList.add( 1 );
		
		System.out.println( intDoubleLinkedList.toString());
		intDoubleLinkedList.remove(4);
		System.out.println( intDoubleLinkedList.toString());
						
	}
}
