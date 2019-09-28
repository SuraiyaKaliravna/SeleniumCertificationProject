package testCases;

import org.testng.Reporter;

import constantValues.TestData;
import mainScript.DriverScript;
import pages.MyCourse;
import pages.SignIn;
import utility.ActionKeyWords;

public class TC001 {
	SignIn SI = new SignIn();
	MyCourse MC = new MyCourse();
	ActionKeyWords AK = new ActionKeyWords();
	TestData TD = new TestData();
	
	public void tc01() {
		try {
			AK.openBrowser(TD.browserName);
			AK.openURL(TD.openURL);
			
			SI.clickSignInLink();
			SI.enterUsername();
			SI.enterPassword();
			SI.clickSignInButton();
			
			MC.clickAll();
			MC.clickOngoing();
			MC.fetchOngoingCourse();
			MC.clickUserProfile();
			MC.clickLogOut();
			
			AK.closeWindow();
		}
		catch(Exception e) {
			DriverScript.bValue = false;
			Reporter.log("Test case tc01 has failed");
			e.printStackTrace();
		}
	}

}
