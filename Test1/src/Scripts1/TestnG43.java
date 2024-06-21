package Scripts1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestnG43 {

	
	@Test
	public void c()
	{
		System.out.println("Hello a");
	}
	@Test(invocationCount=2, priority=-1, enabled=false & true)
	public void b()
	{
		System.out.println("Hello ab");
		
	}
	@Test(invocationCount=2)
	public void cc()
	{
		System.out.println("Hello cc");
		
	}
	@BeforeMethod
    public void dc()
    {
		System.out.println("Test cd");
    }
}
