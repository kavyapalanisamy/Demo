import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.sun.tools.classfile.StackMapTable_attribute.same_frame;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "WebDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver1= new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in/");
		List<WebElement> Options= driver.findElements(By.xpath("//select[@name='url']"));
		for(WebElement Option : Options)
		{
			System.out.println(Option.getText());
		}
		driver.close();
		System.out.println();
		
		
	}
	

}
