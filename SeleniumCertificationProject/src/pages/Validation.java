package pages;

import constantValues.LocatorVariable;
import constantValues.TestData;
import utility.ActionKeyWords;

public class Validation {
	LocatorVariable LV = new LocatorVariable();
	ActionKeyWords AK = new ActionKeyWords();
	TestData TD = new TestData();
	
	public boolean validateCompanyName() {
		String companyValue = AK.fetchValue(LV.ComapnyNameLocValue_MyProfile);
		if(companyValue.equalsIgnoreCase(TD.CompanyName)) {
			return true;
		}
		return false;
	}
	
	public boolean validateCurrentRole() {
		String curentRoleValue = AK.fetchValue(LV.CurrentRoleLocValue_MyProfile);
		if(curentRoleValue.equalsIgnoreCase(TD.JobRole)) {
			return true;
		}
		return false;
	}
	
	public boolean validateCurrentIndustry() {
		String curentIndustryValue = AK.fetchValue(LV.CurrentIndustryLocValue_MyProfile);
		if(curentIndustryValue.equalsIgnoreCase(TD.Industry)) {
			return true;
		}
		return false;
	}
	
	
}
