package TestNG_Groups;

import org.testng.annotations.Test;

public class sample2 
{

	@Test(groups="smoke")
	public void sample2()
	{
		System.out.println("Sample2 class ");
	}
	
	@Test
	public void sample3()
	{
		System.out.println("Sample2 class sample 3");
	}

}
