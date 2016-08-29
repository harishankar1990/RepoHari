package com.erp.master;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Hello123 {
	public static WebDriver d;

	public static void main(String[] args) {
		 d= new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		d.navigate().to("http://webapp.qedgetech.com");
		d.manage().window().maximize();
	 d.findElement(By.id("username")).sendKeys("admin");
     d.findElement(By.id("password")).sendKeys("master");
     d.findElement(By.id("btnsubmit")).click();
     String exp="logout";
 String act= d.findElement(By.id("logout")).getText();
 if(exp.equalsIgnoreCase(act)){
	 System.out.println("login sucess"); 
 }
 else
 {
	 System.out.println("login failed");
 }
	}

	
	
	
}

