package pages;

import constantValues.LocatorVariable;
import constantValues.TestData;
import utility.ActionKeyWords;

public class Blogs {
	LocatorVariable LV = new LocatorVariable();
	ActionKeyWords AK = new ActionKeyWords();
	TestData TD = new TestData();
	
	public void cancelPopUp() {
		AK.handlingClick(LV.CancelPopUpLocatorValue_Blogs);
	}
	public void clickSoftwareTesting() {
		AK.scrolling();
		AK.handlingClick(LV.SoftwareTestingLoactorValue_Blogs);
	}
	
	public void clickInterviewQuestion() {
		AK.handlingClick(LV.InterviewQuestionLocatorValue_Blogs);
	}

}
