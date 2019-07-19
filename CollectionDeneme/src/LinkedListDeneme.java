import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDeneme {

	int[] theArr = new int[50];
	int arrSize = 10;
	
	public static void main(String[] args) {
		int[] theArray = new int[5];
		theArray[0] = 5 ;
		theArray[1] = 1 ;
		theArray[2] = 3 ;
		theArray[3] = 2 ;
		theArray[4] = 4 ;
		
		selectionSort(theArray );
		
		for(int i =0 ; i < theArray.length ; i++ )
		System.out.println( theArray[i] ); 		
		
		/*
		Queue<String> myQueue = new LinkedList<String>();
		myQueue.add("volkan1");
		myQueue.add("volkan2");
		myQueue.add("volkan3");
		
		while( !myQueue.isEmpty() )
		{
			String item = myQueue.remove();
			
			System.out.println( item ); 		}
		
		
		HashSet<String> hset = new HashSet<String>();
		hset.add("volkan1");
		hset.add("volkan2");
		hset.add("volkan3");
		
		for(String s:hset )
		{

			System.out.println( s); 
			
		}
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "ali");
		hmap.put(3, "veli");
		hmap.put(2, "hasan");
		
		System.out.println( hmap.get(3)); 
		
		
		
		ArrayList<String> arrListObj = new ArrayList<String>();
		
		arrListObj.add("volkan1");
		arrListObj.add("volkan2");
		arrListObj.add("volkan3");
		arrListObj.add("volkan4");
		for(String s :arrListObj  )
		{
			System.out.println( s );			
		}
			
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("item1");
		linkedList.add("item2");
		linkedList.add("item3");
		linkedList.add("item4");
		
		linkedList.add(4, "item4 olsun");
		
		Iterator<String> iterator = linkedList.iterator();
		
		while(iterator.hasNext() )
		{
			System.out.println(iterator.next());
		}*/
		
	}
	public static void selectionSort(int[] theArray)
	{
		int minimum;
		int minimumIndex;
		
		int arraySize = theArray.length;
		
		for( int x =0 ; x < arraySize ; x++)
		{
			minimum =  theArray[x];
			minimumIndex = x;
			//Bu for loop tum dizideki minimum elemani buluyor
			for( int y = x ; y < arraySize ; y++)
			{
				if( theArray[y] < minimum  )
				{
					minimum = theArray[y];
					minimumIndex  = y;
				}
			}
			swapValues(theArray ,x, minimumIndex);
		}
	}

	public static void swapValues(int[] theArray ,int indexOne ,int indexTwo)
	{
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}

	public void generateRandomArr()
	{
		for(int i=0 ; i < arrSize ; i++ )
		{
			theArr[i] = (int)(Math.random() * 10);
		}
	}
	
	public void printArray()
	{
		for(int i=0 ; i < arrSize ; i++ )
		{
			System.out.println( theArr[i] );  
		}
	}
	public int getValueAtindex(int i)
	{
		return theArr[i];
	}
	public void deleteIndex(int index )
	{
		
	}

}
