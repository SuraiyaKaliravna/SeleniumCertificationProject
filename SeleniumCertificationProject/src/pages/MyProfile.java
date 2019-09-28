package pages;

import constantValues.LocatorVariable;
import utility.ActionKeyWords;

public class MyProfile {

	LocatorVariable LV = new LocatorVariable();
	ActionKeyWords AK = new ActionKeyWords();
	
	public void clickEditProffesIcon() {
		AK.handlingClick(LV.ProfessEditIconLocatorValue_MyProfile);
	}
	
}
