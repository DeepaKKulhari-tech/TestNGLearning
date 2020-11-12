package test;

import org.testng.annotations.Test;

public class TestSuit02 {

	@Test
	public void mobile01()
	{
		System.out.println("mobile01");
	}
	@Test(groups= {"Smoke","Regression"})
	public void mobile02()
	{
		System.out.println("mobile02");
	}
	@Test
	public void mobile03()
	{
		System.out.println("mobile03");
	}
	@Test
	public void mobile04()
	{
		System.out.println("mobile04");
	}
	
	@Test
	public void mobile05()
	{
		System.out.println("mobile05");
	}
}
