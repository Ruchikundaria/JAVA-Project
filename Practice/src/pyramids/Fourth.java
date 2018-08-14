package pyramids;

public class Fourth {


	public static void main(String[] args)
	
	{
		int i,spc=9,stc=1;
		for(i=1;i<=10;i++)
		{
			System.out.println();
			for(int j=1;j<=spc;j++)
			{
				System.out.print(" ");
				
			}
				for(int k=1;k<=stc;k++)
				{
					System.out.print("*");
					
				}
				
				spc=spc-1;
				stc=stc+2;
			
		}
	}

}
