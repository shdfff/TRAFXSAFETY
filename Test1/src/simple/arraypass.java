package simple;

public class arraypass
{

	static int c[]= {22,2,44,5};
	public static void a(int c[])
	{
		int b=c[1];
		for(int i=0;i<c.length;i++)
		{
			if(b>=c[i])
			{
				System.out.println(b);
			}
			else
			{
				System.out.println("abcd");
			}
		}
	}
	public static void main(String[] args)
	{
            a(c);
	}

}
