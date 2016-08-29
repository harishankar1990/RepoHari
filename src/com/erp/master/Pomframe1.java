package com.erp.master;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pomframe1 {
	public WebDriver d;
	public String result;
	@Test
	public void supcreation() throws IOException
	{
		
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		d.navigate().to("http://webapp.qedgetech.com");
		Sleeper.sleepTightInSeconds(5);
		
		Pomstock ps= PageFactory.initElements(d, Pomstock.class);
		ps.login("admin", "master");
		
		Sleeper.sleepTightInSeconds(3);
		Homepage hp= PageFactory.initElements(d, Homepage.class);
		hp.suppler();
		
		Sleeper.sleepTightInSeconds(5);
		supplierdetails  sd= PageFactory.initElements(d, supplierdetails.class );
		//sd.supcreation("adhjadha", "asfasdas", "asaasda", "india", "asasreasda","134567888","abcd@gmail.com", "15469875", "adsfasfafasdasdasda");
		
		Actions act= new Actions(d);
		WebElement stockitem= d.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"));
	    act.moveToElement(stockitem).build().perform();
	   
	    Sleeper.sleepTightInSeconds(3);
	    File f= new File("C:\\Users\\hari.a\\Desktop\\uompom.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet sh= wb.getSheetAt(0);
		int rc= sh.getLastRowNum();
		System.out.println(rc);
		for(int i=1;i<=rc;i++)
		{
			 hp.uom();
			XSSFRow row= sh.getRow(i);
			XSSFCell wc= row.getCell(0);
			XSSFCell wc1 = row.getCell(1);
			XSSFCell wc2= row.createCell(2);
			
		 String uomid = wc.getStringCellValue();
		 String uomdis= wc1.getStringCellValue();
		 
	    
		 Uomdeatils ud= PageFactory.initElements(d, Uomdeatils.class );
		 ud.uomdet(uomid, uomdis);
		 

	    
	    d.findElement(By.id("btnAction")).click();
	    Sleeper.sleepTightInSeconds(5);
	    
	    
	   d.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]"));
	 
	   Sleeper.sleepTightInSeconds(5);
	    
	    
	   WebElement el = d.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button"));
	   if (el.isDisplayed()) {
			el.click();
		   }  
	   Sleeper.sleepTightInSeconds(5); 
	   
	}
		
		FileOutputStream fo= new FileOutputStream("C:\\Users\\hari.a\\Desktop\\uom_res.xlsx");
		
		wb.write(fo);
		wb.close();
		
		
	}
	 
	

}
