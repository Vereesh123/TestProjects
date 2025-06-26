package StepsFile;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	WebDriver driver;
	@Given ("User navigate to the application")
	public void portalOpen() {
		
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://login.credentipreview.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
	}
	@And ("User enters the username as {string}")
	public void emailField(String username) {
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys(username,Keys.ENTER);
	}
	
	@Then ("login page opened successfully")
	public void pageOpend() {
		
		
		System.out.println("Page Opened");
	}

}
