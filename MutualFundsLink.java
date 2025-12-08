package SeleniumAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutualFundsLink {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://money.rediff.com/index.html");
			
			//to get a link text
			
			String text=driver.findElement(By.linkText("Mutual Funds")).getText();
			
			if(text.equals("Mutual Funds"))
	        {
	        	System.out.println("Valid");
	        }
	        else
	        {
	        	System.out.println("Invalid!"); 
	        }

		}

}
