import java.util.List;

public class AmazonFirstQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> cellCompute(int[] states ,int days )
	{
		Cell[] cells = new Cell[10];
		
		cells[0] = new Cell();
		cells[0].currentState = 0; //inactive
		//cells[0].prevState = 0; //inactive		
		cells[0].prevCell = null ;
		
		
		cells[9] = new Cell();
		//cells[0].prevState = 0; //inactive				
		cells[9].currentState = 0; //inactive
		cells[9].nextCell = null;
		
		//Tum cell ler birbirine baglandi
		for(int i =1 ; i <=8 ;i++)
		{
			cells[i] = new Cell();
			
			if( i == 1)
			{
				cells[1].currentState = states[1];
				cells[1].prevCell = cells[0];
				cells[1].nextCell = cells[2];
			}
			else if( i == 8)
			{
				cells[8].currentState = states[8];
				cells[8].prevCell = cells[7];
				cells[8].nextCell = cells[9];
			}
			else
			{
				cells[i].currentState = states[i];
				cells[i].prevCell = cells[i - 1];
				cells[i].nextCell = cells[i + 1];				
			}			
		}
			
		//Simdi tum cell lerin state leri elimizde var ,her ilerleyen gunde bir cell onceki gun e gore degisecek
		
		for( int i =0 ; i < days ; i++ )
		{
			for (int j= 1 ;j <=8 ;j++) 
			{
				//prev cell ,currentstate ve next cell e bakalim 
				//onceki ve sonraki ayni ise ,next gun state inactive olur
				if( (cells[j].prevCell).currentState == (cells[j].nextCell).currentState )
					cells[j].currentState = 0 ;
				else 
					cells[j].currentState = 1 ;
					
			}
		}
			
			
		
		return null;
	}

}
