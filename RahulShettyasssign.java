package SeleniumAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyasssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		// to find xpath since there is no name,id, class for clicking radio button
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input")).click();
		
		
		// to click two checkbox options
		driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.id("checkBoxOption3")).click();
        
        driver.close();
	}

}
