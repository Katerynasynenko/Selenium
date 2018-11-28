import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  
		
		driver.get("https://shop.honda.com/");
		String hondaTitle = driver.getTitle();
		driver.get("https://www.ferrari.com/en-US");
		String ferrariTitle = driver.getTitle();
		System.out.println(hondaTitle.substring(0,9) + ferrariTitle.substring(9, 17));
		driver.close();
		driver.quit();
		
		
		

	}

}
