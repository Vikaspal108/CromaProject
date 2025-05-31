import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		 driver.findElement(By.id("email")).sendKeys("Vikas@123");
		driver.findElement(By.id("pass")).sendKeys("123");
		 driver.findElement(By.id("email")).sendKeys("Vikas@123");
			driver.findElement(By.id("pass")).sendKeys("123");
	}

}
