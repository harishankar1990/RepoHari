package com.erp.master;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Stockacc {
	
	Stocklib sl = new Stocklib();
	
	  @BeforeTest
	  public void login() throws IOException {
		  sl.adminlogin("admin", "master");
		  
	  }

	  @AfterTest
	  public void logout() {
		  sl.logout();
	  }

	  @BeforeSuite
	  public void launch() throws IOException {
		  sl.launch("http://webapp.qedgetech.com");
	  }

	  @AfterSuite
	  public void close() {
		  sl.appclose();
	  }

}
