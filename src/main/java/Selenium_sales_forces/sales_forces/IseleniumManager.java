package Selenium_sales_forces.sales_forces;

import org.openqa.selenium.WebElement;

public interface IseleniumManager   {
	void launchbrowser();
	void longintoapplication()throws Exception;
	void forgotpassword() throws Exception;
	void exitapplication();
	//void userMenuDropdwon()throws Exception;
	void waitForElementvisibleExplicit(int i, WebElement eledropdwon);
    
}
