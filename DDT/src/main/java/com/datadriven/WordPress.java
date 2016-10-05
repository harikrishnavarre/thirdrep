 package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class WordPress  {
	WebDriver driver;
	
	ExtentReports reports;
	ExtentTest logger;

	@Test(dataProvider="wordpressData")
	public void LoginWordPass(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println(username);
		
		System.out.print(username);
		 driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		
		driver.quit();
		

	}
	@DataProvider(name="wordpressData")
	public Object[][] passData() throws Exception
	{

		ExcelDataconfig config=new ExcelDataconfig("D:\\Reports\\inputs.xlsx");
		int rows=config.getRowCount(0);
		Object[][] data=new Object[rows][2];
//System.out.println(rows);

		for(int i=0;i<rows;i++){
			data[i][0]=config.getData(0,i,0);

			data[i][1]=config.getData(0,i,1);
System.out.println(data[i][0]);
System.out.println(data[i][1]);
		}
		return data;
		
	}

		}