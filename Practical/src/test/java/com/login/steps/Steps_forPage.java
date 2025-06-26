package com.login.steps;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps_forPage {
	
	WebDriver driver;
	
	By uName = By.xpath("//input[@name='username']");
	By pWord = By.xpath("//input[@name='password']");
	By clickBtn = By.xpath("//button[@id='submit']");
	

//	@FindBy (how=How.XPATH, using="//input[@name='username']")
//	WebElement uName;
//	
//	@FindBy (how=How.XPATH, using="//input[@name='password']")
//	WebElement pWord;
//	
//	@FindBy (how=How.XPATH, using="//button[@id='submit']")
//	WebElement clickBtn;
	
	@Given("User navigate to the aplication")
	public void firstMethod() {
		
		ChromeOptions chrome = new ChromeOptions();
		chrome.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver(chrome);
	      driver.get("https://practicetestautomation.com/practice-test-login/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Given("user enter the username as {string}")
	public void uMethod(String username) {
		driver.findElement(uName).sendKeys(username,Keys.TAB);
		//uName.sendKeys(username,Keys.TAB);
		
	}
	@Given ("user enters the password as {string}")
	public void pMethod(String password) {
		driver.findElement(pWord).sendKeys(password);
		//pWord.sendKeys(password);
		
	}
	@Given ("user clicks the login button")
	public void bMethod() {
		driver.findElement(clickBtn).click();
		//clickBtn.click();
	}
	@Then ("Login should be successfull")
	public void sMethod() {
		System.out.println("Login should be successfull");
		
		
	}

}
