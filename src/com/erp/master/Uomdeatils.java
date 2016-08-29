package com.erp.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Uomdeatils {
	@FindBy (id="x_UOM_ID")
    WebElement uomid;
	@FindBy (id="x_UOM_Description")
	WebElement uomdis;
	@FindBy(id="btnAction")
	WebElement add;
	
	
	public void uomdet(String uid,String udis){
		uomid.sendKeys(uid);
		uomdis.sendKeys(udis);
		
	
		
	}
	
}
