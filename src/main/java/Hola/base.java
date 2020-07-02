package Hola;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
	public WebDriver driver;
	public Properties prop;
	
	
	public WebDriver startDriver() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\selenium workspace\\Practiceno1\\src\\main\\java\\Hola\\data.properties");
		prop.load(fis);
		String text=prop.getProperty("browser");
		if(text.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D://selenium-java-3.141.59//chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(text.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D://selenium-java-3.141.59//geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		if(text.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "D://selenium-java-3.141.59//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//WebDriverWait w=new WebDriverWait(driver,15);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)))
		
		return driver;
		
		
		
		
		
	}

}
