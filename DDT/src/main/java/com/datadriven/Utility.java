package com.datadriven;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static String captureScreenShort(WebDriver driver, String name) {
try{
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	
	String dest="D:\\Reports\\"+name+".png";
	
	File destnation =new File(dest);
FileUtils.copyFile(srcfile,destnation);
	
return dest;
}catch(Exception e)
{
	System.out.println(e.getMessage());

		return e.getMessage();
	}


}}
