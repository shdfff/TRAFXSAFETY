package simple;

public class sample6
{
     int b=10;
     static int c=15;
     public static void d()
     {
    	 int e=15;
    	 System.out.println(e);
     }
     public void f()
     {
    	 int g=5;
    	 System.out.println(g);
     }
	public static void main(String[] args) 
	{
		int a=6;
		System.out.println(a);
		System.out.println(c);
		d();
		sample6.d();
		sample6 s1=new sample6();
		System.out.println(s1.b);
		s1.f();

	}

}
