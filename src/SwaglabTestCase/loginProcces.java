package SwaglabTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class loginProcces {

	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void setup() {
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void LoginProccess() throws InterruptedException {
		WebElement usernameInput = driver.findElement(By.id("user-name"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		
		usernameInput.sendKeys("standard_user");
		Thread.sleep(1000);
		passwordInput.sendKeys("secret_sauce");
		
		
		loginButton.click();
		
	}
	
	@Test(priority = 2)
	public void addProductToCart() {
		
	}
}
