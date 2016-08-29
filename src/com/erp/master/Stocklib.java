package com.erp.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Stocklib {
	
	public static WebDriver driver;
	public static String expval , actval;
	public static Properties pro;
	public FileInputStream fis;
	
	public String launch(String url) throws IOException{
		pro=new Properties();
		fis = new FileInputStream("D:\\Hari\\ERP\\src\\com\\erp\\properties\\locators.properties");
		pro.load(fis);
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		expval= "Reset";
		actval = driver.findElement(By.id(pro.getProperty("reset"))).getText();
		
		if(expval.equalsIgnoreCase(actval))
		{
			return "launch sucess";
		}
		else{
			return "launch unsucess";	
		}
		
	}

	public String adminlogin(String username,String password) throws IOException
	
	{
	 driver.findElement(By.id(pro.getProperty("reset"))).click();
     
	 driver.findElement(By.id(pro.getProperty("username"))).sendKeys(username);
     driver.findElement(By.id(pro.getProperty("password"))).sendKeys(password);
     driver.findElement(By.id(pro.getProperty("login"))).click();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     String exp= "logout";
     String act = driver.findElement(By.id(pro.getProperty("logout"))).getText();
     
     if (exp.equalsIgnoreCase(act))
     {
     	return "login sucess";
     }
     else 
     {
   return "login unsucess";
     }
	
	}
	
	public String suppliercreation(String supname , String address,String city, String country, String contactperson,
			                        String phoneno,String email, String mobileno, String notes  ) throws IOException
	      
	       {
		  
		    driver.findElement(By.linkText(pro.getProperty("supplier"))).click();
		    
	        driver.findElement(By.xpath(pro.getProperty("supadd"))).click();
	        Sleeper.sleepTightInSeconds(5);
	        
	        driver.findElement(By.id(pro.getProperty("supname"))).sendKeys(supname);
	        driver.findElement(By.id(pro.getProperty("address"))).sendKeys(address);
	        driver.findElement(By.id(pro.getProperty("city"))).sendKeys(city);
	        driver.findElement(By.id(pro.getProperty("country"))).sendKeys(country);
	        driver.findElement(By.id(pro.getProperty("contactperson"))).sendKeys(contactperson);
	        driver.findElement(By.id(pro.getProperty("phonenumber"))).sendKeys(phoneno);
	        driver.findElement(By.id(pro.getProperty("email"))).sendKeys(email);
	        driver.findElement(By.id(pro.getProperty("mobilenum"))).sendKeys(mobileno);
	        driver.findElement(By.id(pro.getProperty("notes"))).sendKeys(notes);
	        driver.findElement(By.id(pro.getProperty("addbutton"))).click();
	        Sleeper.sleepTightInSeconds(2);
	        driver.findElement(By.xpath(pro.getProperty("confrmpopup"))).click();
	        Sleeper.sleepTightInSeconds(2);
	        driver.findElement(By.xpath(pro.getProperty("ok"))).click();
	        
	        expval= "Add succeeded";
	        actval= driver.findElement(By.xpath(pro.getProperty("actvalue"))).getText();
	        
	        if (expval.equalsIgnoreCase(actval))
	        {
	        	return "supplier created sucessfully";	
	        }
	        else
	        {
		      return "supplier creation failed";
	           }
	}
	
	
	public String stockcatagcreation(String catagname) throws IOException
	        {
		
	
		    Actions action = new Actions(driver);
	      

	        WebElement stockitem = driver.findElement(By.xpath(pro.getProperty("stockitemss")));
	        action.moveToElement(stockitem).build().perform();
	         
	        Sleeper.sleepTightInSeconds(3);
	        
	         driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/ul[1]/li[2]/ul/li[1]/a")).click();
	        
	        
	        Sleeper.sleepTightInSeconds(4);
	        
	        driver.findElement(By.xpath(pro.getProperty("stockcatgadd"))).click();
	        
	        driver.findElement(By.id(pro.getProperty("catname"))).sendKeys(catagname);
	        
	        driver.findElement(By.id(pro.getProperty("addsave"))).click();
	        
	        driver.findElement(By.xpath(pro.getProperty("conpp"))).click();
	        Sleeper.sleepTightInSeconds(2);
	        driver.findElement(By.xpath(pro.getProperty("okkk"))).click();
	        Sleeper.sleepTightInSeconds(2);
	        
	    
	        expval= "Add succeeded";
	        actval=driver.findElement(By.xpath(pro.getProperty("actuallval"))).getText();
	        
	   if (expval.equalsIgnoreCase(expval))		
	     {
		return "stock catagorie created";
	    }
	    else
	    {
		return"stock ctagorie creation failed";
	    }
	
	}
	
	public String uomcreation(String uomnum , String uomdescription){
		
		Actions action = new Actions(driver);
		  
		
            Sleeper.sleepTightInSeconds(5);
            WebElement stockitm = driver.findElement(By.xpath(pro.getProperty("stitem")));
            
	        action.moveToElement(stockitm).build().perform();
	        Sleeper.sleepTightInSeconds(5);
	        
	       driver.findElement(By.linkText("Unit of Measurement")).click();
	        
	 
	        driver.findElement(By.xpath(pro.getProperty("uomadd"))).click();
	        Sleeper.sleepTightInSeconds(2);
	        
	        driver.findElement(By.id(pro.getProperty("uomnum"))).sendKeys(uomnum);
	        driver.findElement(By.id(pro.getProperty("uomdiscrp"))).sendKeys(uomdescription);
	        driver.findElement(By.id(pro.getProperty("adduom"))).click();
	        Sleeper.sleepTightInSeconds(3);
	       
	        driver.findElement(By.xpath(pro.getProperty("cnfpopup"))).click();
	        Sleeper.sleepTightInSeconds(2);
	       
		
		expval= "Add succeeded";
		actval=driver.findElement(By.xpath(pro.getProperty("acvalue"))).getText();
		
		 driver.findElement(By.xpath(pro.getProperty("ok"))).click();
	        Sleeper.sleepTightInSeconds(2);
	        
		if(expval.equalsIgnoreCase(actval))
		{
			return "uom created sucessfully";
			
		}
		else{
			return "uom creation failed";
		}
		
	}
	
	public String stockitemcreation(String stkcatg,String supnum, String stockname , String uom,String purchesprz, String sellingprz,String notes )
	
	{
		driver.findElement(By.xpath(pro.getProperty("stockitem"))).click();
	    driver.findElement(By.xpath(pro.getProperty("stockitemadd"))).click();
	    
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       Sleeper.sleepTightInSeconds(2);
	       driver.findElement(By.id(pro.getProperty("stockcatg"))).sendKeys(stkcatg);
	       Sleeper.sleepTightInSeconds(2);
	       driver.findElement(By.id(pro.getProperty("supnum"))).sendKeys(supnum);
	       driver.findElement(By.id(pro.getProperty("stockname"))).sendKeys(stockname);
	       driver.findElement(By.id(pro.getProperty("uom"))).sendKeys(uom);
	       
	       driver.findElement(By.id(pro.getProperty("purchesprz"))).clear();
	       Sleeper.sleepTightInSeconds(2);
	       driver.findElement(By.id(pro.getProperty("purchesprz"))).sendKeys(purchesprz);
	       
	       driver.findElement(By.id(pro.getProperty("sellingprz"))).clear();
	       Sleeper.sleepTightInSeconds(2);
	       driver.findElement(By.id(pro.getProperty("sellingprz"))).sendKeys(sellingprz);
	       driver.findElement(By.id(pro.getProperty("notes"))).sendKeys(notes);
	       driver.findElement(By.id(pro.getProperty("addstockitem"))).click();
	       Sleeper.sleepTightInSeconds(2);
	       driver.findElement(By.xpath(pro.getProperty("cnf"))).click();
	       Sleeper.sleepTightInSeconds(2);
	       driver.findElement(By.xpath(pro.getProperty("okk"))).click();
	     
	        expval= "Add succeeded";
			actval=driver.findElement(By.xpath(pro.getProperty("act"))).getText();
			
			if(expval.equalsIgnoreCase(actval))
			{
				return "stockitem created sucessfully";
				
			}
			else{
				return "stockitem creation failed";
			}
		

		}
	

	
	public void logout(){
		
		driver.findElement(By.id("logout")).click();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).click();
		
		
	}
	
	public void appclose(){
		driver.close();
		
	}
	
	

	
}


