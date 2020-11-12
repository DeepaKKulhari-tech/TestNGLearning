package test;

import org.testng.annotations.Test;

public class TestSuit01 {

	
	@Test
	public void demo1suit() {
		System.out.println("test demoSuit1");

	}
//to skip the test case use enabled attribute
	@Test(groups= {"Smoke"},enabled=false)
	public void demo2suit()

	{
		System.out.println("test demoSuit2");
	}

}
