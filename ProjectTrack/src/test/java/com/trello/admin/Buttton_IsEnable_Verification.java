package com.trello.admin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Buttton_IsEnable_Verification 
{
	@Test
	public void isEnable()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement IsEnableBtn = driver.findElement(By.name("login"));
		boolean actualRes = IsEnableBtn.isEnabled();
		Assert.assertTrue(actualRes);
	}

}
