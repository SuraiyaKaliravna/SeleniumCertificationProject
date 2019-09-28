package testCases;

import org.testng.Reporter;

import constantValues.TestData;
import mainScript.DriverScript;
import pages.Blogs;
import pages.MyCourse;
import pages.SignIn;
import utility.ActionKeyWords;

public class TC002 {

	SignIn SI = new SignIn();
	MyCourse MC = new MyCourse();
	ActionKeyWords AK = new ActionKeyWords();
	TestData TD = new TestData();
	Blogs BL = new Blogs();
	
	public void tc02() {
		try {
			AK.openBrowser(TD.browserName);
			AK.openURL(TD.openURL);
			
			SI.clickSignInLink();
			SI.enterUsername();
			SI.enterPassword();
			SI.clickSignInButton();
			
			MC.clickCommunityLink();
			MC.clickBlogLink();
			
			BL.cancelPopUp();
			BL.clickSoftwareTesting();
			AK.backWindow();
			BL.clickInterviewQuestion();
			AK.backWindow();
			AK.backWindow();
			
			MC.clickUserProfile();
			MC.clickLogOut();
			
			AK.closeWindow();
		}
		catch(Exception e) {
			DriverScript.bValue = false;
			Reporter.log("Test case tc02 has failed");
			e.printStackTrace();
		}
	}
}
