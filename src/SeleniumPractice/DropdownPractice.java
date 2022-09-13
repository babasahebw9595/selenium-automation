package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {
public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
        
        WebElement Days = driver.findElement(By.xpath("//select[@name='birthday_day']"));
       //create the object of select class
        Select s = new Select(Days);
        
        //1.select by index
        s.selectByIndex(25);
        
        //2.select by value
       //s.selectByValue("26");
        
       // 3.select by visible text
       // s.selectByVisibleText("26");
        
   
        
        WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
        Select s2 = new Select(months);
        s2.selectByIndex(7);
      
        
        WebElement years = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select s1 = new Select(years);
       s1.selectByValue("1994");
//        
//        List<WebElement> Listofyears = s1.getOptions();
//        System.out.println("the total number of years available:-"+Listofyears.size());
//        
//        for(int i=0;i<Listofyears.size();i++) {
//        	String year = Listofyears.get(i).getText();
//        	System.out.println(year);
//        }
        
//        // to check default selected value
//        String firstopt = s1.getFirstSelectedOption().getText();
//        		System.out.println(firstopt);
//        
//        
//        
}
}