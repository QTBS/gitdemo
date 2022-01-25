package Selenium_sales_forces.sales_forces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Entry_class  extends Testbese{

	public static void main(String[] args) throws Exception {
		
		IseleniumManager sel= new Drivermanager();
		sel.launchbrowser();
		sel.longintoapplication();
		//sel.forgotpassword();
		//sel.exitapplication();
		//ExperimentuserMenuDropdwon(sel);
		//ExperimentuserMenuDropdwonMySettings(sel);
		//ExperimentEmail(sel);
		//Experimentdeveloperconsol(sel);
		//Experimentlogout(sel);
		Experimentfileupload(sel);
		sel.exitapplication();
	}

	private static void Experimentfileupload(IseleniumManager sel) throws Exception {
		WebElement eledropdwon=d.findElement(By.id("userNavLabel"));
		sel.waitForElementvisibleExplicit(10, eledropdwon);
		eledropdwon.click();
		Thread.sleep(2000);
	    WebElement eleMyProfile=d.findElement(By.xpath("(//a[@class='menuButtonMenuLink firstMenuItem'])[1]"));
	    sel.waitForElementvisibleExplicit(10, eleMyProfile);
	    eleMyProfile.click();
		Thread.sleep(2000);
		
		  WebElement elefileupload=d.findElement(By.id("displayBadge"));
		    sel.waitForElementvisibleExplicit(10, elefileupload);
		    elefileupload.click();
			Thread.sleep(2000);
			
			 WebElement elechoosefile=d.findElement(By.id("//input[@name='j_id0:uploadFileForm:uploadInputFile:inputFile:file']"));
			    sel.waitForElementvisibleExplicit(10, elechoosefile);
			    elechoosefile.click();
				Thread.sleep(2000);

			
			
		
	}

	private static void Experimentlogout(IseleniumManager sel) throws Exception {
		
		WebElement eledropdwon=d.findElement(By.id("userNavLabel"));
		sel.waitForElementvisibleExplicit(10, eledropdwon);
		eledropdwon.click();
		Thread.sleep(2000);
		
		WebElement logout=d.findElement(By.xpath("//a[@title='Logout']"));
		sel.waitForElementvisibleExplicit(10, logout);
		logout.click();
		Thread.sleep(2000);
		
		
	}

	private static void Experimentdeveloperconsol(IseleniumManager sel) throws Exception {
		WebElement eledropdwon=d.findElement(By.id("userNavLabel"));
		sel.waitForElementvisibleExplicit(10, eledropdwon);
		eledropdwon.click();
		Thread.sleep(2000);
		
		WebElement developerconsol=d.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
		sel.waitForElementvisibleExplicit(10, developerconsol);
		developerconsol.click();
		Thread.sleep(2000);
		
		
	}

	private static void ExperimentEmail(IseleniumManager sel) throws InterruptedException {
		WebElement eledropdwon=d.findElement(By.id("userNavLabel"));
		sel.waitForElementvisibleExplicit(10, eledropdwon);
		eledropdwon.click();
		Thread.sleep(2000);
		WebElement eleMySetting=d.findElement(By.xpath("(//a[@class='menuButtonMenuLink'])[1]"));
		sel.waitForElementvisibleExplicit(10, eledropdwon);
		eleMySetting.click();
		Thread.sleep(2000);
		WebElement Email=d.findElement(By.id("EmailSetup_font"));
		sel.waitForElementvisibleExplicit(10, Email);
		Email.click();
		Thread.sleep(2000);
		
		WebElement Emailsetting=d.findElement(By.id("EmailSettings_font"));
		sel.waitForElementvisibleExplicit(10, Emailsetting);
		Emailsetting.click();
		Thread.sleep(5000);
		
		WebElement save1=d.findElement(By.xpath("//input[@value=' Save ']"));
		sel.waitForElementvisibleExplicit(10, save1);
		save1.click();
		Thread.sleep(5000);
		

		WebElement calender=d.findElement(By.id("CalendarAndReminders_font"));
		sel.waitForElementvisibleExplicit(10, calender);
		calender.click();
		Thread.sleep(5000);
		
			}

	private static void ExperimentuserMenuDropdwonMySettings(IseleniumManager sel) throws Exception {
		WebElement eledropdwon=d.findElement(By.id("userNavLabel"));
		sel.waitForElementvisibleExplicit(10, eledropdwon);
		eledropdwon.click();
		Thread.sleep(2000);
		WebElement eleMySetting=d.findElement(By.xpath("(//a[@class='menuButtonMenuLink'])[1]"));
		sel.waitForElementvisibleExplicit(10, eledropdwon);
		eleMySetting.click();
		Thread.sleep(2000);
		WebElement personal=d.findElement(By.xpath("(//a[@class='header setupFolder'])[1]"));
		sel.waitForElementvisibleExplicit(10, personal);
		personal.click();
		Thread.sleep(2000);
		
		WebElement longinhistory=d.findElement(By.id("LoginHistory_font"));
		sel.waitForElementvisibleExplicit(10, longinhistory);
		longinhistory.click();
		Thread.sleep(2000);
		WebElement eleDisplay=d.findElement(By.id("DisplayAndLayout_font"));
		sel.waitForElementvisibleExplicit(10, eleDisplay);
		eleDisplay.click();
		Thread.sleep(2000);	
		WebElement eleMyTabs=d.findElement(By.id("CustomizeTabs_font"));
		sel.waitForElementvisibleExplicit(10, eleMyTabs);
		eleMyTabs.click();
		Thread.sleep(2000);
		
		Select Chatter = new Select(d.findElement(By.id("p4")));
		Chatter.selectByIndex(8);
		Thread.sleep(2000);
		Select Report = new Select(d.findElement(By.id("duel_select_0")));
		Report.selectByValue("report");
		Thread.sleep(2000);
		WebElement add=d.findElement(By.xpath("//img[@title='Add']"));
		sel.waitForElementvisibleExplicit(10, add);
		add.click();
		Thread.sleep(2000);
		
		WebElement save=d.findElement(By.xpath("//input[@value=' Save ']"));
		sel.waitForElementvisibleExplicit(10, save);
		save.click();
		Thread.sleep(2000);
		
	}

	private static void ExperimentuserMenuDropdwon(IseleniumManager sel)throws Exception {
		WebElement eledropdwon=d.findElement(By.id("userNavLabel"));
		sel.waitForElementvisibleExplicit(10, eledropdwon);
		eledropdwon.click();
		Thread.sleep(2000);
	    WebElement eleMyProfile=d.findElement(By.xpath("(//a[@class='menuButtonMenuLink firstMenuItem'])[1]"));
	    sel.waitForElementvisibleExplicit(10, eleMyProfile);
	    eleMyProfile.click();
		Thread.sleep(2000);
		WebElement eleEdit=d.findElement(By.xpath("(//img[@title='Edit Profile'])[1]"));
	     sel.waitForElementvisibleExplicit(10, eleEdit);
		 eleEdit.click();
		Thread.sleep(2000);
	
		
		d.switchTo().frame(d.findElement(By.id("contactInfoContentId")));
		WebElement ab=d.findElement(By.xpath("//a[contains(text(),'About')]"));
		ab.click();
		Thread.sleep(2000);
		d.findElement(By.id("lastName")).click();
		d.findElement(By.id("lastName")).clear();
		d.findElement(By.id("lastName")).sendKeys("nar");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@value='Save All']")).click();
		Thread.sleep(2000);
		
		
	}
}
