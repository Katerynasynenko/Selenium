import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();   // create the instance from class
		
		driver.get("http://juliemr.github.io/protractor-demo/");
		driver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("6");
		driver.findElement(By.xpath("//*[@ng-model='operator']/option[2]")).click();
		driver.findElement(By.xpath("//*[@id='gobutton']/preceding::input[1]")).sendKeys("3");
		driver.findElement(By.xpath("//*[@ng-model='operator']/following::button")).click();
		
		

	}

}
