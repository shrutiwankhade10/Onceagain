package Hola;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class window extends base {
	
	@Test
	public void switchw() throws IOException {
		
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Tableobject j=new Tableobject(driver);
		j.Wind().click();
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
				}
	
	@BeforeTest
	public void start() throws IOException {
		driver=startDriver();
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

}
