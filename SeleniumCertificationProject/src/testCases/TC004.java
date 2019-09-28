package testCases;

import org.testng.Reporter;

import constantValues.TestData;
import mainScript.DriverScript;
import pages.MyCourse;
import pages.MyProfile;
import pages.ProfessionalDetails;
import pages.SignIn;
import utility.ActionKeyWords;

public class TC004 {
	SignIn SI = new SignIn();
	ActionKeyWords AK = new ActionKeyWords();
	TestData TD = new TestData();
	MyCourse MC = new MyCourse();
	MyProfile MP = new MyProfile();
	ProfessionalDetails PD = new ProfessionalDetails();
	
	public void tc04() {
		try {
			AK.openBrowser(TD.browserName);
			AK.openURL(TD.openURL);
			
			SI.clickSignInLink();
			SI.enterUsername();
			SI.enterPassword();
			SI.clickSignInButton();
			
			MC.clickUserProfile();
			MC.clickMyProfile();
			
			Thread.sleep(2000);
			MP.clickEditProffesIcon();
			
			Thread.sleep(2000);
			
			PD.companyName();
			PD.currentJobRole();
			PD.Industry();
			//PD.linkedinProfile();
			PD.skills();
			//PD.clickupload();
			//PD.uploadResume();
			
			Thread.sleep(5000);
			PD.clickNext();
			
			PD.clickNextAgain();
			
			PD.saveButton();
		}
		catch(Exception e) {
			DriverScript.bValue = false;
			Reporter.log("Test case tc04 has failed");
			e.printStackTrace();
		}
	}

}
