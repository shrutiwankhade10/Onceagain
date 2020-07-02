package Hola;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class windows extends base{
	
	@Test(dependsOnMethods=("Driver"))
	public void section() throws IOException {
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.id("gf-BIG"));
		WebElement column=table.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		int text=column.findElements(By.tagName("a")).size();
		
		for(int i=0;i<text;i++) {
			String next=Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(next);
			}
		Set<String> abc=driver.getWindowHandles();
		Iterator <String> it=abc.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
	
	@Test
	public void Driver() throws IOException {
		driver=startDriver();
		
	}
	

}
