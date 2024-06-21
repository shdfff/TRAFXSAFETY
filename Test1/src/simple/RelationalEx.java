package simple;

public class RelationalEx 
{

	public static void main(String[] args)
	{
         int a=600;
         int b=300;
         if(a!=b)
         {
        	 System.out.println("a is not equal to b");
         }
         else {
        	 System.out.println("a is equal to b");
        	 
         }
         String p="Hello";
         String q="HELLO";
         if(p==q)
         {
        	 System.out.println("p and q are equal");
         }
         else {
        	 System.out.println("p is not equal to q");
         }
         if(p.equals(q))
         {
        	 System.out.println("p is equal to q");
         }
         else {
        	 System.out.println("p is not equal to q");
         }
         if(p.equalsIgnoreCase(q))
         {
        	 System.out.println("p is equal to q");
         }
         else 
         {
        	 System.out.println("p is not equal to q");
         }
	}

}
