import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();   // create the instance from class
		
		
		//get 
		driver.get("https://www.google.com/");
		driver.get("https://www.amazon.com/");
		
		//navigate
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//getTitle
		String title = driver.getTitle();
		System.out.println(title);
		
		//getCurrentUrl
		String url = driver.getCurrentUrl();
		System.out.println(url);

		//close 
		driver.quit();
}

}
