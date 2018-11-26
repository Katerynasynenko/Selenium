import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DynamicBrowser {

	public static void main(String[] args) {
		
//		String browser = "Chrome";
//		
//		if(browser.equals("Chrome")){
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
//			ChromeDriver driver = new ChromeDriver();   // create the instance from class
//			driver.get("https://www.google.com/");
//			//selenium 
//		}else if(browser.equals("Firefox")){
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sinen\\SELENIUM\\geckodriver.exe");
//			FirefoxDriver driver = new FirefoxDriver();   // create the instance from class
//			driver.get("https://www.google.com/");
//			//selenium 
//		}
		
		
		String browser = "Chrome";
		WebDriver driver = null;
		
		if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
			driver = new ChromeDriver();   // create the instance from class 
		}else if(browser.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sinen\\SELENIUM\\geckodriver.exe");
			driver = new FirefoxDriver();   // create the instance from class
		}
		
		driver.get("https://www.google.com/");
		

	}

}
