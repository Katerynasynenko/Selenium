import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();   // create the instance from class
		
		driver.get("http://www.rediff.com/");
		String title = driver.getTitle();
		if(title.contains("Computer")) {
			System.out.println("verified");
		}else {
			System.out.println("not-verified");
		}
		
		driver.close();
		driver.quit();

	}

}
