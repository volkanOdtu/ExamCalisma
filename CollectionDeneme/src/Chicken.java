
import java.util.concurrent.Callable;
/*
interface Bird {
    Egg lay();
}*/

class Chicken /*implements Bird */{
    public Chicken() {
    }

    public static void main(String[] args) throws Exception {
        Chicken chicken = new Chicken();
        //System.out.println(chicken instanceof Bird);
    }
/*
	@Override
	public Egg lay() {
		Callable<Egg> newEgg = new Egg(createBird);
		
		return null;
	}*/
}
/*
class Egg implements Callable<Egg> {
	private Egg myEgg = new Egg(createBird);
	
    public Egg(Callable<Bird> createBird) {
        createBird.call();
    }
    //Kuluckadan cikma
    public Bird hatch() throws Exception {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

	@Override
	public Egg call() throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}
}
*/
