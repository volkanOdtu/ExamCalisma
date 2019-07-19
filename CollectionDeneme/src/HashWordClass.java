
public class HashWordClass {
	
	int arraySize = 11;
	WordList[] theArray = new WordList[arraySize];
	
	public String[][] elementsToAdd = {
			{ "ace", "Very good"},
			{ "act", "Take action"},
			{ "age", "Grow old"},
			{ "ape", "A large primate"},
			{ "arc", "A part of circumference"},			
	};
	
	public HashWordClass()
	{
		for( int i = 0 ;i < arraySize ; i++)
			theArray[i] = new WordList();
		
		addTheArray(elementsToAdd);
	}
	
	public int getHashIndex(String word)
	{
		//int hashIndex =  val % 10 ;
		int hashIndex = 0;
		for( int i= 0; i < word.length() ; i++ )
		{
			hashIndex += Integer.valueOf(word.charAt(i));
		}
		return (hashIndex %  arraySize);
	}
	
	public void addTheArray(String[][] words)
	{
		for( int i= 0; i < words.length ; i++ )
		{
			String word = words[i][0];
			String definition = words[i][1];
			
			Word newWord = new Word(word, definition);
			insert(newWord );
		}		
	}	
	
	public void insert(Word newWord)
	{
		int hashVal = getHashIndex( newWord.word);
		theArray[hashVal].insert(newWord, hashVal);
	}

	public Word find(String wordToFind)
	{
		int hashVal = getHashIndex(wordToFind);
		Word theWord = theArray[hashVal].find(wordToFind);
		
		return theWord;
	}
}
