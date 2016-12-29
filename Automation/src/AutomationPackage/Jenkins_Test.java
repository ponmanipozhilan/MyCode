package AutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Jenkins_Test {

	
	@Test
	public void test() throws InterruptedException {

		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://atqa.testqa-lcbs.honeywell.com");

		driver.findElement(By.id("cred_userid_inputtext")).sendKeys("JSmith1@atqa.lcbsconnect.com");
		Thread.sleep(2000);
		driver.findElement(By.id("cred_password_inputtext")).sendKeys("lcbs@123");
		Thread.sleep(2000);
		driver.findElement(By.id("cred_sign_in_button")).click();
		
		
	}

}
