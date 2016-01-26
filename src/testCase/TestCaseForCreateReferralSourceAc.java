package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;


import pageObject.CreateReferralSourceAccount;
import pageObject.NavigateToOtherPage;
import utilities.AllMethod;
import utilities.ScreenShot;
import utilities.StartUp;

public class TestCaseForCreateReferralSourceAc extends StartUp{
	
	@Test(priority = 0)
	public void validLoginForNewAcCreate() throws InterruptedException {
		
		NavigateToOtherPage pageNavi=new NavigateToOtherPage(driver);
		CreateReferralSourceAccount refSource=new CreateReferralSourceAccount(driver);
		extent.startTest("TC05.1 Verify New Account Create For Referral Source ", "Valid Login");
		AllMethod.validLogin();
		pageNavi.navigateToAccountCreatePage("Referral Source");
		
		Thread.sleep(3000);
		Assert.assertEquals("Referral Source",refSource.getNewAccountLabel());
		
		extent.log(LogStatus.PASS, "Open Referral Source New Account Create Page",
				"View details below:",
				ScreenShot.captureScreen(driver, "Open Referral Source New Account Create window "+timeStamp ));
		extent.endTest();

	}
	
	@Test(priority = 1)
	public void blankSubmit() throws InterruptedException{
		
		CreateReferralSourceAccount refSource=new CreateReferralSourceAccount(driver);
		extent.startTest("TC05.2", "Blank Submission.Looking Appropriate Error Message ");
		refSource.clickSaveButton();
		Thread.sleep(2000);
		if(refSource.errorMsg()){
			extent.log(LogStatus.PASS, "Appropriate Error Message for Blank Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, " Referral Source Appropriate Error Message Blank Submission "+timeStamp));
			
		}else{
			extent.log(LogStatus.FAIL, "Appropriate Error Message for Blank Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, " Referral Source Appropriate Error Message on Blank Submission "+timeStamp));
		}
				
		extent.endTest();
		
				}
	@Test(priority = 2)
	public void accNameVerify() throws Exception{
		CreateReferralSourceAccount refSource=new CreateReferralSourceAccount(driver);
		extent.startTest("TC05.3", "Account Name Verify.Looking Appropriate Error Message ");
		
		refSource.enterDataOnThePage("","Jahid","MD","M","3472847556","test@yahoo.com");
		refSource.clickSaveButton();
		Thread.sleep(2000);
		if(refSource.errorMsg()){
			extent.log(LogStatus.PASS, "Appropriate Error Message for Account Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, "Referral Source  Appropriate Error Message for Account Name Verify "+timeStamp));
			
		}else{
			extent.log(LogStatus.FAIL, "Appropriate Error Message for Blank Account Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, "Referral Source Appropriate Error Message for Account Verify "+timeStamp));
		}
				
		extent.endTest();
		
	}
	
	
	@Test(priority = 3)
	public void phoneNumberVerify() throws Exception{
		CreateReferralSourceAccount refSource=new CreateReferralSourceAccount(driver);
		refSource.clearAllData();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		extent.startTest("TC05.4", "Phone Number Verify.Looking Appropriate Error Message ");
		
		refSource.enterDataOnThePage("MD Jahid","Jahid","MD","M","347284","test@yahoo.com");
		refSource.clickSaveButton();
		Thread.sleep(2000);
		if(refSource.errorMsg()){
			extent.log(LogStatus.PASS, "Appropriate Error Message for unvalid phone Number Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, "Referral Source  Appropriate Error Message for  phone Number Verify "+timeStamp));
			
		}else{
			extent.log(LogStatus.FAIL, "Appropriate Error Message for unvalid phone Number Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, "Referral Source Appropriate Error Message for phone Number Verify "+timeStamp));
		}
				
		extent.endTest();
		
	}
	
	
	@Test(priority = 4)
	public void verifyEmail() throws Exception{
		CreateReferralSourceAccount refSource=new CreateReferralSourceAccount(driver);
		NavigateToOtherPage pageNavi=new NavigateToOtherPage(driver);
		pageNavi.navigateToAccountCreatePage("Referral Source");
		
		//refSource.clearAllData();
		//Thread.sleep(2000);
		extent.startTest("TC05.5", "Email Verify.Looking Appropriate Error Message ");
		
		refSource.enterDataOnThePage("Jesmin","Jibon","JJ","F","3471114556","testyahho.com");
		refSource.clickSaveButton();
		Thread.sleep(2000);
		if(refSource.errorMsg()){
			extent.log(LogStatus.PASS, "Appropriate Error Message for unvalid Email Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, "Referral Source  Appropriate Error Message for  Email Verify "+timeStamp));
			
		}else{
			extent.log(LogStatus.FAIL, "Appropriate Error Message for unvalid Email Submmision",
					"View details below:",
					ScreenShot.captureScreen(driver, "Referral Source Appropriate Error Message for Email Verify "+timeStamp));
		}
				
 		extent.endTest();
 		driver.close();
		
	}
	
	

	
	

}
