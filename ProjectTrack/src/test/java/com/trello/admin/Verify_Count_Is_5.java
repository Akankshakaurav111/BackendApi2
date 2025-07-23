package com.trello.admin;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_Count_Is_5 
{
	@Test
	public void count()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("file:///D:/Jyoti/State.html");
	List<String> allState = Arrays.asList("karnatka","M.P","u.p","rajsthan","bihar");
	WebElement	dropDown=driver.findElement(By.name("sample_1"));
	Select dropSelect=new Select(dropDown) ;
	List<WebElement> alOpts = dropSelect.getOptions();
	ArrayList actualState = new ArrayList();
	int actualres=alOpts.size();
	int expectres=5;
	Assert.assertEquals(actualres,expectres,"count is not verify" );
	}
}
}
