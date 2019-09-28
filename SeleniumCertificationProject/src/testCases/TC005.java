package testCases;

import org.testng.Reporter;

import mainScript.DriverScript;
import pages.Validation;
import utility.ActionKeyWords;

public class TC005 {
	Validation VL = new Validation();
	ActionKeyWords AK = new ActionKeyWords();
	
	public void tc05() {
		try {
			VL.validateCompanyName();
			VL.validateCurrentIndustry();
			VL.validateCurrentRole();
			AK.quitBrowser();
		
		}
		catch(Exception e) {
			DriverScript.bValue = false;
			Reporter.log("Test case tc05 has failed");
			e.printStackTrace();
		}
		
	}
}
