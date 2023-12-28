package Teststeps;

import org.testng.annotations.Test;

import Mobilegestures.Androidmobilepages;
import utilities.Baseclass;

public class AndroidmobileTest extends Baseclass {
	
	
	@Test
	public void enterWifiDetails() throws Exception {
		Androidmobilepages pg = new Androidmobilepages(driver);
		pg.enterWifiSettingName();
	}

}
