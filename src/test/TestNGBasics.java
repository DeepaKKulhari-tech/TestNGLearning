package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNGBasics {

	@Test(priority=2)
	public void demo1() {
		System.out.println("test demo1");

	}
	
	//can take multiple paramters at the same time
    @Parameters({"URL","Login"})
	@Test(priority=1)
	public void demo2(String urlbase, String login)

	{
		System.out.println("test demo2");
		System.out.println(urlbase);
		System.out.println(login);
	}

	@Test(groups= {"Smoke"})
	public void demo3()

	{
		System.out.println("test demo3");
	}
	@BeforeTest
	public void BeforeTestrun()
	{
		System.out.println("First Test Case");
	}
	@BeforeMethod
	public void BeforeTestEachTestCase()
	{
		System.out.println("Before every test case, I will run");
	}
	@AfterTest
	public void AfterTestrun()
	{
		System.out.println("Last Test Case");
	}
	@AfterMethod
	public void AfteEachTestCase()
	{
		System.out.println("After every test case, I will run");
	}
	@AfterSuite
	public void AfteEachTestSuite()
	{
		System.out.println("I will run after the whole test suite");
	}
	@AfterClass
	public void AfteEachClass()
	{
		System.out.println("I will run after the class method runs");
	}
	
}
