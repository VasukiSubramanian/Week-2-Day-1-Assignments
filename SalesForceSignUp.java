package week2.leaftaps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Download and Install ChromeDriver
		WebDriverManager.chromedriver().setup();
		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// Get the title using getTitle() method
		String title = driver.getTitle();
		// Print the title
		System.out.println(title);
		// Maximize the window
		driver.manage().window().maximize();
		// driver.close();

		// wait for 10 secs if the element is not in DOM (or) if internet connection is slow
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Vasuki");
		driver.findElement(By.name("UserLastName")).sendKeys("S");
		driver.findElement(By.name("UserEmail")).sendKeys("vasu94it@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("9994872182");
		
		WebElement drpdwn = driver.findElement(By.name("UserTitle"));
		Select drop = new Select(drpdwn);
		drop.selectByValue("Developer");
		
		WebElement drpdwn1 = driver.findElement(By.name("CompanyEmployees"));
		Select drop1 = new Select(drpdwn1);
		drop1.selectByValue("950");
		
		WebElement drpdwn2 = driver.findElement(By.name("CompanyCountry"));
		Select drop2 = new Select(drpdwn2);
		drop2.selectByValue("IN");
		
		driver.findElement(By.className("checkbox-ui")).click();
		
		driver.close();

	}

}
