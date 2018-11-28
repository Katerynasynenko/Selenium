import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.website.com/sign-in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("mike");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.className(".cc-btn.cc-dismiss")).click();
		driver.findElement(By.id("signin-submit2")).click();
		driver.close();
		driver.quit();
		

	}

}
