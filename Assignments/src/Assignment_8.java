import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("angular");
		System.out.println(driver.findElement(By.id("username")).getAttribute("value"));
		driver.findElement(By.id("password")).sendKeys("password");
		System.out.println(driver.findElement(By.id("password")).getAttribute("value"));
		driver.findElement(By.id("formly_1_input_username_0")).sendKeys("angular");
		System.out.println(driver.findElement(By.id("formly_1_input_username_0")).getAttribute("value"));
		driver.findElement(By.cssSelector(".btn.btn-danger")).click();
		System.out.println(driver.findElement(By.cssSelector("[class='col-xs-offset-2 col-xs-8']>div>p:nth-of-type(1)")).getText());
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.hotwire.com/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver1.findElement(By.id("farefinder-hotel-destination-input")).sendKeys("New York");
		System.out.println(driver1.findElement(By.id("farefinder-hotel-destination-input")).getAttribute("value"));
		driver1.close();
		
		
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("https://www.google.com/");
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] intArray = { "honda","toyota","ford","tesla","bmw" };
		
		for (int i=0; i<intArray.length; i++) {
			driver2.findElement(By.name("q")).sendKeys(intArray[i]);
			driver2.findElement(By.name("q")).sendKeys(Keys.ENTER);
			System.out.println(driver2.findElement(By.id("resultStats")).getText() + " for " + intArray[i]);
			driver2.navigate().back();
		}
		driver1.close();
		

	}

}
