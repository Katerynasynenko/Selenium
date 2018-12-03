
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task11 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  
		driver.get("http://www.johnlewis.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/ul/li[3]/a"))).build().perform();
		
		driver.findElement(By.xpath("//*[text()='Mirrors']")).click();
		

	}

}
