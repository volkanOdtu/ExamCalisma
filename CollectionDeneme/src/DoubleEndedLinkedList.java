
public class DoubleEndedLinkedList {
	public String homeAddress;
	public String homeNumber;
	
	DoubleEndedLinkedList previous =null;
	DoubleEndedLinkedList next =null;
	
	public DoubleEndedLinkedList(String homeAddress ,String homeNumber)
	{
		this.homeAddress = homeAddress;
		this.homeNumber = homeNumber ;		
	}
	
}
