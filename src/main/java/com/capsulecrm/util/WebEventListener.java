package com.capsulecrm.util;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.capsulecrm.base.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener {

	public void beforeNavigateTo(String url, WebDriver driver) {
		log.info("Before navigating to: '" + url + "'");
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		log.info("Navigated to:'" + url + "'");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		log.info("Value of the:" + element.toString() + " before any changes made");
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		log.info("Element value changed to: " + element.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		log.info("Trying to click on: " + element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		log.info("Clicked on: " + element.toString());
	}

	public void beforeNavigateBack(WebDriver driver) {
		log.info("Navigating back to previous page");
	}

	public void afterNavigateBack(WebDriver driver) {
		log.info("Navigated back to previous page");
	}

	public void beforeNavigateForward(WebDriver driver) {
		log.info("Navigating forward to next page");
	}

	public void afterNavigateForward(WebDriver driver) {
		log.info("Navigated forward to next page");
	}

	public void onException(Throwable error, WebDriver driver) {
		log.info("Exception occured: " + error);
// try {
// TestUtil.takeScreenshotAtEndOfTest();
// } catch (IOException e) {
// e.printStackTrace();
// }
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		log.info("Trying to find Element By : " + by.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		log.info("Found Element By : " + by.toString());
	}

	/*
	 * non overridden methods of WebListener class
	 */
	public void beforeScript(String script, WebDriver driver) {
	}

	public void afterScript(String script, WebDriver driver) {
	}

	public void beforeAlertAccept(WebDriver driver) {
// TODO Auto-generated method stub

	}

	public void afterAlertAccept(WebDriver driver) {
// TODO Auto-generated method stub

	}

	public void afterAlertDismiss(WebDriver driver) {
// TODO Auto-generated method stub

	}

	public void beforeAlertDismiss(WebDriver driver) {
// TODO Auto-generated method stub

	}

	public void beforeNavigateRefresh(WebDriver driver) {
// TODO Auto-generated method stub

	}

	public void afterNavigateRefresh(WebDriver driver) {
// TODO Auto-generated method stub

	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
// TODO Auto-generated method stub

	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
// TODO Auto-generated method stub

	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
// TODO Auto-generated method stub

	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
// TODO Auto-generated method stub

	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
// TODO Auto-generated method stub

	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
// TODO Auto-generated method stub

	}

	public void beforeGetText(WebElement element, WebDriver driver) {
// TODO Auto-generated method stub

	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
// TODO Auto-generated method stub

	}
}
