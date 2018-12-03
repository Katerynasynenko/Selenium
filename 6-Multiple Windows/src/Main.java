import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Terms']")).click();
		
		Set <String> winID = driver.getWindowHandles();  // put window id to set 
		System.out.println(winID);
		
		Iterator<String> it = winID.iterator(); // getting all id from set and put it to iterator 
		
		String mainWindow = it.next();
		String firstWindow = it.next();
		
		System.out.println(mainWindow);
		
		driver.switchTo().window(firstWindow);
		driver.switchTo().window(mainWindow);

	}

}
