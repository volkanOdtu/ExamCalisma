import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;

public class WordList {
	
	public Word first; //List in ilk elemani
		
	public void insert(Word newWord ,int hashKey)
	{
		newWord.hashedVal = hashKey;
		
		if(first == null)
		{
			first = newWord; return;			
		}
		Word temp = first;
		
		while( temp != null  /*&& newWord.hashedVal > temp.hashedVal */ )
		{
			if(temp.next == null)
			{
				temp.next = newWord;
				return;
			}				
		}
	}	
		
	public Word find(String word)
	{				
		Word temp = first;
		
		while( temp != null  )
		{
			if(temp.word == word )
				return temp ;
			
			temp = temp.next;
		}
		
		return null;
	}
}
