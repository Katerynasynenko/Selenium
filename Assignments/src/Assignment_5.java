import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("angular");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='formly_1_input_username_0']")).sendKeys("angular");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		driver.quit();
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//form[@name='loginform']/div/div[2]/input")).sendKeys("Mike");
		driver.findElement(By.xpath("//img[@id='fill_metric']/parent::*/div/div[4]/input")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		driver.quit();

	}

}
