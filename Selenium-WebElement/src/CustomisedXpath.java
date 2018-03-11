import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CustomisedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://selenium-2.53.0//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://techno-geek.co.uk/callmycab/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='navbar']/ul/li[1]/a/nav/span[2]")).click();
		
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("YAYA");
		
		//driver.close();
	}

}
