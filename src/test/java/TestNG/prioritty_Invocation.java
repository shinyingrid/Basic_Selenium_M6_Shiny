package TestNG;

import org.testng.annotations.Test;

public class prioritty_Invocation 
{
	//1. TestNg main method
	@Test(invocationCount = 2)
	public void demo1()
	{
		System.out.println("demo1");
	}
	
	//2. TestNg main method
	@Test(invocationCount = 2,enabled = false)
	public void demo2()
	{
		System.out.println("demo2");
	}
	
	//2. TestNg main method
		@Test(priority = 0,invocationCount = 2)
		public void demo3()
		{
			System.out.println("demo3");
		}
	
}
/*
 demo3
 demo3
 demo1
 demo1
 but the o/p is 
 demo1
demo1
demo3
demo3
Reason - default priority is 0. So even if i give priority as 1, it picks the first script as per the order since the 
priority would be zero for the first method. It is the same when I give priority is zero
 */
