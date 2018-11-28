import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.bankofamerica.com/");
		driver.navigate().to("http://www.fanniemae.com/portal/index.html");
		driver.navigate().to("https://www.bcbs.com/");
		driver.navigate().to("https://www.ibm.com/us-en/?lnk=m");
		driver.navigate().to("https://www.mcdonalds.com/us/en-us.html");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().back();
		System.out.println("This is my company: 'http://www.fanniemae.com/portal/index.html'");
		driver.close();
		driver.quit();

	}

}
