package execution;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
public class Sikuli_Demo2 {
	Screen s  = new Screen();
	WebDriver driver;
	
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://google.com");
  }

  
  @Test
  public void f() throws FindFailed, InterruptedException {
	  
	  Thread.sleep(2000);
	  
	  driver.get("http://seleniumlearn.com");
	
	  s.click("D:\\Sikuli\\Testing.PNG");
  }
  
  
  
  
  
  @AfterTest
  public void afterTest() {
  }

}
