package com.Actitime.TestScript;

import java.io.IOException;



import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.GenericLibrary.ListenerImplementation;
import com.Actitime.ObjectRepository.HomePage;
import com.Actitime.ObjectRepository.TaskPage;
@Listeners(ListenerImplementation.class)
public class CreateCustomer extends BaseClass{
@Test
public void createCust() throws IOException {
	HomePage hp=new HomePage(driver);
	hp.getTasklink().click();
	
	TaskPage tp=new TaskPage(driver);
	tp.getAddnewbt().click();
	tp.getNewCus().click();
	FileLibrary f=new FileLibrary();
    String custname = f.readFromExcelFile("actitime", 1, 2);
    tp.getCustname().sendKeys(custname);
    String custdes = f.readFromExcelFile("actitime", 2, 1);
    
    //Assert.fail();
    tp.getCustdes().sendKeys(custdes);
    tp.getCretebt().click();
	
}

}
