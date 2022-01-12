package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void loginToApp() throws InterruptedException {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("13kryvenko@gmail.com");
		driver.findElement(By.xpath("//button[@id='nextbtn'and@class='btn blue']")).click();
	Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12121q1q");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
		
	}
	
}
