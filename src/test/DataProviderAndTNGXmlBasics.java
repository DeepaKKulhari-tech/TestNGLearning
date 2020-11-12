package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DataProviderAndTNGXmlBasics {

	@Test(dataProvider="getData")
	public void xmldemo1(String username, String password) {
		System.out.println("test xmldemo1");
		System.out.println(username);
		System.out.println(password);

	}

	@Test(groups = { "Smoke" })
	public void xmldemo2()

	{
		System.out.println("test xmldemo2");
	}
	//this is to provide multiple data where it is not judicious to use parameter in testNg xml
	
	@Test(dataProvider="SpecialgetData") 
	public void siblingsName(String name)
	{
		System.out.println(name);
		Assert.assertTrue(false);
	}
	
@DataProvider
	public Object[][] getData() {
	//username & password , two dimensional array
	Object[][] data =new Object[3][2];
	data[0][0]="DK";
	data[0][1]="1991";
	data[1][0]="SK";
	data[1][1]="1889";
	data[2][0]="baby";
	data[2][1]="2023";
	return data;
	
	}

@DataProvider
public Object[] SpecialgetData() {
//username & password , one dimensional array
Object[] data = {"Deepak","Divya","Anjali"};
return data;

}

}
