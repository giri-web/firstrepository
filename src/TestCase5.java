import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestCase5 {

	WebDriver driver;
	@Test
	public void Test() 
	{

	}

	@BeforeMethod
	public void beforeMethod() throws AWTException, InterruptedException 
	{
		assertEquals(driver.getTitle(), "Cyclos");
		driver.findElement(By.id("memberUsername")).click();

		Robot robot=new Robot();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_DOWN);

		driver.findElement(By.xpath("//input[@linkurl='managePasswords?userId=3']")).click();
	}

	@AfterMethod
	public void afterMethod() 
	{

	}

	@BeforeTest
	public void beforeTest() 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:8585/");
	}

	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}
	@BeforeClass
	public void beforeClass()
	{
		driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@value='3']")).click();
		driver.findElement(By.xpath("//input[@value='4']")).click();
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		driver.findElement(By.id("memberUsername")).sendKeys("pinkubhui");
	}

}
