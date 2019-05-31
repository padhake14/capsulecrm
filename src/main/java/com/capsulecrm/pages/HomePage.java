package com.capsulecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsulecrm.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(id = "ember18")
	WebElement personIcon;

	@FindBy(id = "ember24")
	WebElement caseIcon;

	@FindBy(xpath = "//div[@class=\"nav-bar-section nav-bar-account\"]/child::div")
	WebElement accountName;

	@FindBy(xpath = "//div[@class=\"nav-bar-section nav-bar-account\"]/child::div//div[2]/a[2]")
	WebElement accountsetting;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public PersonPage clickOnPersonIcon() {
		personIcon.click();
		return new PersonPage();
	}

	public CasePage clickOnCaseIcon() {
		caseIcon.click();
		return new CasePage();
	}

	public AccountSettingPage clickOnAccountName() {
		accountName.click();
		accountsetting.click();
		return new AccountSettingPage();
	}

}