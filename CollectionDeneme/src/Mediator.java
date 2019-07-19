
public class Mediator {

	public static void main(String[] args) {

		IAbsVisitor tom = new Visitor("tom");
		IAbsVisitor dick = new Visitor("dick");
		IAbsVisitor harry = new Visitor("harry");
		
		IAbsChatroom chatroom = new Chatroom();
		//Chatroom a 3 kisi ekledik
		chatroom.register(tom);
		chatroom.register(dick);
		chatroom.register(harry);
		
		tom.send("Hi dostlar");
		dick.send("Selam Tom ve Harry");
		harry.send("Aleykum selam gencler");
	}

}
