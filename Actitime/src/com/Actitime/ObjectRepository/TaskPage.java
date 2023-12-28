package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	//declaration
			@FindBy(xpath="//div[.='Add New']")
			private WebElement Addnewbt;
			
			@FindBy(xpath="//div[.='+ New Customer']")
			private WebElement NewCus;
			
			@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
			private WebElement custname;
			
			@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
			private WebElement custdes;
			
			@FindBy(xpath="//div[.='Create Customer']")
			private WebElement cretebt;
			
			
			@FindBy(xpath="//div[@class='greyButton cancelBtn']")
			private WebElement cancelbt;
			
			
			

			

			//initilization
			public TaskPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			public WebElement getAddnewbt() {
				return Addnewbt;
			}

			public WebElement getNewCus() {
				return NewCus;
			}
			public WebElement getCustname() {
				return custname;
			}

			public WebElement getCustdes() {
				return custdes;
			}
			public WebElement getCancelbt() {
				return cancelbt;
			}
			public WebElement getCretebt() {
				return cretebt;
			}
			
}
