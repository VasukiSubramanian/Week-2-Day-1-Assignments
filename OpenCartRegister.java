package week2.leaftaps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Download and Install ChromeDriver
		WebDriverManager.chromedriver().setup();
		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://www.opencart.com/index.php?route=account/register");
		// Get the title using getTitle() method
		String title = driver.getTitle();
		// Print the title
		System.out.println(title);
		// Maximize the window
		driver.manage().window().maximize();
		// driver.close();

		// wait for 10 secs if the element is not in DOM (or) if internet connection is slow
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("input-username")).sendKeys("vasuki");
		driver.findElement(By.id("input-firstname")).sendKeys("Vasuki");
		driver.findElement(By.id("input-lastname")).sendKeys("S");
		driver.findElement(By.id("input-email")).sendKeys("vasu94it@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("V@su");

		WebElement drpdwn = driver.findElement(By.id("input-country"));
		Select drop = new Select(drpdwn);
		drop.selectByValue("99");

	}

}
