package com.capsulecrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capsulecrm.base.TestBase;
import com.capsulecrm.pages.CasePage;
import com.capsulecrm.pages.HomePage;
import com.capsulecrm.pages.LoginPage;
import com.capsulecrm.util.TestUtil;

public class CaseTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CasePage casePage;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		casePage = new CasePage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		casePage = homePage.clickOnCaseIcon();
	}

	@DataProvider
	public Object[][] getUserTestData() {
		Object data[][] = TestUtil.getTestData("Case");
		return data;
	}

	// add new case and verify status

	@Test(dataProvider = "getUserTestData")
	public void verifyPersonDetails(String PartyName, String Name, String Description, String Tags) {
		casePage.caseDetails(PartyName, Name, Description, Tags);

		Assert.assertEquals(casePage.verifyStatus(), "Open");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}