package execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Execution {
	WebDriver driver;
	
	

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLib\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  
  }

  
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  @Test
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @Test
  public void twitter() {
	  driver.get("https://www.twitter.com");
  }
  
  @Test
  public void amazon() {
	  
	  driver.get("https://amazon.com");
	  
  }
  
  @AfterTest
  public void afterTest() {
  }

}
