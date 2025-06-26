package LoginSteps;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	String url = "https://login.credentipreview.io/";
	
	
	@Given ("User navigates to the application")
	public void oktaBrowserLanuch() {
		
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	@Given ("User enters the username as {string}")
	public void userName(String username) {
		WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
		emailField.sendKeys(username, Keys.ENTER);
		  // driver.findElement(By.xpath("//input[@name='email']"));
		                          //      "//input[@name = 'email'][@role='email']"
		                            //  "//input[@name = 'email' and @role='email']"
		                            //   "//input[@name = 'email' or @role='email']"
		                           //    "//input[contains(@name,'email')]
		                        // driver.findElement(By.xpath("//input[starts-with(@name,'email')]"))  ;    
		   
		                   
		
	}
	@Then ("Login should be successful")
	public void pageOpened() {
		
		String actual = driver.getTitle();
		System.out.println("Acutal name:" +actual);
		
		
		System.out.println("page opened successfully");
		
	}

}
