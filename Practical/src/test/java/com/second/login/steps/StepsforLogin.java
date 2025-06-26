package com.second.login.steps;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsforLogin {
   WebDriver driver;
   
   By uName = By.xpath("//input[@name='username']");
   By pWord = By.xpath("//input[@name='password']");
   By cButton = By.xpath("//button[@id='submit']");
   
   @Given ("User navigate to the aplication")
   public void firstMethod() {
	   ChromeOptions chrme = new ChromeOptions();
	   chrme.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver(chrme);
	   driver.get("https://practicetestautomation.com/practice-test-login/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
   }

   @Given ("user enter the username as {string}")
   public void userMethod(String username) {
	   driver.findElement(uName).sendKeys(username,Keys.TAB);
	   
   }
   
   @Given ("user enters the password as {string}")
   public void passMethod(String password) {
	   driver.findElement(pWord).sendKeys(password);
   }
   
   @Given ("user clicks the login button")
   public void submitMethod() {
	   driver.findElement(cButton).click();
   }
   
   @Then ("Login should be successfull")
   public void successMehtod() {
	   System.out.println("Login should be happened successfully");
   }

	
    
}
