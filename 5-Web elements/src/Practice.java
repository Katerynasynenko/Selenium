import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.travelocity.com/");
		driver.manage().window().maximize();
		
//		Select s = new Select(driver.findElement(By.id("hotel-rooms-hp-hotel")));
//		List <WebElement> allOptions = s.getOptions();
//		s.selectByValue("2");
//		
//		for(WebElement option:allOptions) {
//			System.out.println(option.getText());
//		}
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> allRadios = driver.findElements(By.className("control-group"));
		System.out.println(allRadios.size());
		
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.visibilityOfAllElements((List<WebElement>) By.className("control-group")));
//				
//		allRadios.get(3).click();
		
		for(WebElement radio:allRadios) {
			System.out.println(radio.getText());
		}
		
	}

}
