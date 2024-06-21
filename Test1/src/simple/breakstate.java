package simple;

public class breakstate {

	public static void main(String[] args)
	{
		/*for(int i=0;i<=5;i++)
		{
			if(i==0)
			{
				break;
			}
			System.out.println("loop is" +"" +i);
		}
	    	System.out.println("loop out");*/
		
	for(int i=1;i<3;i++)
	{
		for(int j=1;j<3;j++)
		{
			if(i==2 && j==2)
			{
				break;
			}
			System.out.println(i+ " " +j);

		}
		System.out.println("loop in");

	}
	System.out.println("loop out");

	}

}
