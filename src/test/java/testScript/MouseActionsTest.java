package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Actions action= new Actions(driver);
		
		driver.get("https://demo.opencart.com/");
		WebElement srcBox= driver.findElement(By.name("Search"));
		action.contextClick(srcBox).perform();
        
	}

}
