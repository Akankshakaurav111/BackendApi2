package updateForGit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_MobListPrice {

	
		public static void main(String[] args) throws InterruptedException {

			
			WebDriver driver= new ChromeDriver(); 
			

			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
			List<WebElement> allMobile = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
			for (WebElement mobile : allMobile) {
				String mobileName = mobile.getText();
				
				String price = driver.findElement(By.xpath("//div[@class='yKfJKb row' and contains(.,'"+mobileName+"')]//div[@class='Nx9bqj _4b5DiR']")).getText();
				System.out.println(mobileName+" "+price);
			}
		}


	}


