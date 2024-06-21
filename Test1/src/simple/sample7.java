package simple;

public class sample7 
{
       int x=100;
       String s="hello";
       static int y=1005;
       public static void method1()
       {
    	   String x="hi";
    	   System.out.println(x);
    	   
       }
       public void method2()
       {
    	   int i=107;
    	   System.out.println(i);
       }
	public static void main(String[] args)
	{
		
      sample7 s1=new sample7();
      System.out.println(s1.x);
      System.out.println(s1.s);
      System.out.println(y);
      method1();
     s1.method2();
	}

}
