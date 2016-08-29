package com.erp.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Basicscript {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://webapp.qedgetech.com/login.php");
		driver.manage().window().maximize();
		
		String expval= "Reset";
		String actval = driver.findElement(By.id("btnreset")).getText();
		if(expval.equalsIgnoreCase(actval))
		{
			System.out.println("launch sucess");
		}
		else{
			System.out.println("launch failed ");
				
		}
       
		driver.findElement(By.id("btnreset")).click();
	       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
       
		driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("master");
        driver.findElement(By.id("btnsubmit")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        
        String exp= "logout";
        String act = driver.findElement(By.id("logout")).getText();
        if (exp.equalsIgnoreCase(act)){
        	
        	System.out.println("login sucessed");
        }
        else {
        	System.out.println("login failed");
        }
       
       
        driver.findElement(By.linkText("Suppliers")).click();
        driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
        Sleeper.sleepTightInSeconds(5);
        
        driver.findElement(By.id("x_Supplier_Name")).sendKeys("Samsung");
        driver.findElement(By.id("x_Address")).sendKeys("1-2-3,ameerpet");
        driver.findElement(By.id("x_City")).sendKeys("hyderabad");
        driver.findElement(By.id("x_Country")).sendKeys("India");
        driver.findElement(By.id("x_Contact_Person")).sendKeys("Hari shankar");
        driver.findElement(By.id("x_Phone_Number")).sendKeys("9849032919");
        driver.findElement(By.id("x__Email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.id("x_Mobile_Number")).sendKeys("9848022338");
        driver.findElement(By.id("x_Notes")).sendKeys("All Samsung mobiles ");
        driver.findElement(By.id("btnAction")).click();
        Sleeper.sleepTightInSeconds(2);
        driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
        Sleeper.sleepTightInSeconds(2);
        driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
        
        
        Actions action = new Actions(driver);
        
        WebElement stockitem = driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"));
        action.moveToElement(stockitem).click().build().perform();
        
        WebElement stockcatagorie = driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a"));
        action.moveToElement(stockcatagorie).click().build().perform();
        Sleeper.sleepTightInSeconds(2);
        
        driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
        
        driver.findElement(By.id("x_Category_Name")).sendKeys("samsung tabs and smartphones ");
        driver.findElement(By.id("btnAction")).click();
        
        driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
        Sleeper.sleepTightInSeconds(2);
        driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
        Sleeper.sleepTightInSeconds(2);
        
        WebElement stockitems = driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"));
        action.moveToElement(stockitems).click().build().perform();
        
        
        WebElement uom = driver.findElement(By.linkText("Unit of Measurement"));
        action.moveToElement(uom).click().build().perform();
 
        driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
        Sleeper.sleepTightInSeconds(2);
        
        driver.findElement(By.id("x_UOM_ID")).sendKeys("12345");
        driver.findElement(By.id("x_UOM_Description")).sendKeys("3080Mah battery");
        driver.findElement(By.id("btnAction")).click();
        Sleeper.sleepTightInSeconds(3);
       
        driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
        Sleeper.sleepTightInSeconds(2);
        driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
        Sleeper.sleepTightInSeconds(2);
        
    driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/ul[1]/li[2]/a")).click();
    driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
    
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       Sleeper.sleepTightInSeconds(2);
       driver.findElement(By.id("x_Category")).sendKeys("samsung tabs and smartphones");
       Sleeper.sleepTightInSeconds(2);
       driver.findElement(By.id("x_Supplier_Number")).sendKeys("samsung");
       driver.findElement(By.id("x_Stock_Name")).sendKeys("samsungs7 edge ");
       driver.findElement(By.id("x_Unit_Of_Measurement")).sendKeys("3080Mah battery");
       
       driver.findElement(By.id("x_Purchasing_Price")).clear();
       Sleeper.sleepTightInSeconds(2);
       driver.findElement(By.id("x_Purchasing_Price")).sendKeys("50000");
       
       driver.findElement(By.id("x_Selling_Price")).clear();
       Sleeper.sleepTightInSeconds(2);
       driver.findElement(By.id("x_Selling_Price")).sendKeys("60000");
       driver.findElement(By.id("x_Notes")).sendKeys("water resistence mobile");
       driver.findElement(By.id("btnAction")).click();
       Sleeper.sleepTightInSeconds(2);
       driver.findElement(By.className("ajs-button btn btn-primary")).click();
       Sleeper.sleepTightInSeconds(2);
       driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
     
	
	}
        
	
       

		
		
		
	}


