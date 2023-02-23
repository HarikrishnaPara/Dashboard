package com.mohs10.reuse;
	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;
import com.mohs10.or.ToolOR;

	public class ToolCFS {
		
		public Action aDriver;
		public WebDriver driver;
		
		public ToolCFS()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
	

		
		// Registration process
				public void Selecting() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Register in DemoWeb shop");
					aDriver.navigateToApplication("https://mohs10.io/");
										//Create a Select object
					Select dropdown = new Select(driver.findElement(By.id("menu-item-3017")));
			
					//Select an option from the drop-down
					dropdown.selectByVisibleText("Who we are");
					Thread.sleep(2000);
					//aDriver.click(ToolOR.Runall, "click on runALL");
				}
				

			
		
	}

