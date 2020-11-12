package testPackage01;

import org.testng.annotations.Test;

public class MobileTestSuit02 {

	@Test
	public void mobile01() {
		System.out.println("mobile01");
	}

	@Test
	public void mobile02() {
		System.out.println("mobile02");
	}

	@Test
	public void mobile03() {
		System.out.println("mobile03");
	}

// time uptil it waits after which it fails
	@Test(groups = "Smoke", timeOut = 1000)
	public void mobile04() {
		System.out.println("mobile04");
	}

	// multiple attribute for same annotation
	@Test(groups = { "Smoke" }, dependsOnMethods = "mobile04")
	public void mobile05() {
		System.out.println("mobile05");
	}
}
