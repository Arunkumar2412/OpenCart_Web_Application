package org.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\FeatureFile\\OpenCart.feature",glue="org.Setp_Defination")


public class OpenCart_RunnerClass {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void start() {
	
		ChromeOptions z=new ChromeOptions();
		z.addArguments ("--remote-allow-origins=*");
		driver = new ChromeDriver();
	}
	


}
