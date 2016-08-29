package com.erp.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class supplierdetails {
	
	@FindBy (id="x_Supplier_Name")
	WebElement supname;
	@FindBy (id="x_Address")
	WebElement addr;
	@FindBy (id="x_City")
	WebElement city;
	@FindBy (id="x_Country")
	WebElement country;
	@FindBy (id="x_Contact_Person")
	WebElement cntperson;
	@FindBy (id="x_Phone_Number")
	WebElement phno;
	@FindBy (id="x__Email")
    WebElement email;
	@FindBy (id="x_Mobile_Number")
	WebElement mobno;
	@FindBy (id="x_Notes")
	WebElement notes;
	@FindBy (id="btnAction")
	WebElement add;
	@FindBy(xpath="html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement confpop;
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button")
	WebElement alertpop;


public void supcreation(String suname,String address,String city,String country,String cntactperson,
		String phnum, String emai,String mbnum,String nts )
{
	supname.sendKeys(suname);
	addr.sendKeys(address);
	this.city.sendKeys(city);
	this.country.sendKeys(country);
	cntperson.sendKeys(cntactperson);
	phno.sendKeys(phnum);
	email.sendKeys(emai);
	mobno.sendKeys(mbnum);
	notes.sendKeys(nts);
	add.click();
	confpop.click();
	alertpop.click();
	
	
	
	
	
}

}