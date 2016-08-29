package com.erp.master;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Stockexe {

	public static void main(String[] args) throws IOException {
		
		Stocklib sl= new Stocklib();
		String result;
		
		result = sl.launch("http://webapp.qedgetech.com ");
		System.out.println(result);
		
		result = sl.adminlogin("admin", "master");
		System.out.println(result);
		
		/*result= sl.suppliercreation("spykar", "1-2-3ameerpet", "hyderabad","india", "harishankar", "1234567890","abcde@gmail.com", "9876543210", "all leading jeans");
		System.out.println(result);
		
		result =sl.stockcatagcreation("spykar trousers");
		System.out.println(result);*/
		
		File f= new File("C:\\Users\\hari.a\\Desktop\\uom.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet sh= wb.getSheetAt(0);
		int rc= sh.getLastRowNum();
		System.out.println(rc);
		for(int i=1;i<=rc;i++)
		{
			
			XSSFRow row= sh.getRow(i);
			XSSFCell wc= row.getCell(0);
			XSSFCell wc1 = row.getCell(1);
			XSSFCell wc2= row.createCell(2);
			
		 String uomid = wc.getStringCellValue();
		 String uomdis= wc1.getStringCellValue();
		 

		result= sl.uomcreation(uomid,uomdis);
	     wc2.setCellValue(result);
	
		
	}
		
		FileOutputStream fo= new FileOutputStream("C:\\Users\\hari.a\\Desktop\\uom_res.xlsx");
		
		wb.write(fo);
		wb.close();
		
		
	}
	

}

