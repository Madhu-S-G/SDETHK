package com.healthkart.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class adminLoginPage {

	
	// declaration
		@FindBy(xpath="//a[@href='hms/admin']") private WebElement adminLoginclick;
		
		@FindBy(name="username") private WebElement usernameEdtTxt;
		
		@FindBys(@FindBy(name ="password")) private WebElement passwordEdtTxt;;
		
	@FindAll({@FindBy(name="submit"), @FindBy(xpath="//button[@type='submit']")}) private WebElement LoginBtnClk;

@FindBy(xpath="//span[@class='username']") private WebElement  un_btn;
	
	@FindBy(xpath="(//ul[@class='dropdown-menu dropdown-dark']/li)[last()]") private WebElement  logoutbtn;
	
		// intialization	
		public adminLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

	//accessing them using getters
		public WebElement getDoctorLoginclick() {
			return adminLoginclick;
		}
		
		public WebElement getUsernameEdtTxt() {
			return usernameEdtTxt;
		}

		public WebElement getPasswordEdtTxt() {
			return passwordEdtTxt;
		}

		public WebElement getLoginBtnClk() {
			return LoginBtnClk;
		}
		
		
		//Business libraries
			/**
			 * login to application with username and password and click on save btn
			 * @param username
			 * @param password
			 */
			public void loginAsAdmin(String username,String password)
			{   adminLoginclick.click();
				usernameEdtTxt.sendKeys(username);
				passwordEdtTxt.sendKeys(password);
				LoginBtnClk.click();
			}
			public void logoutAsAdmin()
			{   un_btn.click();
		     	logoutbtn.click();
			}
		
		
	}


