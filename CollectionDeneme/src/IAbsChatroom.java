import java.util.ArrayList;
import java.util.List;

import javax.swing.text.IconView;

public abstract  class IAbsChatroom {
	public ArrayList<IAbsVisitor> visitors = new ArrayList<IAbsVisitor>() ;
	
	abstract void register(IAbsVisitor visitor);
	abstract void unregister(IAbsVisitor visitor);
	

}
