package com.erp.master;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Stkcatg extends Stockacc {
	Stocklib sl= new Stocklib();
	
	
	@Test(priority = 0 ,dataProvider = "stockcatg")
	public void stkcatgcreation(String catagname) throws IOException
	{
		sl.stockcatagcreation(catagname);
		
		
	}
	
	@DataProvider
	public Object[] stockcag(){
		Object [] stcatg = new Object[3];
		stcatg[0]= "hello1";
		stcatg[1]= "hello2";
		stcatg[2]= "hello3";
		
		return stcatg;
		
		
	}
	

}
