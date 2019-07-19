import java.util.Hashtable;
import java.util.Scanner;

public class VmWare {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);  
		Integer N ,K ,L ,M ;
		String s;
		 
		 N = Integer.valueOf( in.nextLine());
		 String KLM = in.nextLine();
		 String KLMArr[] = KLM.split(" ");
		 
		 K = Integer.valueOf(KLMArr[0]);
		 L = Integer.valueOf(KLMArr[1]);
		 M = Integer.valueOf(KLMArr[2]);
		 s  = in.nextLine();

		int lowestLength = K;
		int highestLength = L;
		int distinctCharsAtMost = M;

		int tempPoint = 0;
		
		Hashtable<String, Integer> numberOfOccurs = new Hashtable<String, Integer>();
		
		while(tempPoint < s.length() )
		{
			
		}
		
	}
	
	public static int findOccurrenceOfSubStr(String s ,String searchedStr)
	{
		int count = 0;
		int index = 0 ;
		
		while(s.length() > 0  )
		{
			if(s.indexOf(searchedStr) > -1 )
			{
				index = s.indexOf(searchedStr) ;
				s = s.substring(index);
				count++;
			}
			else 
				break;
		}
		
		return count;
	}
	

}
