package com.capsulecrm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsulecrm.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "login:usernameDecorate:username")
	WebElement username;

	@FindBy(id = "login:passwordDecorate:password")
	WebElement password;

	@FindBy(id = "login:login")
	WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);

		return new HomePage();

	}
}