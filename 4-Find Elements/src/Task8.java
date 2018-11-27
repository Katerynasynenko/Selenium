import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  
		driver.get("https://abcnews.go.com/");
		driver.manage().window().maximize();
		
		WebElement box = driver.findElement(By.cssSelector("#leadoff>article:nth-of-type(2)>ul"));
		List <WebElement> links = box.findElements(By.tagName("li"));
		
		for (int i=0; i<links.size(); i++) {
			links.get(i).click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.navigate().back();
			box = driver.findElement(By.cssSelector("#leadoff>article:nth-of-type(2)>ul"));
			links = box.findElements(By.tagName("li"));
		}

	}

}
