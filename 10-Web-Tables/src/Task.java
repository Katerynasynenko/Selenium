import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinen\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testingpool.com/data-types-in-java/");
		driver.manage().window().maximize();
		
		List <WebElement> tablerow = driver.findElements(By.xpath("//*[@id=\"page\"]/div/div/div/section/div[2]/article/div/div[2]/div[1]/div[1]/div[1]/table/tbody/tr"));
		System.out.println("Total table rows: " + tablerow.size());
		
		List <WebElement> columns = driver.findElements(By.xpath("//*[@id=\"page\"]/div/div/div/section/div[2]/article/div/div[2]/div[1]/div[1]/div[1]/table/tbody/tr[1]/td"));
		System.out.println("Total columns: " + columns.size());
		
		String a= driver.findElement(By.xpath("//*[@class='su-table']/table/tbody/tr[2]/td[3]")).getText();
		System.out.println(a);
		
		String b= driver.findElement(By.xpath("//*[@class='su-table']/table/tbody/tr[6]/td[1]")).getText();
		System.out.println(b);

	}

}
