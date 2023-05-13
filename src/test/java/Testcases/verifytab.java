package Testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.tabobjectmodel;
import Resource.baseclass;
@Test
public class verifytab extends baseclass{
	 SoftAssert assertions = new SoftAssert();

		public void verifytab() throws IOException {
			launchbrowser();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			tabobjectmodel TOM=new tabobjectmodel(driver);
			
			TOM.desktopstab().click();
			String Act1=TOM.textdsktp().getText();
			String exp1="PC (0)";
			assertions.assertNotEquals(Act1, exp1);
			
			TOM.laptopsandnotebook().click();
			String Act2=TOM.laptop().getText();
			String exp2="Windows (0)";
			assertions.assertNotEquals(Act2, exp2);
			
			TOM.components().click();
			String Act3=TOM.componenttext().getText();
			String exp3="Monitors (2)";
			assertions.assertNotEquals(Act3, exp3);
			
			TOM.tablets().click();
			String Act4=TOM.tablettext().getText();
			String exp4="Tablets";
			assertions.assertNotEquals(Act4, exp4);
			
			TOM.software().click();
			String Act5=TOM.Softwaretext().getText();
			String exp5="Software";
			assertions.assertNotEquals(Act5, exp5);
			
			TOM.phonesandPDAs().click();
			String Act6=TOM.phonetext().getText();
			String exp6="Phones & PDAs";
			assertions.assertNotEquals(Act6, exp6);
			
			TOM.cameras().click();
			String Act7=TOM.cameratext().getText();
			String exp7="Cameras";
			assertions.assertNotEquals(Act7, exp7);
			
			TOM.mp3player().click();
			String Act8=TOM.mp3text().getText();
			String exp8="test 11 (0)";
			assertions.assertNotEquals(Act8, exp8);
			
			



			

			

}

		}
