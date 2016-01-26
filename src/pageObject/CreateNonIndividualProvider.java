package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.AllMethod;

public class CreateNonIndividualProvider {
	
	public WebDriver driver;
	private By newNIAccountLabel = By.xpath(".//*[@id='ep']/div[2]/div[3]/table/tbody/tr[1]/td[4]");
	private By saveButton = By.xpath(".//*[@id='topButtonRow']/input[1]");
	private By saveAndNewButton = By.xpath(".//*[@id='topButtonRow']/input[2]");
	private By canCelButton = By.xpath(".//*[@id='topButtonRow']/input[3]");
	private By accNameTxtbox = By.id("acc2");
	
	private By qNXTProviderTypeTxtbox = By.id("CF00NF000000ColUE");
	private By memBerIDTextbox = By.id("00NF000000D2YFo");
	private By addLine1Txtbox = By.id("00NF000000ColUU");
	private By addLine2Txtbox = By.id("00NF000000ColUV");
	private By cityTxtbox = By.id("00NF000000ColUR");
	private By countyTxtbox = By.id("00NF000000D1gzA");
	private By stateListbox = By.id("00NF000000ColUX");
	private By zipTxtbox = By.id("00NF000000ColUZ");
	private By phoneTxtbox = By.id("acc10");
	private By faxTxtbox = By.id("acc11");
	private By contactPre1Txtbox = By.id("00NF000000ColTo_unselected");
	private By contactPre2Txtbox = By.id("0NF000000ColTo_selected");
	private By contactNoPre1Txtbox = By.id("00NF000000ColTr_unselected");
	private By contactNoPre2Txtbox = By.id("00NF000000ColTr_selected");
	private By contactPreSeleArrow = By.id("00NF000000ColTo_right_arrow");
	private By contactPreDeSeleArrow = By.id("00NF000000ColTo_left_arrow");
	private By contactNoPreSeleArrow = By.id("00NF000000ColTr_right_arrow'");
	private By contactNoPreDeSeleArrow = By.id("00NF000000ColTr_left_arrow");
	private By nPITxtbox = By.id("00NF000000ColUr");
	private By uPINTxtbox = By.id("00NF000000ColUP");
	private By tINTxtbox = By.id("00NF000000ColUM");
	
	
	
	
	private By emailTxtbox = By.id("00NF000000ColTs");
	private By primarySpeCodeTxtbox = By.id("CF00NF000000ColUz");
	
	private By mMISTxtbox = By.id("00NF000000ColTy");
	private By licenseNumberTxtbox = By.id("00NF000000ColUk");
	private By hHSFlagCheckbox = By.id("00NF000000ColUs");
	private By officeofPMBFlagCheckbox = By.id("00NF000000ColUt");
	private By practiseSBAFlagCheckbox = By.id("00NF000000ColUy");
	private By centerlightLVDateTxtbox = By.id("00NF000000ColTn");
	private By enclarityLVDateTxtbox = By.id("00NF000000ColUh");
	
	private By priLanListbox = By.id("00NF000000ColUB");
	private By priDiaListbox = By.id("00NF000000ColUA");

	private By idvGroupKeyTxtbox = By.id("00NF000000ColUg");
	private By qNXTIdTxtbox = By.id("00NF000000D2YFp");
	private By contactTxtbox = By.id("CF00NF000000ColTp");
	private By parentTxtbox = By.id("acc3");
	private By errorMsg = By.xpath(".//*[@id='errorDiv_ep']");
	
	//This is Constructor
	public CreateNonIndividualProvider(WebDriver driver) {
			this.driver = driver;
	     }

	// For New Account Label
	public String getNewAccountLabel() {
		String getNewAccLabel = driver.findElement(newNIAccountLabel).getText();
		return getNewAccLabel;
	}

	// Click Save Button
	public void clickSaveButton() {
		driver.findElement(saveButton).click();
	}
	public boolean errorMsg() {
		boolean error;
		error=driver.findElement(errorMsg).isDisplayed();
		return error;
	}

	// Click Save Button
	public void clickSaveAndNewButton() {
		driver.findElement(saveAndNewButton).click();
	}

	// Click Save Button
	public void clickCancelButton() {
		driver.findElement(canCelButton).click();
	}

	// For Account Name Textbox
	public WebElement getAccName() {
		WebElement accNameTXt = driver.findElement(accNameTxtbox);
		return accNameTXt;
	}

	

	

	


	

