import java.util.ArrayList;

public class Chatroom extends IAbsChatroom {

	@Override
	void register(IAbsVisitor visitor) {
		this.visitors.add(visitor);
		visitor.chatroom = this;
	}

	@Override
	void unregister(IAbsVisitor visitor) {
		this.visitors.remove(visitor );
		visitor.chatroom = null;
	}

	
	

}
