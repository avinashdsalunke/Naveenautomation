package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import Resource.baseclass;

public class common extends baseclass {

	public static void commonselect(WebElement dropdownElement, String optionText) {

		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText(optionText);
	}

	public static void assersion(String at, String et,String msg) {

		SoftAssert assertions = new SoftAssert();
		assertions.assertEquals(at, et);
		assertions.assertAll();
	

}
}