	// For Enter QNXT Provider type
	public void enterQNXTProviderType(String qnxtPType) {
		driver.findElement(qNXTProviderTypeTxtbox).sendKeys(qnxtPType);
	}

	

	
	

	// For Choose Contact Preferences
	public void selectConPre(String conPre) {
		AllMethod.selectTextFromComboByVisibleTextUseBy(contactPre1Txtbox, conPre);
		driver.findElement(contactPreSeleArrow).click();
	}

	// For Choose Deselect Contact Preferences
	public void deSelectConPre(String deConPre) {
		AllMethod.selectTextFromComboByVisibleTextUseBy(contactPre2Txtbox, deConPre);
		driver.findElement(contactPreDeSeleArrow).click();
	}

	// For Choose No Contact Preferences
	public void selectNoConPre(String noConPre) {
		AllMethod.selectTextFromComboByVisibleTextUseBy(contactNoPre1Txtbox, noConPre);
		driver.findElement(contactNoPreSeleArrow).click();
	}

	// For Choose Deselect No Contact Preferences
	public void deSelectNoConPre(String noConPre) {
		AllMethod.selectTextFromComboByVisibleTextUseBy(contactNoPre2Txtbox, noConPre);
		driver.findElement(contactNoPreDeSeleArrow).click();
	}

	// For Enter Email
	public void enterEmail(String eMail) {
		driver.findElement(emailTxtbox).sendKeys(eMail);
	}

	// For Enter Phone Number
	public void enterPhone(String phone) {
		driver.findElement(memBerIDTextbox).sendKeys(phone);
	}

	// For Enter Primary specialty code
	public void enterPrimarySCode(String pSCode) {
		driver.findElement(primarySpeCodeTxtbox).sendKeys(pSCode);
	}

	// For Enter NPI
	public void enterNPI(String npi) {
		driver.findElement(nPITxtbox).sendKeys(npi);
	}

	// For Enter UPIN
	public void enterUPIN(String upin) {
		driver.findElement(uPINTxtbox).sendKeys(upin);
	}

	// For Enter TIN
	public void enterTIN(String tin) {
		driver.findElement(tINTxtbox).sendKeys(tin);
	}

	// For Enter MMIS
	public void enterMMIS(String mmis) {
		driver.findElement(mMISTxtbox).sendKeys(mmis);
	}

	// For Enter Lincense Number
	public void enterLincenseNumber(String lNumber) {
		driver.findElement(licenseNumberTxtbox).sendKeys(lNumber);
	}

	// For check HHS/OIG Board Action Indicator Flag
	public void checkHHSActionIFlag(String lFlag) {
		driver.findElement(hHSFlagCheckbox).sendKeys(lFlag);
	}

	// For check Office of Personnel Mngt Board Flag
	public void checkOfficeOfPMFlag(String mBFlag) {
		driver.findElement(officeofPMBFlagCheckbox).sendKeys(mBFlag);
	}

	// For check Practice State Board Action Flag
	public void practiceStateBAFlag(String aFlag) {
		driver.findElement(practiseSBAFlagCheckbox).sendKeys(aFlag);
	}

	// For Enter Centerlight Last Verified date
	public void enterCenterLightLVdate(String lVdate) {
		driver.findElement(centerlightLVDateTxtbox).sendKeys(lVdate);
	}

	// For Enter Enclarity Last Verified Date
	public void enterEnclarityVDate(String eLVDate) {
		driver.findElement(enclarityLVDateTxtbox).sendKeys(eLVDate);
	}

	// For Select Primary Language
	public void selectPrimaryLanguage(String language) {
		AllMethod.selectTextFromComboByVisibleTextUseBy(priLanListbox, language);
	}

	

	
	// For Select Primary Dialect
	public void selectPrimaryDialect(String dialect) {
		AllMethod.selectTextFromComboByVisibleTextUseBy(priDiaListbox, dialect);
	}

	

	// For Enter Idv Group ID
	public void enterIdvGroupID(String gID) {
		driver.findElement(idvGroupKeyTxtbox).sendKeys(gID);
	}

	// For Enter QNXT Id
	public void enterQNXTId(String qId) {
		driver.findElement(qNXTIdTxtbox).sendKeys(qId);
	}

	// For Enter Contact
	public void enterContact(String contact) {
		driver.findElement(contactTxtbox).sendKeys(contact);
	}

	// For Enter parent Account
	public void enterparentAccount(String pAccount) {
		driver.findElement(parentTxtbox).sendKeys(pAccount);
	}

	
	

}
