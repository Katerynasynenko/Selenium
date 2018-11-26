import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
	
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();   // create the instance from class
//		driver.get("https://www.google.com/");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sinen\\SELENIUM\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();   // create the instance from class
		driver.get("https://www.google.com/");
		
		

	}

}
