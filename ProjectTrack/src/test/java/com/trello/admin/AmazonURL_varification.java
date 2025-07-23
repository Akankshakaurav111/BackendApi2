package com.trello.admin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonURL_varification {
@Test
public void urlVarification()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	String amazonURL = driver.getCurrentUrl();
	Assert.assertEquals(amazonURL, true);
	
	
}
}
