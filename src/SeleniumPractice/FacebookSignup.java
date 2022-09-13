package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {
        public static void main(String[] args)  {
		
		
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        
		
		//2. clicking::
		WebElement signup = driver.findElement(By.xpath("//a[@title=('Sign up for Facebook')]"));
		signup.click();
		
		//send Key::
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Nikita");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Ingale");
		
		WebElement MobileNo = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		MobileNo.sendKeys("9325320852");
		
		WebElement Password = driver.findElement(By.xpath("//input[@aria-label='New password']"));
		Password.sendKeys("Nikita@123");
		
		   WebElement Days = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	       //create the object of select class
	        Select s = new Select(Days);
	        
	        //1.select by index
	        s.selectByIndex(26);
	        
	        //2.select by value
	       //s.selectByValue("26");
	        
	       // 3.select by visible text
	       // s.selectByVisibleText("26");
	        
	   
	        
	        WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
	        Select s2 = new Select(months);
	        s2.selectByIndex(0);
	      
	        
	        WebElement years = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	        Select s1 = new Select(years);
	       s1.selectByValue("1998");
		
		WebElement malebutton = driver.findElement(By.xpath("//label[text()='Female']"));
		malebutton.click();
		
//		if(malebutton.isSelected()==true) {
//			System.out.println("male Radio button is selected");
//		}else {
//			System.out.println("male Radio button is not selected");
//		}
//		
		
		WebElement sighnUp = driver.findElement(By.xpath("//button[@name='websubmit']"));
		sighnUp.click();
}
}
