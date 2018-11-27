import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  
		driver.get("https://www.cnn.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			if(link.isDisplayed()) {
				System.out.println(link.getText());
			}
		}
		
//		System.out.println(links.size());
//		
//		String linkText = links.get(9).getText();
//		System.out.println(linkText);
//		
//		links.get(9).click();
		
		
		
		
		
		
		// Task 7 
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();  
//		driver.get("https://www.etsy.com/market/etcy");
//		driver.manage().window().maximize();
//		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		
//		for (int i=0; i<links.size(); i++) {   // (WebElement link:links) 
//			if(links.get(i).getText().equals("Clothing & Shoes")) {
//				links.get(i).click();
//			}
//		}
		
		
		
		
		
		

	}

}
