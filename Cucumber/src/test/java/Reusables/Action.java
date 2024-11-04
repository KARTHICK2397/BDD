package Reusables;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {

	public static void click(WebElement elem) {

		elem.click();

	}

	public static void explicit_Wait(WebElement elem, int exp_time, WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(exp_time));
		wait.until(ExpectedConditions.elementToBeClickable(elem));

	}

	public static void sendInput(WebElement search_box_click, String input) {
		search_box_click.clear();
		search_box_click.sendKeys(input);

	}
	

	public static void sendInputForExcelNumbers(WebElement search_box_click, String input) {
		float f=Float.parseFloat(input);  
		int g = (int)Math.round(f);
		String s=String.valueOf(g);  
		search_box_click.clear();
		search_box_click.sendKeys(s);

	}

	public static void scrollTillElement(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void selectByVisibleText(WebElement element, String Argument) {

		Select S = new Select(element);

		S.selectByVisibleText(Argument);

	}

	public static void selectByValue(WebElement element, String Argument) {

		Select S = new Select(element);

		S.selectByVisibleText(Argument);

	}
	
	
	public static void selectByDiv(WebElement element) {

		element.click();

	}

	public static boolean isDisplayeD(WebElement element) {

		if (element.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public static void multipleWindowHandling(WebDriver driver, String p_or_c) {

		Set<String> windows = driver.getWindowHandles();

		List<String> L = new ArrayList<String>(windows);

		String parent = L.get(0);
		String child = L.get(1);

		if (p_or_c.equals("child")) {
			driver.switchTo().window(child);
		} else if (p_or_c.equals("parent")) {
			driver.switchTo().window(parent);
		}

	}
}
