package mindtree.urban;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class password {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "‪C:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("https://www.urbanladder.com/");
       Thread.sleep(5000);
       drv.findElement(By.xpath("//span[class='header-icon-link user-profile-icon']")).click();
       Thread.sleep(5000);
       drv.findElement(By.xpath("//a[class='login-link authentication_popup']")).click();
       drv.findElement(By.xpath("//a[class='forget-password link-color']")).click();
       WebElement we=drv.findElement(By.cssSelector(" #spree_user_email"));
       we.click();
       we.sendKeys("gmail@gmail.com");
       drv.findElement(By.id(" //*[@id=\'forgot_password_form\']")).click();
	}

}
