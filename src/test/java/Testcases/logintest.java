package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resource.baseclass;
import Resource.constant;
import Resource.creative1;

@Test
public class logintest extends baseclass {
	SoftAssert assertions = new SoftAssert();

	public void validlogin() throws IOException, InterruptedException {
		launchbrowser();
		driver.manage().window().maximize();
		LoginPageObject LPO = new LoginPageObject(driver);

		LPO.myaccount().click();
		LPO.login().click();
		
		LPO.emaillogin().sendKeys(registertest.email);

		LPO.password().sendKeys(constant.password);

		LPO.loginclick().click();

		String A = LPO.validtext().getText();
		String B = "My Account";

		assertions.assertEquals(A, B, "fails with data");

		assertions.assertAll();
	}
}