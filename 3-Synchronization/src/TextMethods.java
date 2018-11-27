import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		String text = driver.findElement(By.cssSelector(".floatL.bold")).getText();
		System.out.println(text);
		driver.findElement(By.id("login1")).sendKeys("Mike");
		String value = driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(value);
		
		String goButton = driver.findElement(By.name("proceed")).getAttribute("value");
		System.out.println(goButton);
		
		String secureLogin = driver.findElement(By.cssSelector("[class='floatL f12 margTop5']>div:nth-of-type(2)")).getText();
		System.out.println(secureLogin);

	}

}
