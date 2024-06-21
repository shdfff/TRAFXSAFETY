package Scripts1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 
{
	
	@Test(priority=1)
	public void a1()
	{
		System.out.println("Hello a1");
	}
	
	@BeforeTest
	public void b()
	{
		System.out.println("Hello b");
	}

	@Test(priority=-1)
	public void a()
	{
		System.out.println("hello a");
	}
	
	
}
