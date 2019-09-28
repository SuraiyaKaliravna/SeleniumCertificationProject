package testCases;

import org.testng.Reporter;

import constantValues.TestData;
import mainScript.DriverScript;
import pages.AllCourses;
import pages.MyCourse;
import pages.MyWishlist;
import pages.SignIn;
import utility.ActionKeyWords;

public class TC003 {
	SignIn SI = new SignIn();
	MyCourse MC = new MyCourse();
	ActionKeyWords AK = new ActionKeyWords();
	TestData TD = new TestData();
	AllCourses AC = new AllCourses();
	MyWishlist MW = new MyWishlist();
	
	public void tc03() {
		try {
			AK.openBrowser(TD.browserName);
			AK.openURL(TD.openURL);
			
			SI.clickSignInLink();
			SI.enterUsername();
			SI.enterPassword();
			SI.clickSignInButton();
			
			MC.clickCourse();
			MC.clickAllCourses();
			
			AC.addToWishlist();
			AC.clickUserProfile();
			AC.clickMyWishlist();
			
			MW.validateForSelectedCourse();
			
			//AK.closeWindow();
		}
		catch(Exception e) {
			DriverScript.bValue = false;
			Reporter.log("Test case tc03 has failed");
			e.printStackTrace();
		}
	}
}
