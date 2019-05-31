package com.capsulecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.capsulecrm.base.TestBase;

public class PersonPage extends TestBase {

	@FindBy(linkText = "Add Person")
	WebElement addPerson;

	@FindBy(xpath = "//select[@name='party:j_id108:j_id116']")
	WebElement selectTitle;

	@FindBy(id = "party:fnDecorate:fn")
	WebElement firstName;

	@FindBy(id = "party:lnDecorate:ln")
	WebElement lastName;

	@FindBy(id = "party:roleDecorate:jobTitle")
	WebElement jobTitle;

	@FindBy(id = "party:orgDecorate:org")
	WebElement org;

	@FindBy(id = "party:tagsDecorate:tagComboBox")
	WebElement tags;

	@FindBy(id = "party:tagsDecorate:j_id187")
	WebElement addTagsBtn;

	@FindBy(id = "party:j_id325:0:phnDecorate:number")
	WebElement phoneNum;

	@FindBy(id = "party:j_id342:0:emlDecorate:nmbr")
	WebElement emailaddr;

	@FindBy(id = "party:j_id370:0:webDecorate:web")
	WebElement website;

	@FindBy(id = "party:save")
	WebElement saveBtn;

	public PersonPage() {
		PageFactory.initElements(driver, this);
	}

	public void personDetails(String Title, String FirstName, String LastName, String Jobtitle, String orgnization,
			String Tags, String PhoneNum, String EmailAddr, String Website) {
		addPerson.click();

		Select sel = new Select(selectTitle);
		sel.selectByValue("Mr");
		firstName.sendKeys("test");
		lastName.sendKeys("test1");
		jobTitle.sendKeys("qa");
		org.sendKeys("test1");
		tags.sendKeys("test");
		addTagsBtn.click();
		phoneNum.sendKeys("1234567890");
		emailaddr.sendKeys("test@test.com");
		website.sendKeys("www.test.com");
		saveBtn.click();

	}

}