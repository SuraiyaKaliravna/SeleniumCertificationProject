package pages;

import constantValues.LocatorVariable;
import constantValues.TestData;
import utility.ActionKeyWords;

public class AllCourses {
	LocatorVariable LV = new LocatorVariable();
	ActionKeyWords AK = new ActionKeyWords();
	TestData TD = new TestData();
	
	public void addToWishlist() {
		AK.scrolling();
		AK.handlingClick(LV.WishlistLocatorValue_AllCourses);
	}
	
	public void clickUserProfile() {
		AK.mouseHoveringWithClick(LV.UserProfileLocatorValue_AllCourses);
	}
	
	public void clickMyWishlist() {
		AK.mouseHoveringWithClick(LV.MyWishlistLocatorValue_AllCourses);
	}
}
