package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementHomeWork {
	public static void main(String[] args) {
		
		
		// code to launch the browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//1. sendkeys() :-  text field ==> data pass
		
		 WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
		 Username.sendKeys("30aprilfacebookAccount");
		 
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("@123$321");
		
		//2. click():- clicking ==> buttons/ radiobutton/ checkbox/ link 
		
//		 WebElementHomeWork LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		 LoginBtn.click();
		
//		WebElementHomeWork SignupLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
//		SignupLink.click();
		
//		//3. isEnabled :- state of  the element.
//		 WebElementHomeWork Username = driver.findElement(By.xpath("//input[@id='email']"));
//		 System.out.println(Username.isEnabled());
//		 
//		 if(Username.isEnabled()==true) {
//			 System.out.println("User name field is enabled");
//		 }else {
//			 System.out.println("Username field is disabled");
//		 }
//		
//		//3. isDisplayed :- visualization of an element.
//		WebElementHomeWork FbLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//		
//		if(FbLogo.isDisplayed()== true) {
//			System.out.println("FB Logo is displayed");
//		}else {
//			System.out.println("FB Logo is not displayed");
//		}
//		 
//		//3. isSelected :- checkbox and radioButton
//		WebElementHomeWork SignupLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
//		SignupLink.click();
//		WebElementHomeWork WomenRadioBtn = driver.findElement(By.xpath("//input[@value='1']"));
//		WomenRadioBtn.click();
//		
//		if(WomenRadioBtn.isSelected()==true) {
//			System.out.println("Women Radio button is selected");
//		}else {
//			System.out.println("Women Radio button is not selected");
//		}
		
		// gettext:- method will help  you to extract the text component from the WebElementHomeWork.
//		WebElementHomeWork tagline = driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook helps you')]"));
//		String ActualString = tagline.getText();
//		
//		String ExpectedString = "Facebook helps you connect and share with the people in your life.";
//		
//		if (ActualString.equals(ExpectedString)) {
//			System.out.println("TestCase is Passed");
//		}else {
//			System.out.println("TestCase is failed");
//		}
		
		
		// get attribute:- method is used to get the attribute value of any element.
		
//		 WebElementHomeWork Username = driver.findElement(By.xpath("//input[@id='email']"));
//		 System.out.println( Username.getAttribute("aria-label"));
//		
	}

	private void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}
}
