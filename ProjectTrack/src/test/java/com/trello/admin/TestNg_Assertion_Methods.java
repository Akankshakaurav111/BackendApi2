package com.trello.admin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_Assertion_Methods {
@Test
public void validationMethod()
{
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");

WebElement logIn = driver.findElement(By.xpath("//div[text()='Log in']"));
//element is present or not 

try {
	logIn.
	Assert.assertTrue("True");
	String logInValue = logIn.getText();
	Assert.assertEquals()
}


driver.manage().window().minimize();

	
}
}
