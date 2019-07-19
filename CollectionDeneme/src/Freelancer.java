
public class Freelancer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		markdownParser("####### Snow White and the Seven Hashtags " );
		
		
		/*
		getMiddle("test");
		getMiddle("testing");
		getMiddle("middle");
		getMiddle("A");
		*/
		//System.out.println( solution(200) );
	}
	
	public static String markdownParser( String markdown ) {
		markdown = markdown.trim();
		if(markdown.trim().indexOf("#") < 0 ||  markdown.trim().indexOf("#") > 0  ) return markdown;
		
		
		if(markdown == null) return markdown;
		int indexOfFirstSpace = markdown.indexOf(" ");
		
		if(indexOfFirstSpace == 0 || indexOfFirstSpace < 0  ) return markdown;
		
		String firstWord = markdown.substring(0, indexOfFirstSpace).trim() ;
		String secondWord =  markdown.substring(indexOfFirstSpace).trim();

		if(firstWord == null ) return markdown;
		if( secondWord == null ) return markdown;
		if(firstWord.length() == 0  || secondWord.length() == 0 ) return markdown;
		if(firstWord.length()>6 ) return markdown;
		
		for(int i = 0 ; i < firstWord.length()  ;i++ )
		{
			String hashChar = firstWord.substring(i, i+1) ;
			if ( !hashChar.equals("#")) return markdown;
		}
		
		//# den farkli deger olabilir
		int countHash= firstWord.length();
		
		StringBuilder result = new StringBuilder();
		
		result.append("<h").append(countHash).append(">").append(secondWord).append("</h").append(countHash).append(">");
		
		return result.toString() ;
	}
	
	public static String getMiddle( String str ) {
	
		boolean isEven =false ;
		int middleIndexPos = 0 ; String middleStr;
		
		int length = str.length();
		
		if( ( length % 2) == 0 ) isEven = true;
		
		if(isEven )
		{
			middleIndexPos = length/2;
			middleStr = str.substring( middleIndexPos - 1 , middleIndexPos + 1 ); 
		}
		else
		{
			middleIndexPos = length/2;
			middleStr = str.substring(middleIndexPos ,middleIndexPos + 1); 					
		}
		
		return middleStr;
	}
	
	public static int solution(int number)
	{
		int sum =0 ;
		
		for(int i =3 ; i< number ; i++ )
		{
			if ( ((i % 3) == 0 )  || ((i % 5) == 0 ) ) sum = sum + i;			
		}
		
		return sum;
	}
	

}
