package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenCart_BaseClass {
	
	//hi macha
	
	public static WebDriver driver;

	public static void url(WebDriver driver,String s) {
		driver.get(s);
	}
	
	public static void maxi(WebDriver driver) {
	driver.manage().window().maximize();
	}
	
	public static void click (WebElement a) {
		a.click();
	}
	public static void scrolldown(WebDriver driver,WebElement web) {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", web);
		
	}
	public static void scrollup(WebDriver driver,WebElement web) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", web);

	}
	
	public static void snapshot(WebDriver driver, String picname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Arunkumar\\eclipse-workspace\\OpenCart_Web_Application\\SnapShot" + picname + ".png");
		FileUtils.copyFile(source, destination);
	}
	
	public static void user(WebElement a , String s) {
	a.sendKeys(s);
	}
	public static void movetoele(WebElement ele ,WebDriver driver) {
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}
	
	//DropDown_value
	
	public static void DropDown_value(WebElement a, String b) {
		Select s =new Select(a);
		s.selectByValue(b);
	}

	//DropDown_Visible
		
		public static void DropDown_visibletext(WebElement a, String b) {
			Select s= new Select(a);
			s.selectByVisibleText(b);	
		}
		
	//DropDown_index
		
		public static void DropDown_index(WebElement a, int i) {
			Select s=new Select(a);
			s.selectByIndex(i);
		}
	
}
