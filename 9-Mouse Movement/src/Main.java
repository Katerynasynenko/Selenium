import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  
		driver.get("https://www.americangolf.co.uk/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"header-navigation\"]/div[1]/ul/li[5]/a"))).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"ACCS_1\"]/ul/li[2]/ul/li[2]/a")).click();

		
	}

}
