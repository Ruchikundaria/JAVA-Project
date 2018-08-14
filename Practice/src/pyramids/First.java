package pyramids;

public class First {
	
	public static void main(String[] args)
	{
		int coloum=1,start=0,space=3;
		for(int i=1;i<=7;i++)
		{
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			if(i<4)
			{
				start=i;
				space=space-1;
				
			}
			else
			{
				start=8-i;
				space=space+1;
			}
			
			for(int j=1;j<=coloum;j++)
			{
				int mid=coloum/2+1;
				System.out.print(start);
				if(j<mid)
				{
				start--;
				}
				else
				{
					start++;
				}
			}
			System.out.println("");
			if(i<4)
			{
			coloum=coloum+2;
			}
			else
			{
				coloum=coloum-2;
			}
		}
	}

}
