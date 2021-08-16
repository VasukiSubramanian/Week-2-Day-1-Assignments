package week2.leaftaps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Download and Install ChromeDriver
		WebDriverManager.chromedriver().setup();
		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://en-gb.facebook.com/");
		// Get the title using getTitle() method
		String title = driver.getTitle();
		// Print the title
		System.out.println(title);
		// Maximize the window
		driver.manage().window().maximize();
		// driver.close();

		// wait for 10 secs if the element is not in DOM (or) if internet connection is
		// slow
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vasuki");
		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.name("reg_email__")).sendKeys("vasu94it@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("V@su");

		WebElement drpdwn = driver.findElement(By.id("day"));
		Select drop = new Select(drpdwn);
		drop.selectByValue("25");

		WebElement drpdwn1 = driver.findElement(By.id("month"));
		Select drop1 = new Select(drpdwn1);
		drop1.selectByVisibleText("Sep");

		WebElement drpdwn2 = driver.findElement(By.id("year"));
		Select drop2 = new Select(drpdwn2);
		drop2.selectByVisibleText("1994");

		driver.findElement(By.className("_58mt")).click();

	}

}
