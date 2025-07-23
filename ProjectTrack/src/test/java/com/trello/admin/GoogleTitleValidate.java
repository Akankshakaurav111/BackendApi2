package com.trello.admin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTitleValidate 
{
	@Test
	public void titleValidation()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//navigation to google.com
		driver.get("https://www.google.com/");
		//String orgTitle="Google";
	//	String actualTitle=driver.getTitle();
	//	Assert.assertEquals(orgTitle,actualTitle);

		//get the title of the page
		String title=driver.getTitle();
		
		//Validation the title
		Assert.assertEquals(title,"Google","Title does not match!");
		if(driver !=null)
		{
			driver.quit();
		}
		
		
		
	}

}
