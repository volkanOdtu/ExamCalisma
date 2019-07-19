
public class BinaryTree {

	public Node root;
	
	public void AddNode(Node newNode)
	{
		if(root == null)
		{
			root = newNode;
			return;
		}
		
		Node temp ;		
		temp = root;
		
		while(temp != null )
		{		
			if(  newNode.value > temp.value )
			{
				if(temp.rightChild == null)
				{
					temp.rightChild = newNode;
					return;
				}				
				else
					temp = temp.rightChild;
			}
			else if( newNode.value < temp.value )
			{
				if(temp.leftChild == null)
				{
					temp.leftChild = newNode ;
					return;
				}
				else 
					temp = temp.leftChild;
			}			
		}
		
		temp = newNode;		
	}
	
	public void displayTreeInOrder()
	{
		Node temp = root;
		
		print(temp);		
	}
	
	public void print(Node node)
	{
		Node temp = node;
		if(node != null)
		{
			if(node.leftChild != null )
			{
				temp = node.leftChild ;	
				print(temp);
			}
			if( node.rightChild != null )
			{
				temp = node.rightChild  ;
				print(temp);
			}
			
			System.out.println( node.value);
		}
	}
	
}
