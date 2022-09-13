package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopupPractice {
	public static void main(String[] args) {
		Set<String> winds;
		Iterator<String> itr;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// first window.
		
	     winds = driver.getWindowHandles();   // 1
		 itr = winds.iterator();    // iterate to first window
		 String firstwindowid = itr.next(); // jump to first window
		 System.out.println(firstwindowid);
		 WebElement facebookpaylink = driver.findElement(By.xpath("//a[@title='Learn more about Facebook Pay']"));
		 facebookpaylink.click();
		 
		 
		 // second window
//		 winds = driver.getWindowHandles();     // 2windows id
//		 itr = winds.iterator();    // iterate to 2 windows
//		 itr.next(); // jump to first window
//		 String secondwindowid = itr.next(); // jump to second window
//		 System.out.println(secondwindowid);
//		 driver.switchTo().window(secondwindowid);
//		 WebElement privacypolicyopt = driver.findElement(By.xpath("//a[text()='Payments Privacy Policy']"));
//		 privacypolicyopt.click();
//		 
		 // third window
		 
//		 winds = driver.getWindowHandles();      // 3 windows id
//		 itr = winds.iterator();    // iterate to 3rd windows
//		 itr.next();     // first window
//		 itr.next();      // second window
//		 String thirdwindowid = itr.next();      // third window
//		 System.out.println(thirdwindowid);
//		 driver.switchTo().window(thirdwindowid);
//		 System.out.println(driver.getCurrentUrl());
//		 
//		 driver.switchTo().window(firstwindowid);
//		 
//		 driver.close();        // close only current window
//				 driver.quit();
	}
}
