package Hola;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

public class Actn extends base {
	public static Logger Log=LogManager.getLogger(base.class.getName());
	
	@Test
	public void check() throws IOException {
		driver=startDriver();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("shruti").doubleClick().build().perform();
		Log.info("shruti");
		
		}
	
	@Test(groups= {"smoke"})
	public void abc() throws IOException {
		driver=startDriver();
		driver.get("https://www.amazon.in/");
		Log.info("shruti");
		
	}
	
	@Test(groups= {"smoke"})
	public void def() throws IOException {
		driver=startDriver();
		driver.get("https://www.google.co.in/");
		Log.info("wankhade");
	}

}
