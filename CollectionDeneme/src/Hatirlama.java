import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Hatirlama {
	
	
	public static void main(String[] args) {
		
		HashWordClass hashObj = new HashWordClass();
		System.out.println( hashObj.find("ace").definition ) ;
		System.out.println( hashObj.find("act").definition ) ;
		System.out.println( hashObj.find("age").definition ) ;
		
		
		/*
		String[] elements = {"cat" ,"dog" ,"ant"} ;
		
		
		HashClass hashObj = new HashClass();
		
		//module 10 a gore index bulan bir function var
		String[] hashedArr = hashObj.hashArr(elements);
		
		
		for(int i = 0 ; i< hashedArr.length ;i++ )
		{
			if( hashedArr[i] == null ) 
				System.out.println("index: " + i + " value: null " );
			else 
				System.out.println("index: " + i + " value: " + hashedArr[i] );
		}	
		
		
		//System.out.println( hashedArr[ hashObj.findIndex("31") ] );
		System.out.println( hashedArr[ hashObj.findIndex("dog") ] );
		 
		
		/*
		Queue<String> q = new LinkedList<String>();
		
		q.add("Rick");
		q.add("Maggie");
		
		
		for (String string : q) {
			System.out.println(string);			
		} */
		
		
		/*
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(12, "Roma");
		hmap.put(2, "ISTANBUL");
		
		HashSet<String> setimiz = new HashSet<String>();
		
		setimiz.add("aaa");
		setimiz.add("bbb");
		setimiz.add("ccc");
		
		setimiz.iterator();
		for (String string : setimiz) {
			System.out.println(string);
				
		}*/
		
		 /*
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		
		
		LinkedList<String> liste = new LinkedList<String>();
		
		liste.add("aaa");
		liste.add("bbb");
		liste.add("eee");		
		liste.add("ddd");
		liste.add("ccc");
		
		
		Iterator<String> iterator = liste.iterator() ;
		String item = liste.get(1) ;
		
		System.out.println("First index: " + item );
		
		while( iterator.hasNext() )
		{
			System.out.println( iterator.next() );
			//iterator.next();
		}
		
		/*
		int[][][] arr1 = { { {0 ,0 ,0} ,{1 ,1 ,1} }};
		
		for( int i= 0 ; i< arr1.length ;i++)
			for(int j =0 ; j < arr1[i].length ; j++ )
				for(int k =0 ; k < (arr1[i][j]).length ; k++ )					
					System.out.println( arr1[i][j][k]  ); */
	}

}
