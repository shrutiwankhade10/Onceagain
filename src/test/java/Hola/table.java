package Hola;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
import org.testng.annotations.Test;

import org.apache.logging.log4j.*;
public class table extends base{
	public static Logger Log=LogManager.getLogger(base.class.getName());
	
	@Test
	public void prac() throws IOException {
		driver=startDriver();
		Log.info("hello");
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22774/nz-vs-ind-2nd-t20i-india-tour-of-new-zealand-2020");
		Tableobject j=new Tableobject(driver);
		int rowcount= j.rowc().size();
		for(int i=0;i<=rowcount;i++) {
			System.out.println(j.rowc().get(i).getText());
		}
		driver.close();
			
		}
			
	@Test
	public void dateclick() throws IOException {
		driver=startDriver();
		Log.info("shruti");
		driver.get("https://jqueryui.com/datepicker/");
		Tableobject j=new Tableobject(driver);
	    j.textbox().click();
	    while(!j.month().getText().contains("August")) {
	    	j.next().click();
	    	
	    }
	    
	   for(int i=0;i<j.date().size();i++) {
		   
		   String text=j.date().get(i).getText();
		   if(text.equalsIgnoreCase("15")) {
			  j.date().get(i).click();
			   
		   }
		   }
	    }
	



	
	
	
	
	
}
    
		
		
			
	
		
	


