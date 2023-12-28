package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
		@FindBy(id="username")
		private WebElement untxt;
		
		@FindBy(name="pwd")
		private WebElement pwtxt;
		
		@FindBy(xpath="//div[.='Login ']")
		private WebElement logt;
		
		//initilization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//utilization 
		public WebElement getUntxt() {
			return untxt;
		}

		public WebElement getPwtxt() {
			return pwtxt;
		}

		public WebElement getLogt() {
			return logt;
		}
	}
