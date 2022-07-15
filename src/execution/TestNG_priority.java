package execution;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_priority {
	WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLib\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
  }

  @Test(priority=1)
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @Test(priority=3)
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  
  @Test(priority=2)
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  
  @Test(priority=0)
  public void twitter() {
	  driver.get("https://www.twitter.com");
  }
  
  @Test
  public void amazon() {
	  driver.get("https://www.amazon.com");
  }
  @AfterTest
  public void afterTest() {
  }

}
