package testUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass {

	public static WebElement Waiting(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void click(WebElement element) {
		WebElement clk = Waiting(element);
		clk.click();
	}
	
	public static void select(WebElement element, String a) {
		Select obj1 = new Select(element);
		obj1.selectByVisibleText(a);
	}
	
	
}
