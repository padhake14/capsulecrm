package com.capsulecrm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capsulecrm.base.TestBase;
import com.capsulecrm.pages.HomePage;
import com.capsulecrm.pages.LoginPage;
import com.capsulecrm.pages.PersonPage;
import com.capsulecrm.util.TestUtil;

public class PersonTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	PersonPage personPage;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		personPage = new PersonPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		personPage = homePage.clickOnPersonIcon();
	}

	@DataProvider
	public Object[][] getUserTestData() {
		Object data[][] = TestUtil.getTestData("Person");
		return data;
	}

	// add new person
	@Test(dataProvider = "getUserTestData")
	public void verifyPersonDetails(String Title, String FirstName, String LastName, String Jobtitle,
			String orgnization, String Tags, String PhoneNum, String EmailAddr, String Website) {
		personPage.personDetails(Title, FirstName, LastName, Jobtitle, orgnization, Tags, PhoneNum, EmailAddr, Website);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}