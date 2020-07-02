package Hola;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class param {
	
	@Parameters({"url"})
	@Test
	public void passit(String urlname) {
		System.out.println(urlname);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data=new Object[3][2];
		data [0][0]="fsadf@gmail.com";
		data [0][1]="njsgj";
		data [1][0]="jsjgj@gmail.com";
		data [1][1]="hshghg";
		data [2][0]="bjsgh@gmail.com";
		data [2][1]="khst";
		return data;
		
		
	}
	
	@Test(dataProvider="getData")
	public void login(String a,String b) {
		System.out.println(a);
		System.out.println(b);
		
	}

}
