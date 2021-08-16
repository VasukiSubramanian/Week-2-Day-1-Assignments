package week2.leaftaps;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //	Download and Install ChromeDriver
			WebDriverManager.chromedriver().setup();
		//	Launch the chrome browser
			ChromeDriver driver = new ChromeDriver();
		//	Load the URL
			driver.get("http://leaftaps.com/opentaps/control/main");
		//	Get the title using getTitle() method
			String title = driver.getTitle();
		//	Print the title
			System.out.println(title);
		//	Maximize the window
			driver.manage().window().maximize();
		//	driver.close();
			
		//	wait for 10 secs if the element is not in DOM (or) if internet connection is slow
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//	locate the username field and enter the username as "demosalesmanager"
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//	locate the password field and enter the password as "crmsfa"
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		//	locate the login button and click on it
			driver.findElement(By.className("decorativeSubmit")).click();
		//	locate the CRM/SFA link and click on it
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vasuki");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
			
			
			WebElement drop = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select drpDwn = new Select(drop);
			drpDwn.selectByIndex(3);
			
			WebElement drop1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select drpDwn1 = new Select(drop1);
			drpDwn1.selectByIndex(1);
			
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("vasu");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("gikki");
			driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Lead");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tech Lead");
			driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/25/94");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("40k");
			
			WebElement drop2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select drpDwn2 = new Select(drop2);
			drpDwn2.selectByValue("IND_SOFTWARE");
			
			WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select drpDwn3 = new Select(drop3);
			drpDwn3.selectByVisibleText("Partnership");
			
			WebElement drop4 = driver.findElement(By.id("createLeadForm_currencyUomId"));
			Select drpDwn4 = new Select(drop4);
			drpDwn4.selectByValue("INR");
			
			driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("40");	
			driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("624601");	
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Tech Lead with 17 years of technical experience");	
			driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note about Tech Lead");
			driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Y");	
			
		//	Contact Information
			
			WebElement findElement = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
			findElement.clear();
			findElement.sendKeys("5");
			
			driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600013");	
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("250591");	
			driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
			driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Vasuki");	
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vasu@gmail.com");
			driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://vasu.com/profile");	
			
		//	Primary Address
			
			driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Vasuki");	
			driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("vasu");	
			driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No:3, Gandhi Nagar");	
			driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Near priya hospital");	
			driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");	
			driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600013");	
			driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("044");	
			
			WebElement drop5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
			Select drpDwn5 = new Select(drop5);
			drpDwn5.selectByValue("IND");
			
			WebElement drop6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select drpDwn6 = new Select(drop6);
			drpDwn6.selectByVisibleText("TAMILNADU");
			
			driver.findElement(By.name("submitButton")).click();



	}

}
