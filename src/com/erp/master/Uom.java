package com.erp.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Uom extends Stockacc {
	
	@Test(priority = 1 , dataProvider ="uomdata")
	public void uomcreataion(String uomid , String uomdes)
	{
		sl.uomcreation(uomid,uomdes);
		
	}
	
	@DataProvider
	
	public Object[][] uomdata(){
		
		Object [][] uom = new Object[4][2];
		
		uom[0][0]="9876";
		uom[0][1]="manual";
		
		
		uom[1][0]="98765";
		uom[1][1]="manual1";
		
		uom[2][0]="98764";
		uom[2][1]="manual2";
		
		uom[3][0]="98763";
		uom[3][1]="manual3";
		return uom;
	}
	

}
