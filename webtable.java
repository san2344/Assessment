package Week3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

	    
	    List<WebElement> tablerow = driver.findElements(By.xpath("//table//tbody//th"));
		for (int i = 0; i <3; i++) {
			System.out.println("display the table title" + tablerow.get(i).getText());
		}
		
		
		List<WebElement> rowtext = driver.findElements(By.xpath("//table//tbody//td"));
		for (int i = 0; i < 18; i++) {
			System.out.println("display the table value" + rowtext.get(i).getText());

		}
	    
	}

}
