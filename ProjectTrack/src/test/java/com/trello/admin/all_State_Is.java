package com.trello.admin;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class all_State_Is 
{
	@Test
	public void allState()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("file:///D:/Jyoti/State.html");

	List<String> expectedOption = Array.asList("karnatka","M.P","u.p","rajsthan","bihar");
	
	}

}
