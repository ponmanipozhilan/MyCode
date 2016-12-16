package AutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CreatingNewOccupant {

	
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datdev.test-lcbs.honeywell.com");
		
		driver.findElement(By.id("cred_userid_inputtext")).sendKeys("dcontractor37@datdev.lcbsconnect.com");
		Thread.sleep(2000);
		driver.findElement(By.id("cred_password_inputtext")).sendKeys("lcbs@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("cred_sign_in_button")).click();
		Thread.sleep(18000);
		driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[2]/a")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id='main-content']/ul/li/div[1]/a/article/span[contains(text(), 'Brinkers Jewelers 7300')]")).click();
		Thread.sleep(3000);
				
		driver.findElement(By.xpath("//*[@id='main-tab']/nav/a[4]")).click();
		
		Thread.sleep(3000);
		/*
		driver.findElement(By.xpath("//*[@id='occupant-list-container']/header/div/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='main-body']/section/section/div[1]/input")).sendKeys("dat13@mailinator.com");
		
		driver.findElement(By.xpath("//*[@id='main-body']/section/section/div[2]/input")).sendKeys("9535519066");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='main-body']/section/section/footer/button")).click();
		
		System.out.println("Called email class");
		
		AccessingEmailLink.accessEmail();
		
		System.out.println("Finished email class");
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(20000);*/
		
		String OccupantName = driver.findElement(By.xpath("//*[@id='occupant-list-container']/table/tbody/tr/td[contains(@class, 'email ng-binding')][contains(text(), 'dat13@mailinator.com')]")).getText();
    	
    	System.out.println(OccupantName);
		
    	
    	Assert.assertEquals("dat13@mailinator.com", OccupantName);
		
		
    	System.out.println("Occupant Successfully created");
		
		driver.close();
		
		
		

	}

}
