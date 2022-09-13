package JavaScriptProgram;
//comment
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import SeleniumPractice.Utility;

public class JavaScriptExecution {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
	
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		//Drawing border around elements::
		
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.switchTo().frame("iframeResult");
	
		WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", tryit);
		Utility.borderbyJS(driver, tryit);
	
//		
//		Capture the of webpage::
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js1 =  ((JavascriptExecutor)driver);
//		String title = js1.executeScript("return document.title;").toString();
//		System.out.println(Utility.titlebyJS(driver));

		
//click on perticular elements::
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
////      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
////		driver.switchTo().frame("iframeResult");
//		WebElement click = driver.findElement(By.xpath("//a[text()='Sign Up']"));
//		JavascriptExecutor js2=((JavascriptExecutor)driver);
//		js2.executeScript("arguments[0].click();", click);
//		Utility.clickbyJS(driver, click);

////		
//		generte alert::
//		
//		driver.get("https://www.facebook.com/login/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js3=((JavascriptExecutor)driver);
//		js3.executeScript("alert('"+ "Website Launched Sucessfully"+"')");
//		Utility.alertbyJS(driver, "This is javascript alert");
		//Utility.alertbyJS(driver, "This is message by utility class");
		
		//refreshing page::	
//		driver.get("https://www.facebook.com/login/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("history.go(0)");
//		
//		Utility.refreshbyJS(driver);
//	
		
		//Scrol Up::
//		
//		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("scroll(0,2500)");
//		Thread.sleep(500);
//  	js.executeScript("scroll(0,-500)");
//		js.executeScript("scroll(0,-500)");
//		Utility.scrolldownbyJS(driver, 0, 2500);
//		Utility.scrollupbyJS(driver, 0, -500);
//		Utility.scrolldownbyJS(driver, 0, -500);
//		
//		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		WebElement Privacy = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
//		JavascriptExecutor js =((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].scrollIntoView(true);", Privacy);
//		Utility.scrollintoviewbyJS(driver, Privacy);
//		Utility.clickbyJS(driver, Privacy);
//		
		
	
		
	}

}
