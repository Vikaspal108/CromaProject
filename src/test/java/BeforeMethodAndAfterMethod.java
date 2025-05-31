import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAndAfterMethod 
{
	WebDriver driver ;
	WebElement userid ;
	WebElement password;
	@BeforeMethod
	public void browserOpen() {
		String url = "https://www.facebook.com";
		driver = new ChromeDriver();
		driver.get(url);
		userid = driver.findElement(By.id("email"));
		password = driver.findElement(By.id("pass"));
	}
	@Test
	public void testcase1() {
		userid.sendKeys("Vikas@1233");
		password.sendKeys("1234");
		
	}
	@Test
	public void testcase2() {
		userid.sendKeys("Vikas@1234");
		password.sendKeys("1235");
		
	}
	@Test
	public void testcase3() {
		userid.sendKeys("Vikas@1235");
		password.sendKeys("1236");
		
	}
	@Test
	public void testcase4() {
		userid.sendKeys("Vikas@1236");
		password.sendKeys("1237");
		
	}
	@Test
	public void testcase5() {
		userid.sendKeys("Vikas@1237");
		password.sendKeys("1238");
		
	}
	@AfterMethod
public void browserclose() {
	driver.close();
}
}

