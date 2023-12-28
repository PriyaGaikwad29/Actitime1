package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Actitime.ObjectRepository.HomePage;
import com.Actitime.ObjectRepository.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	FileLibrary f=new FileLibrary();
	@BeforeSuite
	public void connectDB(){
		Reporter.log("conneted to database",true);
		
	}
	@BeforeTest
	public void LaunchBrowser() throws IOException{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 String URL = f.readFromPropertyFile("url");
		driver.get(URL);
		
		Reporter.log("Lauched the browser",true);
	}
	@BeforeMethod
	public void Login() throws IOException{
		String un = f.readFromPropertyFile("username");
		String ps = f.readFromPropertyFile("password");
		LoginPage lp=new LoginPage(driver);
		lp.getUntxt().sendKeys(un);
		lp.getPwtxt().sendKeys(ps);
		lp.getLogt().click();
		Reporter.log("Logged in Successfully",true);
	}
	@AfterMethod
	public void Logout(){
		HomePage hp=new HomePage(driver);
		hp.getLogoutbt().click();
		Reporter.log("Logged out Successfully",true);
	}
	@AfterTest
	public void CloseBrowser(){
		driver.close();
		Reporter.log("Close the browser",true);
	}
	@AfterSuite
	public void DisconnectDB(){
		Reporter.log("Disconneted to database",true);
	}

}
