
public class Word {
	public int hashedVal;
	public String word ;
	public String definition ;
	
	public Word next;
	
	public Word(String word ,String definition )
	{
		this.word = word;
		this.definition = definition;
	}
}
