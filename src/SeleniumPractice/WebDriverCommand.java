package SeleniumPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {
	public static void main(String[] args) {
	// code to launch the browser.
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
//	// to enter the url.
     driver.get("https://www.google.com/");
	//driver.get("https://www.facebook.com/");
////	
//	// what is current url.
	String url = driver.getCurrentUrl();
//	System.out.println(url);
//	
//	// to get the title of the tab.
//	String expectedtitle="Google";
//	String actualtitle = driver.getTitle();
//	System.out.println(actualtitle);
//
//	 if (expectedtitle.equalsIgnoreCase(actualtitle)) {
//		System.out.println("Testcase is passed");
//	}else {
//		System.out.println("Testcase is failed");
//	}
//	
//	// maximize the browser.
//	driver.manage().window().maximize();     /// you cannnot minimize of the browser.
//
//	// navigate.
//	driver.navigate().to("https://www.facebook.com/");
//	driver.navigate().back();      /// google
//	driver.navigate().forward();   /// facebook
//	driver.navigate().refresh();
//	
//	// you can not minmize but you can set the size. (this is trial and error)
//	
//	Dimension d= new Dimension(100,300);
//	driver.manage().window().setSize(d);
//	
//	// set the position on screen.(this is trial and error)
//	Point p	= new Point(500,800);
//	driver.manage().window().setPosition(p);
//	
//	// This is wait provided in milliseconds to control the script execution speed.
//	
//	// to close the browser. 
//	driver.close();
//	
//	//driver.quit();
//	// close command and quit command:- close command==> will close current tab only. quit command will close all the tabs.
}
}


