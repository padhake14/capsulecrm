package com.capsulecrm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capsulecrm.base.TestBase;

public class AccountSettingPage extends TestBase {

	@FindBy(linkText = "Account")
	WebElement account;

	@FindBy(xpath = "//h1[@class='settings-page-header']")
	WebElement accountHeader;

	@FindBy(linkText = "Invoices")
	WebElement invoices;

	@FindBy(xpath = "//header[@class='page-box-header']")
	WebElement invoiceHeader;

	@FindBy(linkText = "Export")
	WebElement export;

	@FindBy(xpath = "//h1[@class='settings-page-header']")
	WebElement exportHeader;

	@FindBy(linkText = "Appearance")
	WebElement appearance;

	@FindBy(xpath = "//h1[@class='settings-page-header']")
	WebElement appearanceHeader;

	@FindBy(linkText = "Mail Drop Box")
	WebElement mailDropBox;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement mailDropBoxHeader;

	@FindBy(xpath = "//a[@href=\"/settings/users\"]")
	WebElement users;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement usersHeader;

	@FindBy(xpath = "//a[@class='action btn-primary btn-primary-clear']")
	WebElement addNewUser;

	@FindBy(id = "register:firstnameDecorate:firstName")
	WebElement userFirstName;

	@FindBy(id = "register:lastNameDecorate:lastName")
	WebElement userLastName;

	@FindBy(id = "register:emailDecorate:email")
	WebElement userEmail;

	@FindBy(id = "register:usernameDecorate:username")
	WebElement userUserName;

	@FindBy(id = "register:save")
	WebElement inviteUser;

	@FindBy(xpath = "(//a[contains(text(),'Opportunities')])[2]")
	WebElement opportunities;

	@FindBy(xpath = "//header[@class='page-box-header']")
	WebElement opportunitiesHeader;

	@FindBy(xpath = "//button[@class='btn-primary']")
	WebElement addNewMileStone;

	@FindBy(xpath = "//input[@class='form-input-text milestone-modal-name']")
	WebElement oppName;

	@FindBy(xpath = "//textarea[@class='form-input-text milestone-modal-description']")
	WebElement oppDesc;

	@FindBy(xpath = "//input[@class='form-input-text milestone-modal-probability']")
	WebElement oppWining;

	@FindBy(xpath = "//input[@class='form-input-text milestone-modal-days-until-stale']")
	WebElement oppDays;

	@FindBy(xpath = "//button[@class=\"async-button ember-view btn-primary\"]")
	WebElement oppSaveBtn;

	@FindBy(linkText = "Tracks")
	WebElement tracks;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement tracksHeader;

	@FindBy(xpath = "//a[@class='action btn-primary btn-primary-clear']")
	WebElement addNewTask;

	@FindBy(xpath = "(//span[@class=\"input \"]/input)[1]")
	WebElement trackName;

	@FindBy(xpath = "(//span[@class=\"input \"]/input)[2]")
	WebElement trackTag;

	@FindBy(partialLinkText = "Add Ta")
	WebElement trackAddTask;

	@FindBy(xpath = "(//span[@class=\"input \"]/input)[3]")
	WebElement trackTaskDesc;

	@FindBy(xpath = "(//span[@class=\"input \"]/input)[4]")
	WebElement trackDue;

	@FindBy(xpath = "//a[@class='btn-primary btn-clear singlesubmit']")
	WebElement trackSave;

	@FindBy(linkText = "Task Categories")
	WebElement taskCategories;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement taskCategoriesHeader;

	@FindBy(linkText = "Add new Category")
	WebElement addNewCatBtn;

	@FindBy(xpath = "//input[@id='editCategoryForm:taskCategoryNameDecorate:taskCategoryName']")
	WebElement taskCatName;

	@FindBy(xpath = "//input[@value=\"Save\"]")
	WebElement taskCatSaveBtn;

	@FindBy(linkText = "Custom Fields")
	WebElement customFields;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement customFieldsHeader;

	@FindBy(linkText = "Tags")
	WebElement tags;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement tagsHeader;

	@FindBy(linkText = "Add new Tag")
	WebElement tagAddNewTag;

	@FindBy(id = "j_id177:tagNameDecorate:tagName")
	WebElement tagName;

	@FindBy(xpath = "//input[@value=\"Save\"]")
	WebElement saveTagBtn;

	@FindBy(linkText = "Integrations")
	WebElement integrations;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement integrationsHeader;

	@FindBy(xpath = "//table[@class=\"recordList\"]/tbody/tr/td/a")
	List<WebElement> ConfigureBtn;

	@FindBy(linkText = "Trash")
	WebElement trash;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement trashHeader;

	public AccountSettingPage() {
		PageFactory.initElements(driver, this);
	}

	public String accountHeader() {
		account.click();
		return accountHeader.getText();
	}

	public String invoiceHeader() {
		invoices.click();
		return invoiceHeader.getText();
	}

	public String exportHeader() {
		export.click();
		return exportHeader.getText();
	}

	public String appearanceHeader() {
		appearance.click();
		return appearanceHeader.getText();
	}

	public String mailDropBoxHeader() {
		mailDropBox.click();
		return mailDropBoxHeader.getText();
	}

	public String customFieldsHeader() {
		customFields.click();
		return customFieldsHeader.getText();
	}

	public String trashHeader() {
		trash.click();
		return trashHeader.getText();
	}

	public void usersDetails(String FirstName, String LastName, String Email, String UserName) {
		users.click();
		addNewUser.click();
		userFirstName.sendKeys(FirstName);
		userLastName.sendKeys(LastName);
		userEmail.sendKeys(Email);
		userUserName.sendKeys(UserName);
		inviteUser.click();
	}

	public void opportunitiesDetails(String Name, String Description, String Wining, String Days){
		opportunities.click();
		addNewMileStone.click();
		oppName.sendKeys(Name);
		oppDesc.sendKeys(Description);
		oppWining.sendKeys(Wining);
		oppDays.sendKeys(Days);
		oppSaveBtn.click();

	}

	public void tracksDetails(String Name, String Tags, String Description)  {
		tracks.click();
		addNewTask.click();
		trackName.sendKeys(Name);
		trackTag.sendKeys(Tags);
// trackAddTask.click();
		trackTaskDesc.sendKeys(Description);
		trackSave.click();

	}

	public void taskCategories(String Name) {
		taskCategories.click();

		addNewCatBtn.click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@id='editCategoryForm:taskCategoryNameDecorate:taskCategoryName']")));

		taskCatName.sendKeys(Name);
		taskCatSaveBtn.click();

	}

	public void tagsDetails(String Name) {
		tags.click();
		tagAddNewTag.click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id177:tagNameDecorate:tagName")));
		tagName.sendKeys(Name);
		saveTagBtn.click();

	}

	public void integrationsDetails() {
		integrations.click();

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//table[@class=\"recordList\"]/tbody/tr/td/a")));

		int ConfigureBtnCount = ConfigureBtn.size();
		System.out.println("Configure Btn Count:: " + ConfigureBtnCount);
	}

}