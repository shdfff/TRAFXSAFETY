package simple;

public class override2 extends override1
{
    public void eat()
    {
    	System.out.println("i am acts");
    }
	public static void main(String[] args) 
	{
       override2 c1=new override2();
       c1.eat();
       override1 c2=new override1();
       c2.eat();
	}

}
