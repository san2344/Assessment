package Week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.className("xtXmba"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.className("_6WOcW9 _2-K99T")).click();
		
		WebElement price = driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[1]/div/div/div/section[2]/div[3]/div[1]/div[1]"));	
		WebElement price1 = driver.findElement(By.className("_3FdLqY"));
		action.moveToElement(price).clickAndHold(price1).release().build().perform();
	}

}
