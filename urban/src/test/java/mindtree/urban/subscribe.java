package mindtree.urban;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class subscribe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "‪C:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("https://www.urbanladder.com/");
       
		drv.findElement(By.id("//*'[@id=\"email_id\']")).sendKeys("gmail@gmail.com");
		drv.findElement(By.id("*//[@id='nl-subscribe-footer']")).click();
	}

}
