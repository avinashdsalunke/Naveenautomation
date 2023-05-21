package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.common;
import PageObjectModel.tabobjectmodel;
import Resource.baseclass;
@Test
public class verifytab extends baseclass{
	 SoftAssert assertions = new SoftAssert();

		public void verifytab() throws IOException {
			tabobjectmodel TOM=new tabobjectmodel(driver);
			
			TOM.desktopstab().click();
			String Act1=TOM.textdsktp().getText();
			String exp1="PC (1)";
			//assertions.assertNotEquals(Act1, exp1);
			
			common.assersion(exp1, Act1, "one");
			
			TOM.laptopsandnotebook().click();
			String Act2=TOM.laptop().getText();
			String exp2="Windows (0)";
			//assertions.assertNotEquals(Act2, exp2);
			common.assersion(exp1, Act2, "two");
			
			TOM.components().click();
			String Act3=TOM.componenttext().getText();
			String exp3="Monitors (2)";
			//assertions.assertNotEquals(Act3, exp3);
			common.assersion(exp2, Act3, "three");
			
			TOM.tablets().click();
			String Act4=TOM.tablettext().getText();
			String exp4="Tablets";
			//assertions.assertNotEquals(Act4, exp4);
			common.assersion(exp3, Act4, "four");
			
			TOM.software().click();
			String Act5=TOM.Softwaretext().getText();
			String exp5="Software";
			//assertions.assertNotEquals(Act5, exp5);
			common.assersion(exp4, Act5, "five");
			
			TOM.phonesandPDAs().click();
			String Act6=TOM.phonetext().getText();
			String exp6="Phones & PDAs";
			//assertions.assertNotEquals(Act6, exp6);
			common.assersion(exp5, Act6, "six");
			
			TOM.cameras().click();
			String Act7=TOM.cameratext().getText();
			String exp7="Cameras";
			//assertions.assertNotEquals(Act7, exp7);
			common.assersion(exp6, Act7, "seven");
			
			TOM.mp3player().click();
			String Act8=TOM.mp3text().getText();
			String exp8="test 11 (0)";
			//assertions.assertNotEquals(Act8, exp8);
			common.assersion(exp7, Act8, "eight");



			

			

}

		}
