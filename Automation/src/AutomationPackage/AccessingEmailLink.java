package AutomationPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingEmailLink {

	public static void main(String[] args) throws InterruptedException {
        accessEmail();
	}

	public static void accessEmail() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.mailinator.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("inboxfield")).sendKeys("dat13");
		
		driver.findElement(By.xpath("html/body/section[1]/div/div[3]/div[2]/div[2]/div[1]/span/button")).click();
		
		Thread.sleep(5000);
		
		String handle = driver.getWindowHandle();
		
		//driver.findElement(By.xpath("//*[@id='row_public_1481895406-100040578409-sit6']/div[2]/div[5]/div")).click();
			
		driver.findElement(By.xpath("//*[@id='public_maildirdiv']/div/div/div/div[5]/div[contains(text(), ' You have been authorized to use the new temperature control system in your building')]")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("publicshowmaildivcontent");
			
		driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td/table/tbody/tr[3]/td/table/tbody/tr/td/a[1]/span[contains(text(), 'GET STARTED')]")).click();
		
		Thread.sleep(2000);
		
		Set<String> handle1 = driver.getWindowHandles();
		
		for (String windowHandle : handle1) {
			 
			if(!windowHandle.equals(handle)){
				
			
        	        	driver.switchTo().window(windowHandle);
        	        	
        	        	System.out.println("Switched to Child window successfully");
        	        	
        	        	//driver.findElement(By.xpath("//*[@id='eula-wrapper']/div[2]/label")).click();
        	    		//driver.findElement(By.xpath("//*[@id='eula-wrapper']/div[3]/button")).click();
        	        	Thread.sleep(60000);
        	    		
        	        	System.out.println("Accepted the invite");
        	        	
        	        	Thread.sleep(5000);
        	        	
        	        	driver.switchTo().window(handle);
        	        	System.out.println("Switched to Parent window successfully");
        	}
		}
		
		
		           
        
       
                
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id='publicInboxCtrl']/div[1]/div[3]/div/div/button")).click();
        
        Thread.sleep(5000);
        
        //driver.findElement(By.xpath("//*[@id='row_public_1481895551-3000179684447-sit6']/div[2]/div[5]/div")).click();
        
        driver.findElement(By.xpath("//*[@id='public_maildirdiv']/div/div[1]/div/div[5]/div[contains(text(), 'LCBS Connect Verification Code')]")).click();
		
        Thread.sleep(5000);
        
        driver.switchTo().frame("publicshowmaildivcontent");        
        
		String passcode = driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td/table/tbody/tr[1]/td/b")).getText();
		
		System.out.println(passcode);
		
		Thread.sleep(3000);
		
				
		for (String windowHandle : handle1) {
			 
			if(!windowHandle.equals(handle)){
				
				
	        	driver.switchTo().window(windowHandle);
        	
        	Thread.sleep(5000);
        	
        	//Registration
        	driver.findElement(By.xpath("//*[@id='onboarding-wrapper']/div[1]/section/div[2]/div[1]/input")).sendKeys("dat");
    		
    		driver.findElement(By.xpath("//*[@id='onboarding-wrapper']/div[1]/section/div[2]/div[2]/input")).sendKeys("13");
    		
    		driver.findElement(By.xpath("//*[@id='onboarding-wrapper']/div[1]/section/div[3]/input")).sendKeys("9535519066");
    		
    		driver.findElement(By.xpath("//*[@id='onboarding-wrapper']/div[1]/section/div[4]/input")).sendKeys(passcode);
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("//*[@id='onboarding-wrapper']/div[1]/section/footer/button")).click();
    		
    		Thread.sleep(300000);
    		
        	//Getting user name & password
        	String username = driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div[1]/a")).getText();
        	
        	System.out.println(username);
        	
        	String tempPassword = driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div[2]/a")).getText();
        	
        	System.out.println(tempPassword);
        	
        	driver.findElement(By.xpath("html/body/div[4]/div/div/div[3]/button")).click();
        	        	
        	driver.close();
        	
        	Thread.sleep(2000);
        	
        	driver.switchTo().window(handle);
        	System.out.println("Switched to Parent window successfully");
        	       	
			}

			
}
		
		driver.close();
		
		
	}		
		
	
	}


