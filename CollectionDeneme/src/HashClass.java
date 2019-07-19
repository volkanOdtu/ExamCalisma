
public class HashClass {
	String[] arr;
	int arraySize =11;
	
	public int getHashIndex(int val)
	{
		int hashIndex =  val % 10 ;
		return hashIndex ;
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
	
	public String[] hashArr(String[] elements  )
	{
		arr = new String[10];
		
		for( int i = 0; i < elements.length ;i++ )
		{
			//int hashIndex = getHashIndex(Integer.parseInt(elements[i]))  ;
			int hashIndex = getHashIndex( elements[i])  ;
			
			
			if(arr[hashIndex] != null) //collision occurred ,search for next item
			{
				while( arr[hashIndex] != null ) //Bos olan yeri ariyoruz
				{
					hashIndex++; //Bir sonraki index e bakicaz yer var mi?
					
					if(arr[hashIndex] == null )
					{
						arr[hashIndex] = elements[i]; break;
					}
				}
			}
			else
			{
				arr[hashIndex] = elements[i];
			}
		}
		
		return arr;
	}
	
	public int findIndex(String key)
	{
		//int hashedIndex = Integer.parseInt(key) % 10;
		//int hashedIndex = getHashIndex( Integer.parseInt(key) );
			
		int hashedIndex = getHashIndex(key );
		
		if( arr[hashedIndex] == key )
			return hashedIndex;
		else
		{			
			while( arr[hashedIndex] != null)
			{
				hashedIndex++;
				if(arr[hashedIndex] == key)
				{return hashedIndex;}
			}
		}
		return -1;
	}
	
}
