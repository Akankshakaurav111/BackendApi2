package com.trello.admin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FaceBook_logIn_Text_Varification 
{
	@Test
	public void logButtonText()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		try
		{
			WebElement logIn = driver.findElement(By.name("login"));
			Assert.assertTrue(true);
			String expeclogInText = logIn.getText();
			Assert.assertEquals( expeclogInText ,"Log in");
			}
		catch(Exception e)
		{
		Assert.fail()	;
		}
	
	}

}
