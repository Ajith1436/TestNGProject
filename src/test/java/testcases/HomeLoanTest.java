package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {

	

	@Test(priority=1)
	public void test1() {
		System.out.println("Inside home Loan Test 1");
	}

	@Test(priority=0)
	public void test2() {
		System.out.println("Inside home Loan Test 2");
	}

	
}
