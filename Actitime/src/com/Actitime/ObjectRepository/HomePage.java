package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
		@FindBy(xpath="//div[.='Tasks']")
		private WebElement tasklink;
		
		@FindBy(xpath="//div[.='Reports']")
		private WebElement Reportlink;
		
		@FindBy(xpath="//div[.='logoutlink']")
		private WebElement logoutbt ;
		
		
		@FindBy(xpath="//div[.='Users']")
		private WebElement  Userlink;
		
		//initilization
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//utilization 

		public WebElement getTasklink() {
			return tasklink;
		}

		public WebElement getLogoutbt() {
			return logoutbt;
		}
		public WebElement getReportlink() {
			return Reportlink;
		}

		public WebElement getUserlink() {
			return Userlink;
		}

}
