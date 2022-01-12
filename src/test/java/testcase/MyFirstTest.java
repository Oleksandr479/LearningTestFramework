package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest extends BaseTest {

		@Test
		public void loginFunctionality() {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("13kryvenko@gmail.com");
		driver.findElement(By.xpath("//button[@id='nextbtn'and@class='btn blue']")).click();
	
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12121q1q");
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
		
	}

}
