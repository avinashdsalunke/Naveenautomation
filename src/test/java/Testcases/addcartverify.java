package Testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.ah.A;

import PageObjectModel.addcart;
import Resource.baseclass;
import Resource.constant;
@Test
public class addcartverify extends baseclass{
	  SoftAssert assertions = new SoftAssert();
double sum;
	public void addcart1() throws IOException, InterruptedException {
	launchbrowser();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	addcart AC=new addcart(driver) ;
		AC.search().sendKeys(constant.mob);	
		AC.clickbutton().click();
		AC.addtocartiphone().click();
		String A=AC.iphoneprice().getText();
		String New=A.substring(1, 7);
		double NUM=Double.parseDouble(New);
		System.out.println(NUM);                    //
		
		AC.search().clear();
		AC.search().sendKeys(constant.samsung);
		AC.clickbutton().click();
		AC.addtocartsamsung().click();
		String B=AC.samsungprice().getText();
		System.out.println(B);                           //
		String New1=B.substring(1, 7);
		double NUM1=Double.parseDouble(New1);
		System.out.println(NUM1);                       //
		
		sum=NUM+NUM1;
		System.out.println(sum);
		Thread.sleep(2000);
    	AC.totalcart().click();
    	String total=AC.totalsum().getText();
    	System.out.println(total);
    	double total1=Double.parseDouble(total);
    	
  double Act=sum;
  double exp=total1;
  
  int result = Double.compare(Act, exp);

  System.out.println(result);
    	
    	
		
		
		
		
		
		
	}
}
