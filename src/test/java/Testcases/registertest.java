package Testcases;

import Resource.creative1;
import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import PageObjectModel.RegisterPageObject;
import Resource.baseclass;
import Resource.constant;

@Test
public class registertest extends baseclass {
	public static String email;
	SoftAssert assertions = new SoftAssert();

	@Test
	public void register() throws IOException {
		
		RegisterPageObject RPO = new RegisterPageObject(driver);
		RPO.myaccount().click();
		RPO.ragister().click();
		RPO.firstname().sendKeys(constant.firstname);

		RPO.lastname().sendKeys(constant.lastname);
		email = creative1.generateemail();

		RPO.email().sendKeys(email);
		RPO.telephone().sendKeys(constant.phone);
		RPO.password().sendKeys(constant.password);
		RPO.passwordconfirm().sendKeys(constant.password);
		RPO.agreecheckbox().click();
		RPO.continuebotton().click();
		System.out.println(email);

		String P = RPO.validtext().getText();
		String Q = constant.expectedtext;
		assertions.assertEquals(P, Q, "ENTER INVALID DATA");
		assertions.assertAll();

	}

}
