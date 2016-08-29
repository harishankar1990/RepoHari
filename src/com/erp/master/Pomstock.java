package com.erp.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pomstock {
	
	@FindBy(id="btnreset")
	WebElement reset;
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement pasword;
	@FindBy(id="btnsubmit")
	WebElement submit;
	
	public void login(String uname,String pw)
	{
		reset.click();
		username.sendKeys(uname);
		pasword.sendKeys(pw);
		submit.click();
	}
	
	
	
	
	
	

}
