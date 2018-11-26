import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();   // create the instance from class
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//id locator
		driver.findElement(By.id("login1")).sendKeys("Stela");
		
		//name
        driver.findElement(By.name("passwd")).sendKeys("abcd2");
        
//        //linkText locator
//		driver.findElement(By.linkText("Forgot Password?")).click();
		
		//partialLonkText
		driver.findElement(By.partialLinkText("new account)")).click();

	}

}
