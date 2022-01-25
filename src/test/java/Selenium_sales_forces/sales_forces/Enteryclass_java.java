package Selenium_sales_forces.sales_forces;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enteryclass_java  extends Testbese{
	
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.manage().window().maximize();
	}
		
public static void main (String[] args) throws Exception 	{
	
}
	public void longintoapplication() throws Exception {
		d.get("https://login.salesforce.com/");
		Thread.sleep(5000);
    d.findElement(By.id("username")).click();
	d.findElement(By.id("username")). clear();
	d.findElement(By.id("usernane")).sendKeys("narmatalentonda@talenton.com");
	Thread.sleep(2000);
	d.findElement(By.id("password")). click();
	d.findElement(By.id("password")). clear();
	d.findElement(By.id("password")). sendKeys("Janu@143");
	d.findElement(By.xpath("//label[contains(text(),'Remember me')]")).click();
    Thread.sleep(5000);
    d.findElement(By.xpath("//input[@value='Log In']")).click();
   // d.findElement(By.ByXPath()
    Thread.sleep(5000);
    
	}

	    }




	




	
