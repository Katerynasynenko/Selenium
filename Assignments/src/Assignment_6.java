import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#username")).sendKeys("mike");
		driver.findElement(By.cssSelector("#password")).sendKeys("abc");
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
		driver.quit();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.bestbuy.com/identity/signin?token=tid%3Aaa6753d2-f294-11e8-88a2-005056ae0b6b");
		driver1.manage().window().maximize();
		driver1.findElement(By.cssSelector("[name='ciaSignOn']>div>input")).sendKeys("mike@mike.com");
		driver1.findElement(By.cssSelector("[class='relative-wrap']>div:nth-of-type(2)>input")).sendKeys("abc123 ");
		driver1.findElement(By.cssSelector(".cia-form__submit-button.js-submit-button")).click();
		driver.quit();

	}

}
