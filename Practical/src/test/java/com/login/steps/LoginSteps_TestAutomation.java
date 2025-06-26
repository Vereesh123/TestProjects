package com.login.steps;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps_TestAutomation {
	
	WebDriver driver;
	
	By uName = By.xpath("//input[@name='username']");
	By pWord = By.xpath("//input[@name='password']");
	By sButton = By.xpath("//button[@id='submit']");
	
	@Given ("User navigates to the application")
	public void browserUrl() {
		ChromeOptions chrme = new ChromeOptions();
		chrme.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-popup-blocking"));
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chrme);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Given ("user enters the username as {string}")
	public void userMethod(String username) {
		driver.findElement(uName).sendKeys(username,Keys.TAB);
	}
    @Given ("user enters the password as {string}")
	public void passMethod(String password) {
		driver.findElement(pWord).sendKeys(password);
		
	}
    @Given ("User clicks the login button")
    public void submitMethod() {
    	driver.findElement(sButton).click();
    }
    @Then ("login should happened successfully")
    public void successMethod() {
    	System.out.println("Loign should be successfull for the page");
    	
    }
}
