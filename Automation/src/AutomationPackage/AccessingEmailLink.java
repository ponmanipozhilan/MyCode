package AutomationPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingEmailLink {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.mailinator.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("inboxfield")).sendKeys("Occupant");
		
		driver.findElement(By.xpath("html/body/section[1]/div/div[3]/div[2]/div[2]/div[1]/span/button")).click();
		
		Thread.sleep(5000);
		
		String handle = driver.getWindowHandle();
			
		driver.findElement(By.xpath("//*[@id='public_maildirdiv']/div/div/div/div[5]/div[contains(text(), ' You have been authorized to use the new temperature control system in your building')]")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("publicshowmaildivcontent");
			
		driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td/table/tbody/tr[3]/td/table/tbody/tr/td/a[1]/span[contains(text(), 'GET STARTED')]")).click();
		
		Thread.sleep(2000);
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String handle1 : driver.getWindowHandles()) {
			 
        	        	driver.switchTo().window(handle1);
        	        	
        	        	System.out.println("Switched to Child window successfully");
        	        	
        	        	//driver.findElement(By.xpath("//*[@id='eula-wrapper']/div[2]/label")).click();
        	    		//driver.findElement(By.xpath("//*[@id='eula-wrapper']/div[3]/button")).click();
        	        	Thread.sleep(5000);
        	    		
        	        	System.out.println("Accepted the invite");

        	}
		
		Thread.sleep(5000);
		           
        
        driver.switchTo().window(handle);
        
        System.out.println("Switched to Parent window successfully");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id='publicInboxCtrl']/div[1]/div[3]/div/div/button")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath(".//*[@id='public_maildirdiv']/div/div[1]/div/div[5]/div[contains(text(), 'LCBS Connect Verification Code')]")).click();
		
        Thread.sleep(5000);
        
        driver.switchTo().frame("publicshowmaildivcontent");        
        
		String passcode = driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td/table/tbody/tr[1]/td/b")).getText();
		
		System.out.println(passcode);
		
		Thread.sleep(3000);
		
		
		
		for (String handle1 : driver.getWindowHandles()) {
			 
        	driver.switchTo().window(handle1);
        	
        	System.out.println("Login into the Registartion page successfully");
        	
        

}
		
		
      
        
		
		
		/*
		 //EULA page
		 
		
		driver.findElement(By.xpath("//*[@id='eula-wrapper']/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id='eula-wrapper']/div[3]/button")).click();
		Thread.sleep(5000);
		
		//Registration page
		
		driver.findElement(By.xpath("//*[@id='onboarding-wrapper']/div[1]/section/div[2]/div[1]/input")).sendKeys("Occupant");
		
		driver.findElement(By.xpath("//*[@id='onboarding-wrapper']/div[1]/section/div[2]/div[2]/input")).sendKeys("Test");
		
		driver.findElement(By.xpath("//*[@id='onboarding-wrapper']/div[1]/section/div[3]/input")).sendKeys("9535519066");
		
		//Verification code
		//driver.findElement(By.xpath(".//*[@id='public_maildirdiv']/div/div[1]/div/div[5]/div[contains(text(), 'LCBS Connect Verification Code')]")).click();
		
		String code = driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td/table/tbody/tr[1]/td/b")).getText();
		
		System.out.println(code);
		
		driver.findElement(By.xpath("//*[@id='onboarding-wrapper']/div[1]/section/div[4]/input")).sendKeys("");
		
		driver.findElement(By.xpath("//*[@id='onboarding-wrapper']/div[1]/section/footer/button")).click();
		
		
		Thread.sleep(50000);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		

	}

}
