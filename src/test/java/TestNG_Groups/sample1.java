package TestNG_Groups;

import org.testng.annotations.Test;

public class sample1
{	
	@Test
	public void sample1()
	{
		System.out.println("Sample1");
	}
	
	@Test(groups ="smoke")
	public void sample2()
	{
		System.out.println("Sample2 of sample1");
	}

}
