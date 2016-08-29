package com.erp.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	
	@FindBy(linkText="Suppliers")
	WebElement sup;
	
	@FindBy (xpath="html/body/div[2]/div[3]/div/div/div[3]/div[1]/div[1]/div[1]/div/a/span")
	WebElement suppadd;

	public void suppler(){
		sup.click();
		suppadd.click();
	}
	
	@FindBy(linkText="Unit of Measurement")
	WebElement uom;
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")
	WebElement uadd;
	
	public void uom( ){
		uom.click();
		Sleeper.sleepTightInSeconds(5);
		uadd.click();
		
	}

}
