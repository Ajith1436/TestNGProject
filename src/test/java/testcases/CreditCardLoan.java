package testcases;

import org.testng.annotations.Test;

public class CreditCardLoan extends BaseClass {
	@Test(dependsOnMethods="test5")
	public void test4() {
		System.out.println("Inside Credit Card Loan Test 4");
	}
	@Test(groups= {"sanity", "regression"})
	public void test5() {
		System.out.println("Inside Credit Card Loan Test 5");
	}

}
