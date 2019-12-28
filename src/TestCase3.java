import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestCase3 {
  WebDriver driver;
	
  @Test
  public void Test() throws InterruptedException 
  {
	  driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@value='3']")).click();
		driver.findElement(By.xpath("//input[@value='4']")).click();
	/*  driver.findElement(By.xpath("/html/body/div/div/div/div[2]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/form/table/tbody/tr[3]/td/div/div[1]/input[5]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/form/table/tbody/tr[3]/td/div/div[1]/input[6]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/form/table/tbody/tr[3]/td/div/div[1]/input[7]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/form/table/tbody/tr[3]/td/div/div[1]/input[8]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/form/table/tbody/tr[3]/td/div/div[1]/input[9]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/form/table/tbody/tr[3]/td/div/div[1]/input[0]")).click();  */
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	//	Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='memberUsername']")).sendKeys("pinkubhui");
	//	driver.findElement(By.id("memberName")).sendKeys("B sai charan");
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr[1]/td[2]/input")).click();
		
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

}
