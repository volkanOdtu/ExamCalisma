
public class Visitor extends IAbsVisitor {
	public Visitor(String name)
	{this.name = name ;}
	
	@Override
	public void send(String message /*,IAbsVisitor sender */ ) 
	{
		for(IAbsVisitor visitor: chatroom.visitors )
		{
			if( visitor.name != this.name  )
			{
				visitor.receive(message);
			}
		}
	}

	@Override
	public void receive(String message) {
		System.out.println(name +  " : received " + message );
	}

	

}
