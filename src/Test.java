import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



/** 
 * @author fuli: 
 * @version 创建时间：2018年1月2日 下午8:40:47 
 * 类说明 
 */
public class Test {
	public static void main(String[] args) {
		
		WebDriver driver = null;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\Users\\fuli\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		options.addArguments("--start-maximized", "allow-running-insecure-content", "--test-type");
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		// driver.get("https://www.betalpha.com/");
		driver.get("http://125.64.36.24:61010/");

		WebElement element = driver.findElement(By.linkText("登录"));
		element.click();


	}

}
