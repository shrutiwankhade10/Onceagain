package Hola;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tableobject  {
	public WebDriver driver;
	
	By row =By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']");
	By box=By.id("datepicker");
	By mont= By.className("ui-datepicker-title");
	By net =By.className("ui-icon ui-icon-circle-triangle-e");
	By datcs= By.className("ui-state-default ui-state-hover");
	By tabl=By.id("gf-BIG");
	By win=By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a");
	
	
	
	
	
	public Tableobject(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public List<WebElement> rowc() {
		return driver.findElements(row);
	}
	
	public WebElement textbox() {
		return driver.findElement(box);
	}
	public WebElement month() {
		return driver.findElement(mont);
	}
	public WebElement next() {
		return driver.findElement(net);
	}
	public List<WebElement> date() {
		return driver.findElements(datcs);
	}
	public WebElement table() {
		return driver.findElement(tabl);
	}
	public WebElement Wind() {
		return driver.findElement(win);
	}

}
