package pages;

//import org.openqa.selenium.Keys;

import constantValues.LocatorVariable;
import constantValues.TestData;
import utility.ActionKeyWords;

public class ProfessionalDetails {

	LocatorVariable LV = new LocatorVariable();
	ActionKeyWords AK = new ActionKeyWords();
	TestData TD = new TestData();
	
	public void companyName() {
		AK.clearText(LV.CompanyTextBarLocValue_ProfessionalDetails);
		AK.handlingTextBox(LV.CompanyTextBarLocValue_ProfessionalDetails, TD.CompanyName);
	}
	
	public void currentJobRole() {
		AK.handlingDropdowns(LV.CurrentJobRoleLocValue_ProfessionalDetails, TD.JobRole);
	}
	
	public void Industry() {
		AK.handlingDropdowns(LV.CurrentIndustryLocValue_ProfessionalDetails, TD.Industry);
	}
	
	public void linkedinProfile() {
		AK.explicitWait(LV.LinkedinProfileLocValue_ProfessionalDetails);
		AK.handlingTextBox(LV.LinkedinProfileLocValue_ProfessionalDetails, TD.LinkedinProfile);
	}
	
	public void skills() {
		AK.clearText(LV.SkillsLocValue_ProfessionalDetails);
		AK.handlingTextBox(LV.SkillsLocValue_ProfessionalDetails, TD.Skills);
	}
	
	public void clickupload() {
		AK.handlingClick(LV.UploadResumeLocVAlue_ProfessionalDetails);
	}
	
	public void uploadResume() throws Exception {
		AK.uploadFile(TD.resume);
	}
	
	public void clickNext() {
		
		AK.handlingClick(LV.NextButtonLocValue_ProfessionalDetails);
	}
	
	public void clickNextAgain() {
		AK.explicitWait(LV.NextButtonLocValue_CareerIntrest);
		AK.handlingClick(LV.NextButtonLocValue_CareerIntrest);
	}
	
	public void saveButton() {
		AK.explicitWait(LV.SaveButtonLocValue_OtherDetails);
		AK.handlingClick(LV.SaveButtonLocValue_OtherDetails);
	}
}
