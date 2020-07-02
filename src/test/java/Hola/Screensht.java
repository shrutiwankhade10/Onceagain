package Hola;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Screensht extends base {

	@Test
	public void screenshot() throws IOException {
		driver=startDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\screenshot\\screenst.png"));
		driver.close();
		
		
		
	}
	
	
	@Test
	public void cookies() throws IOException {
		driver=startDriver();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void screen() throws IOException {
		driver=startDriver();
		driver.get("https://www.google.co.in/");
		
	}
	/* @Test
	public void insecure() {
		DesiredCapabilities ch=new DesiredCapabilities.chrome();
		ch.acceptInsecureCerts()
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		
		
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		Webdriver driver=new Chromedriver(c);
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
}
