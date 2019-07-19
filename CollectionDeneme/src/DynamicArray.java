import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T> {
	private T[] arr;
	private int len = 0;
	private int capacity = 0 ;
	
	public DynamicArray() {
		this(16);
	}
	@SuppressWarnings("unchecked")
	public DynamicArray(int capacity) {
		if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity );
		
		this.capacity = capacity;
		arr = (T[])new Object[capacity];
		
	}
	public int size() { return len ;}
	public boolean isEmpty() {return (size() == 0) ;}
	public T get(int i)
	{
		return arr[i]; 
	}
	public void set(int index ,T item)
	{
		arr[index] = item;
	}
	public void clear()
	{
		for(int i= 0; i < capacity ;i++)
			arr[i] = null;
		len = 0;
	}
	public void add(T item )
	{
		//time to resize
		
		if(len + 1 < capacity )
			arr[len] = item;
		else
		{
			capacity *= 2 ; 
			T[] newArr = (T[])new Object[capacity];
			for(int i = 0; i < len ; i++ )
				newArr[i] = arr[i];
			arr =newArr;
		}
		arr[len] = item;
		len++;
	}
	public T removeAt(int index)
	{
		if(index >= len && index < 0 ) throw new IndexOutOfBoundsException();
		T data = arr[index] ;
		
		T[] newArr = (T[]) new Object[capacity -1];
		
		int j=0;
		
		for(int i=0 ; i < len ; i++)
		{
			if( i == index ) continue;
			else
			{
				newArr[j] = arr[i];
				j++;
			}
		}
		
		arr = newArr;
		//capacity= len - 1;
		len--;
		
		return data ;
	}
	
	public boolean remove(Object obj)
	{
		for(int i= 0; i< len;i++)
		{
			if(arr[i].equals(obj) ) {removeAt(i) ; return true;}
		}
		return false;
	}
	
	public int indexOf(Object obj)
	{
		for(int i = 0 ;i < len ;i++)
			if(arr[i].equals(obj) ) return i;
		
		return -1;
	}
	
	public boolean contains(Object obj)
	{ return indexOf(obj) != -1; }
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<T>() {
			int index = 0;
			public boolean hasNext() { return index < len; }
			public T next() {return arr[index++];}
		};
	}
	
	@Override
	public String toString()
	{
		if(len == 0 ) return "[]";
		else
		{
			StringBuilder sb = new StringBuilder(len).append("[");
			for(int i = 0; i < len - 1 ;i++ )
				sb.append(arr[i] + ",");
			return sb.append(arr[len -1] + "]").toString();
		}	
	}
	
	public static void main(String args[])
	{
		DynamicArray<String> arr = new DynamicArray<String>(4);
		
		arr.add("ali");
		arr.add("veli");
		arr.add("kirkdokuz");
		arr.add("elli");
				
		
		for(int i = 0 ; i < arr.size() ;i++ )
			System.out.println(arr.get(i)) ;
		
		
		arr.removeAt(2);
		
		for(int i = 0 ; i < arr.size() ;i++ )
			System.out.println(arr.get(i)) ;
		
		arr.add("osman");
		arr.add("hale");
		
		for(int i = 0 ; i < arr.size() ;i++ )
			System.out.println(arr.get(i)) ;
	}
	
}


