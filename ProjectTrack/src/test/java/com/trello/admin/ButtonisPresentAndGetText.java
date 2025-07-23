package com.trello.admin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonisPresentAndGetText {
  @Test
  public void buttonIsPresentIrNot() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.navigate().to("https://www.facebook.com/");
	  
	  try {
		WebElement loginBtn = driver.findElement(By.name("login"));
		Assert.assertTrue(true);
		SactualText=loginBtn .getAttribute('value');
		
		
		
	  }
	  catch (Exception e) {
		Assert.fail();
	}
	  
  }
}
