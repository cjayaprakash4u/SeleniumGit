package execution;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;

public class Sikuli_Demo {
Screen s = new Screen();
WebDriver driver;
  @Test
  public void desktopAutomation() throws FindFailed, InterruptedException {
	 // s.click("D:\\Sikuli\\Startbutton.PNG");
	 // s.type("D:\\Sikuli\\Search.PNG", "Sikuli");
	  System.setProperty("", null);
	  Thread.sleep(5000);
	  s.dragDrop("D:\\Sikuli\\JP.PNG", "D:\\Sikuli\\Windowslogo.PNG");
	  
	 // s.click("D:\\Sikuli\\Wether.PNG");
	  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
