/**
 * 
 */
package com.trello.admin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 
 *///Amazon.in ---Title verification


public class Verify_The_Title 
{
@Test
public void validatAndVarify()
{
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
String titleAmazon = driver.getTitle();
Assert.assertEquals(titleAmazon,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");


	


	
}
}
