package simple;

public class Inheritance4 extends Inheritance3
{
         public void multiply(int x, int y)
         {
        	 z = x*y;
        	 System.out.println("multiply" +z);
        	 
         }
	public static void main(String[] args)
	{
             int x=20,y=50;
             Inheritance4 A2=new Inheritance4();
             A2.add(x,y);
             A2.substract(10,20);
             A2.multiply(x,y);
             
	}

}
