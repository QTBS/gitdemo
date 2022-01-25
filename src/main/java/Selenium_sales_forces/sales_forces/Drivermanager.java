package Selenium_sales_forces.sales_forces;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivermanager extends Testbese implements IseleniumManager {
	
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.manage().window().maximize();
		
		}

	@Override
	public void longintoapplication() throws Exception  {
		d.get("https://login.salesforce.com/");
		//Thread.sleep(5000);
    d.findElement(By.id("username")).click();
	d.findElement(By.id("username")). clear();
	d.findElement(By.id("username")).sendKeys("narmada@talenton.com");
	Thread.sleep(2000);
	d.findElement(By.id("password")). click();
	d.findElement(By.id("password")). clear();
	d.findElement(By.id("password")). sendKeys("Janu@143");
	d.findElement(By.xpath("//label[contains(text(),'Remember me')]")).click();
   // Thread.sleep(5000);
    d.findElement(By.xpath("//input[@value='Log In']")).click();
   // d.findElement(By.ByXPath()
  // Thread.sleep(5000);
	}
	@Override
	public void forgotpassword() throws Exception {
		d.get("https://login.salesforce.com");
		   Thread.sleep(2000);
		   d.findElement(By.id("username")).click();
		   Thread.sleep(2000);
		   d.findElement(By.id("username")). clear();
		  // Thread.sleep(2000);
		   d.findElement(By.id("username")).sendKeys("narmada@talenton.com");
		   //Thread.sleep(2000);
		   d.findElement(By.id("forgot_password_link")).click();
		   //Thread.sleep(2000);
		   
	}
	
		@Override
	public void exitapplication() {
		d.quit();
	}

		@Override
		public void waitForElementvisibleExplicit(int i, WebElement eledropdwon) {
			
		}

		
		
		
			
		}

			
			
		
			
			
				
	



	


   
	