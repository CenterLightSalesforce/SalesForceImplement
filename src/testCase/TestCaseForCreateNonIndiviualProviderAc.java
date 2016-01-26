package testCase;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import pageObject.CreateNonIndividualProvider;
import pageObject.NavigateToOtherPage;
import utilities.AllMethod;
import utilities.ScreenShot;
import utilities.StartUp;

public class TestCaseForCreateNonIndiviualProviderAc extends StartUp{

	@Test(priority = 0)
	public void validLoginForNewAcCreate() throws InterruptedException {
		
		 NavigateToOtherPage pageNavi=new NavigateToOtherPage(driver);
		extent.startTest("TC04.1 Individual Provider New Account Create Verify", "Valid Login");
		AllMethod.validLogin();
			
		pageNavi.navigateToAccountCreatePage("Non-Individual Provider");
		Thread.sleep(3000);
		extent.log(LogStatus.PASS, "Open Non Individual Provider New Account Create Page",
				"View details below:",
				ScreenShot.captureScreen(driver, "Open Non Indiviual provider New Account Create window "+timeStamp ));
		extent.endTest();

	}
	
	@Test(priority = 1)
	public void blankSubmit() throws InterruptedException{
		
		CreateNonIndividualProvider nonIndiPro=new CreateNonIndividualProvider(driver);
		extent.startTest("TC04.2", "Blank Submission.Looking Appropriate Error Message ");
		nonIndiPro.clickSaveButton();
		Thread.sleep(2000);
		if(nonIndiPro.errorMsg()){
			extent.log(LogStatus.PASS, "Appropriate Error Message for Blank Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, " Non Indiviual provider Appropriate Error Message Blank Submission "+timeStamp));
			
		}else{
			extent.log(LogStatus.FAIL, "Appropriate Error Message for Blank Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, " Non Indiviual provider Appropriate Error Message on Blank Submission "+timeStamp));
		}
				
		extent.endTest();
		AllMethod.logOut();
		
			}
/*	@Test(priority = 2)
	public void lastNameVerify() throws Exception{
		CreateNonIndividualProvider indiPro=new CreateNonIndividualProvider(driver);
		extent.startTest("TC04.3", "Last Name Verify.Looking Appropriate Error Message ");
		
		indiPro.clickSaveButton();
		if(indiPro.errorMsg()){
			extent.log(LogStatus.PASS, "Appropriate Error Message for Blank Last Name Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, "Non Indiviual provider  Appropriate Error Message for Last Name Verify "+timeStamp));
			
		}else{
			extent.log(LogStatus.FAIL, "Appropriate Error Message for Blank Last Name Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, "Non Indiviual provider Appropriate Error Message for Last Name Verify "+timeStamp));
		}
				
		extent.endTest();
		
	}
	
	
	@Test(priority = 3)
	public void EmailVerify() throws Exception{
		CreateNonIndividualProvider indiPro=new CreateNonIndividualProvider(driver);
		extent.startTest("TC04.4", "Valid Email Verify.Looking Appropriate Error Message ");
	
		indiPro.enterEmail("testyahoo.com");
		indiPro.clickSaveButton();
		if(indiPro.errorMsg()){
			extent.log(LogStatus.PASS, "Appropriate Error Message for invalid Email Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, "Non Indiviual provider Appropriate Error Message for invalid Email Verify "+timeStamp));
			
		}else{
			extent.log(LogStatus.FAIL, "Appropriate Error Message for invalid Email Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, "Non Indiviual provider Appropriate Error Message for invalid Email Verify "+timeStamp ));
		}
				
		extent.endTest();
		
	}
	
	
	@Test(priority = 4)
	public void createANewAcc() throws Exception{
		CreateNonIndividualProvider indiPro=new CreateNonIndividualProvider(driver);
		extent.startTest("TC04.5", "Valid Email Verify.Looking Appropriate Error Message ");
		
		indiPro.enterEmail("test@yahoo.com");
		indiPro.clickSaveButton();
		if(indiPro.errorMsg()){
			extent.log(LogStatus.PASS, "Appropriate Error Message for invalid Email Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, "Non Indiviual provider Appropriate Error Message for invalid Email Verify "+timeStamp));
			
		}else{
			extent.log(LogStatus.FAIL, "Appropriate Error Message for invalid Email Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, "Non Indiviual provider Appropriate Error Message for invalid Email Verify "+timeStamp));
		}
				
		extent.endTest();
		
	}
	
	
	*/
	
	
}
