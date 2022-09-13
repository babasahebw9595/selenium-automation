package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		//WebElement ifa = driver.findElement(By.xpath("//iframe[@id='iframeResult'])"));
		//driver.switchTo().frame(ifa);
		
		WebElement clickmebtn = driver.findElement(By.xpath("//button[@type='button']"));
		clickmebtn.click();
		
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		WebElement themebtn = driver.findElement(By.xpath("//a[@title='Change Theme']"));
	    themebtn.click();
	}

}

