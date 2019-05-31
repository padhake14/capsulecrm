package com.capsulecrm.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capsulecrm.base.TestBase;
import com.capsulecrm.pages.AccountSettingPage;
import com.capsulecrm.pages.HomePage;
import com.capsulecrm.pages.LoginPage;
import com.capsulecrm.util.TestUtil;

public class AccountSettingTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	AccountSettingPage accountSettingPage;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		accountSettingPage = new AccountSettingPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		accountSettingPage = homePage.clickOnAccountName();
	}

// verify Account, invoices,export,appearance, mail drop box,custom filed and trash header

	@Test(priority = 1)
	public void verifyAccountStatementDetails() {
		Assert.assertEquals(accountSettingPage.accountHeader(), prop.getProperty("account"));
		Assert.assertEquals(accountSettingPage.invoiceHeader(), prop.getProperty("invoices"));
		Assert.assertEquals(accountSettingPage.exportHeader(), prop.getProperty("export"));
		Assert.assertEquals(accountSettingPage.appearanceHeader(), prop.getProperty("appearance"));
		Assert.assertEquals(accountSettingPage.mailDropBoxHeader(), prop.getProperty("mailDropBox"));
		Assert.assertEquals(accountSettingPage.customFieldsHeader(), prop.getProperty("customFields"));
		Assert.assertEquals(accountSettingPage.trashHeader(), prop.getProperty("trash"));
	}

// add user and verify
	@DataProvider
	public Object[][] getUserTestData() {
		Object data[][] = TestUtil.getTestData("Users");
		return data;
	}

	@Test(priority = 2, dataProvider = "getUserTestData")
	public void verifyUserstDetails(String FirstName, String LastName, String Email, String UserName) {

		accountSettingPage.usersDetails(FirstName, LastName, Email, UserName);
		String s = driver.findElement(By.xpath("//h2[@class='settings-page-header']")).getText();
		Assert.assertEquals(s, "Users");
		String actualUserName = driver.findElement(By.xpath("//td[contains(text(),'" + UserName + "')]")).getText();
		Assert.assertEquals(actualUserName, UserName);
	}

// add new milestone and verify
	@DataProvider
	public Object[][] getOpportunitiesTestData() {
		Object data[][] = TestUtil.getTestData("Opportunities");
		return data;
	}

	@Test(priority = 3, dataProvider = "getOpportunitiesTestData")
	public void verifyOpportunitiesDetails(String Name, String Description, String Wining, String Days) {
		accountSettingPage.opportunitiesDetails(Name, Description, Wining, Days);
		String header = driver.findElement(By.xpath("//header[@class='page-box-header']")).getText();
		Assert.assertEquals(header, "Opportunities");
		String actualElement = driver
				.findElement(By.xpath("//tr[@class=\"milestone-item\"]/td//button[text()='" + Name + "']")).getText();

		Assert.assertEquals(actualElement, Name);
	}

// add new track and verify
	@DataProvider
	public Object[][] getTracksTestData() {
		Object data[][] = TestUtil.getTestData("Tracks");
		return data;
	}

	@Test(priority = 4, dataProvider = "getTracksTestData")
	public void verifyTracksDetails(String Name, String Tags, String Description) {
		accountSettingPage.tracksDetails(Name, Tags, Description);

		String TracksHeader = driver.findElement(By.xpath("//h2[@class='settings-page-header']")).getText();

		Assert.assertEquals(TracksHeader, "Tracks");

		String actualElement = driver.findElement(By.xpath("//table/tbody//tr//td/a[contains(text(),'" + Name + "')]"))
				.getText();

		Assert.assertEquals(actualElement, Name);
	}

// add task category and verify
	@DataProvider
	public Object[][] getTaskCategoriesTestData() {
		Object data[][] = TestUtil.getTestData("TaskCategories");
		return data;
	}

	@Test(priority = 5, dataProvider = "getTaskCategoriesTestData")
	public void verifyTaskCategoriesDetails(String Name) {
		accountSettingPage.taskCategories(Name);

		String taskCategoriesHeader = driver.findElement(By.xpath("//h2[@class='settings-page-header']")).getText();
		Assert.assertEquals(taskCategoriesHeader, "Task Categories");
		String nameOnWebPage = driver
				.findElement(By.xpath("//td[@class=\" list-column-left\"]//a[contains(text(),'" + Name + "')]"))
				.getText();

		Assert.assertEquals(nameOnWebPage, Name);
	}

// add tags and verify
	@DataProvider
	public Object[][] getTagTestData() {
		Object data[][] = TestUtil.getTestData("Tag");
		return data;
	}

	@Test(priority = 6, dataProvider = "getTagTestData")
	public void verifyTagDetails(String Name) {
		accountSettingPage.tagsDetails(Name);
		String tagsHeader = driver.findElement(By.xpath("//h2[@class='settings-page-header']")).getText();
		Assert.assertEquals(tagsHeader, "Tags and DataTags");
		String nameOnWebPage = driver
				.findElement(By.xpath("//td[@class=\"list-column-left\"]//a[contains(text(),'" + Name + "')]"))
				.getText();

		Assert.assertEquals(nameOnWebPage, Name);
	}

//  configure button count and print on console 
	@Test(priority = 7)
	public void verifyIntegrationsDetails() {
		accountSettingPage.integrationsDetails();
		String integrationsHeader = driver.findElement(By.xpath("//h2[@class='settings-page-header']")).getText();
		Assert.assertEquals(integrationsHeader, "Integrations");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
