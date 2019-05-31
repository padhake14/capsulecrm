package com.capsulecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsulecrm.base.TestBase;

public class CasePage extends TestBase {

	@FindBy(linkText = "Add Case")
	WebElement addCase;

	@FindBy(id = "partySearch")
	WebElement partySearch;

	@FindBy(xpath = "//div[@class=\"searchresult\"]/ul/li")
	WebElement selectUser;

	@FindBy(id = "caseNameDecorate:name")
	WebElement name;

	@FindBy(id = "caseDescriptionDecorate:description")
	WebElement description;

	@FindBy(id = "tagsDecorate:tagComboBox")
	WebElement tags;

	@FindBy(id = "tagsDecorate:j_id191")
	WebElement tagBtn;

	@FindBy(id = "save")
	WebElement saveBtn;

	@FindBy(xpath = "//div[@class=\"kase-summary ember-view\"]/child::div/div/span")
	WebElement status;

	public CasePage() {
		PageFactory.initElements(driver, this);
	}

	public void caseDetails(String PartyName, String Name, String Description, String Tags) {
		addCase.click();
		partySearch.sendKeys(PartyName);

		selectUser.click();
		name.sendKeys(Name);
		description.sendKeys(Description);
		tags.sendKeys(Tags);
		tagBtn.click();
		saveBtn.click();

	}

	public String verifyStatus() {
		return status.getText();
	}
}
