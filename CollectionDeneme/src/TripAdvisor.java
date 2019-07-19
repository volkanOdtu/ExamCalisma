import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class TripAdvisor {
	
	static String[] braces(String[] values) {

		String[] results = new String[values.length];
		
		for(int i = 0; i< values.length ;i++  )
		{
			if(  isValid( values[i]) ) 
				results[i]= "YES";
			else
				results[i]= "NO";
		}

		return results;
    }
	
	static boolean isValid(String Str)
	{
		boolean result =false;
		String leftParanthesType1 = "{" ;
		String leftParanthesType2 = "[" ;
		String leftParanthesType3 = "(" ;
		
		String rightParanthesType1 = "}" ;
		String rightParanthesType2 = "]" ;
		String rightParanthesType3 = ")" ;
		
		String activeChar ,lastItemInLeft ,corrCharacter;
		ArrayList<String> leftArrList = new ArrayList<String>();
		ArrayList<String> rightArrList = new ArrayList<String>();
		boolean isValid = false;
		
		while(Str.length() > 0)
		{
			activeChar = Str.substring(0, 1);
			Str = Str.substring(1);
			
			if( activeChar.equals(leftParanthesType1) || activeChar.equals(leftParanthesType2) || activeChar.equals(leftParanthesType3)  )
			{
				leftArrList.add(activeChar);
			}
			else //if()
			{
				lastItemInLeft = leftArrList.get(leftArrList.size() - 1 ) ;
				corrCharacter = findCorr(lastItemInLeft) ;
				
				if( ! corrCharacter.equals(activeChar) )
					return false;
				
				leftArrList.remove(lastItemInLeft);
			}
			
		}
		
		if(leftArrList.size() == 0) return true;
		
		return false;
	}
	
	static String findCorr(String charLeft)
	{
		String leftParanthesType1 = "{" ;
		String leftParanthesType2 = "[" ;
		String leftParanthesType3 = "(" ;
		
		String rightParanthesType1 = "}" ;
		String rightParanthesType2 = "]" ;
		String rightParanthesType3 = ")" ;
		
		String result ;
		
		if(charLeft.equals(leftParanthesType1 ))
			result = rightParanthesType1 ;
		else if ( charLeft.equals(leftParanthesType2 ) )
			result =  rightParanthesType2 ;
		else 
			result =  rightParanthesType3 ;
		
		return result;
	}
	
	static String findNumber(List<Integer> arr, int k) {

		if( arr.contains(k) ) return "YES";
		
		return "NO";
    }

	static int calculateLargest(int max) {
		int maxTotal = 0;
		
		List<Integer> primes = new ArrayList<Integer>();
		
		for(int i = 2 ;i <= max ;i++ )
		{
			if( isPrime(i) )
				primes.add(i);
		}
		int temp =0 , maxPrime=0;
		for (Integer prime : primes) {
			//get each character and add
			temp = getValue(  prime.toString() );
			if( temp > maxTotal)
			{
				maxTotal = temp;
				maxPrime = prime;
			}
		}
		
		return maxPrime;	
    }
	static  int getValue(String number)
	{
		int val =0 ,sum =0 ;
		
		while(number.length() > 0 )
		{	val = Integer.valueOf(number.substring(0, 1));
			number = number.substring(1);
			sum = sum + val;
		}
		return sum;
	}
	
	static boolean isPrime(int number)
	{
		boolean result = false ; 
		boolean boulnebilir = false;
		int resultBool ;
		
		for(int i =2 ; i< number ; i++)
		{
			resultBool = number % i ;
			if ( resultBool == 0) return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		calculateLargest(17) ;
		calculateLargest(23) ;
		calculateLargest(89) ; 
		
		String[] values = { "{}[]()" ,"{[]}()", "{[()]}"   } ;
		
		braces(values);
		
		
		/*
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);  
		List<Integer> arr = new ArrayList<Integer>();
		
		Integer item ,arrLength ,searchedItem;
		
		arrLength = Integer.valueOf( in.nextLine());
		
		//Integer[] arr = new Integer[arrLength] ;
				
		searchedItem = Integer.valueOf( in.nextLine());
		
		for(int i=0 ; i< arrLength ;i++)
		{
			//arr[i] =
			item = Integer.valueOf( in.nextLine());
			arr.add(item);
		}
		
		System.out.println( findNumber(arr, searchedItem)); */
	}

}
