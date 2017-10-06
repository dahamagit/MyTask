package browserLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.FindBy;

public class Practice1 {

	
	//@FindBy(id="lst-ib")
	//public static WebElement txt;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver_win32//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("lst-ib")).sendKeys("plural of toy");
		driver.findElement(By.name("btnK")).click();
		
		/*driver.findElement(By.className("element class"))
		driver.findElement(By.name("element name"))
		driver.findElement(By.tagName("element html tag name"))
		driver.findElement(By.cssSelector("css selector"))
		driver.findElement(By.link("link text"))
		driver.findElement(By.xpath("xpath expression"))*/
		
		System.out.println("I have launch the Crome browser");

	}

}
