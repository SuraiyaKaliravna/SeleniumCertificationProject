package pages;

import constantValues.LocatorVariable;
import constantValues.TestData;
import utility.ActionKeyWords;

public class MyCourse {
	LocatorVariable LV = new LocatorVariable();
	ActionKeyWords AK = new ActionKeyWords();
	TestData TD = new TestData();
	
	public void clickAll() {
		AK.explicitWait(LV.AllLocatorValue_MyCourses);
		AK.mouseHoveringWithClick(LV.AllLocatorValue_MyCourses);
	}
	
	public void clickOngoing() {
		AK.mouseHoveringWithClick(LV.OngoingLocatorValue_MyCourses);
	}
	
	public void fetchOngoingCourse() {
		System.out.println("User is enrolled for the below course:");
		String value = AK.fetchValue(LV.OngoingCourseLocatorValue_MyCourse);
		System.out.println(value);
	}
	
	public void clickCommunityLink() {
		AK.explicitWait(LV.CommunityLocatorValue_MyCourses);
		AK.mouseHoveringWithClick(LV.CommunityLocatorValue_MyCourses);
	}
	
	public void clickBlogLink() {
		AK.mouseHoveringWithClick(LV.BlogLocatorValue_MyCourse);
	}
	
	public void clickUserProfile() {
		AK.explicitWait(LV.UserProfielLocValue_MyCourses);
		AK.mouseHoveringWithClick(LV.UserProfielLocValue_MyCourses);
	}
	
	public void clickMyProfile() {
		AK.mouseHoveringWithClick(LV.MyProfileLocatorValue_MyCourse);
	}
	
	public void clickMyWishlist() {
		AK.mouseHoveringWithClick(LV.MyWishlistLocatorValue_MyCourse);
	}
	
	public void clickCourse() {
		AK.explicitWait(LV.CoursesLocatorValue_MyCourse);
		AK.mouseHoveringWithClick(LV.CoursesLocatorValue_MyCourse);
	}
	
	public void clickAllCourses() {
		AK.mouseHoveringWithClick(LV.AllCoursesLocatorValue_MyCourse);
	}
	
	public void clickLogOut() {
		AK.mouseHoveringWithClick(LV.LogoutLocatorValue_MyCourses);
	}
}
