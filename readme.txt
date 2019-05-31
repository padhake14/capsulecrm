# Page Object model Test automation framework using Selenium with Java, TestNG and Maven-
This is a sample project to demonstrate what is page object model framework and how it can used in selenium to automate any application.
TestNG is used as test framework.

Dependency
Java
Maven

###libraries used
Selenium
TestNG
log4j
Extent Reports

###### Working
Open browser
open https://padhake.capsulecrm.com/ website
Enter username and password and click on submit
click on person icon then click on Add Person Button and fill the form and click on submit 
click on Case icon then click on Add Case button, fill the form and click on save.
verify the status
click on account setting and verify
click on account and verify header
click on invoice and verify invoice header
click on Export and verify Export header
click on Appearance and verify Appearance header
click on Mail Drop Box and verify Mail Drop Box
click on User >Add new user and verify
click on Opportunities >Add new Milestone and verify
click on Tracks> Add new Track and verify
click on Task Categories> Add new Category and verify
click on custom filed verify custom header
click on tags >Add new tag and verify
click on Integrations, verify Integrations header
count configure button and print on Console
click on Trash and verify Trash header


##Projecct Structure
1.src/main/java:contains all main pakages and class
		com.capsulecrm.base; this package contains class file for browser launch and properirs file configuration
		com.capsulecrm.config; this package contains properirs file
		
	com.capsulecrm.page conatins all the pages
		LoginPage.java Contains all element related to loginPage and Methods to perform action on loginPage.
		HomePage.java this page appers after login Contains all element related to HomePage and Methods to perform action on homePage.
		CasePage.java LoginPage.java Contains all element related to casepage and Methods to perform action on casepage.
		personPage.java LoginPage.java Contains all element related to personPage and Methods to perform action on personPage.
		AccountSettingPage Contains all element related to personPage and Methods to perform action on personPage.

	com.capsulecrm.testdata contains excel file

	com.capsulecrm.utils conatins common utility and WebEventListner.java required listner

src/test/java conatins all the testcases and ExtentReport	
	com.capsulecrm.testcases
		com.capsulecrm.testcases it conatins testcases
		CaseTest.java add new case and verify
		personTest.java add new person and verify
		AccountSettingTest.java click on left side account setting link and verify
	com.capsulecrm.ExtentReport
		ExtentReport.java   this is useful to generate log 
		Extent report genterated in test-ouput folder>Report.html

src/main/resources 
	testng.xml
	Log4j.properties


