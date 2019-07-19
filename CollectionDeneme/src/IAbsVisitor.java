
public abstract class IAbsVisitor {
	public IAbsChatroom chatroom = new Chatroom(); 
	public String name = null;
	abstract void send(String message );
	abstract void receive(String message);
}
