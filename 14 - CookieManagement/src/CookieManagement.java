import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieManagement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  
		driver.get("http://www.cnn.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Set <Cookie> ck = driver.manage().getCookies();
				
		for (Cookie cookie: ck) {
			System.out.println(cookie.getName() + " | " + cookie.getValue());
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("_cb_svref");

	}

}
