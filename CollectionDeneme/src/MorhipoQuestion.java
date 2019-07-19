
public class MorhipoQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aeiaaioooaauuaeiou";
		
		
	}
	
	public static String isStringOk(String s)
	{
		
		String[] letters = {"a" ,"e" ,"i" ,"o" ,"u" ,""};
		String currentLetter ,result ="";
		
		int total = 0;
		
		for( int i =0 ;i < letters.length ; )
		{
			currentLetter = letters[i];
			if(currentLetter == "")
				return result ; //demek ki sona geldik
			
			if(currentLetter == s.substring(0 ,1) )
			{
				total++;
				result += currentLetter; 
				s = s.substring(1 , s.length() - 1 );
			}
			else if( letters[i + 1] == s.substring(0 ,1)  ) //harfi degistir
			{
				currentLetter = letters[i + 1];
				result += currentLetter; 
				total++;
				i++;
			}
			else
			{
				i = 0;
				total = 0;
			}
				
					
		}
		return result;
	}
}
