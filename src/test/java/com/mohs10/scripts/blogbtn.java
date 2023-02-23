package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.ActionDriver.SSreuseclass;
import com.mohs10.ActionDriver.XLUtils;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class blogbtn extends StartBrowser{
		
		String excelfile = "C:\\Users\\91703\\eclipse-workspace\\pAInITe-master\\TestData\\Data.xlsx";
	    String excelsheet = "Sheet2";
	    
	@Test
	 public void BlogBtn() throws Exception {
		
				CommonFuns hm2 = new CommonFuns();
				
				
			            
			            hm2.logIn("harikrishnapara123@gmail.com", "DCA@123");
			            hm2.Blogbtn();
			            
			            hm2.logout();
			        
				
				
		}
	}
