
public class Hatirlama2 {

	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		tree.AddNode(new Node(10));
		tree.AddNode(new Node(15));
		tree.AddNode(new Node(20));
		tree.AddNode(new Node(12));
		tree.AddNode(new Node(8));
		tree.AddNode(new Node(9));
		tree.AddNode(new Node(4));
		tree.displayTreeInOrder();
		
		
	}
}
