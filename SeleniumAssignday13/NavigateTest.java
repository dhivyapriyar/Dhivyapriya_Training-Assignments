package SeleniumAssignday13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateTest {
  @Test
  public void PerformNavigate() throws InterruptedException {
	  
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.navigate().to("https://www.google.com");
	 Thread.sleep(2000);
	 
	 driver.navigate().to("https://www.youtube.com");
	 Thread.sleep(2000);

	 driver.navigate().back();
     Thread.sleep(2000);
     
     driver.navigate().forward();
     Thread.sleep(2000);
     
     driver.navigate().refresh();
     Thread.sleep(2000);
     
     driver.quit();
	 
	 


  }
}
