package pages;

import constantValues.LocatorVariable;
import constantValues.TestData;
import utility.ActionKeyWords;

public class MyWishlist {
	LocatorVariable LV = new LocatorVariable();
	ActionKeyWords AK = new ActionKeyWords();
	TestData TD = new TestData();
	
	public void validateForSelectedCourse() {
		 AK.isDisplayed(LV.SeleniumLocatorValue_MyWishList);
	}
	
	public void clickUserProfile() {
		AK.mouseHoveringWithClick(LV.UserProfielLocValue_MyCourses);
	}
	
	public void clickMyWishlist() {
		AK.mouseHoveringWithClick(LV.MyWishlistLocatorValue_MyCourse);
	}
	

}

