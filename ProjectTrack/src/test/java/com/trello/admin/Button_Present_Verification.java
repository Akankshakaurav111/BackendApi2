package com.trello.admin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Button_Present_Verification 
{
	@Test
	public void buttonPresent()
	{
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	List<WebElement> buttonPresent = driver.findElements(By.name("login"));
	boolean buttonIsNot = buttonPresent.isEmpty();
	Assert.assertFalse(buttonIsNot);//Assert.assertEquals(buttonIsNot,false,"Button is not present");
	}

}
