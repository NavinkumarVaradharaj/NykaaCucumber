package com.NykaaCucumber_IPT.base;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseClass {

	public static WebDriver driver;

	public static WebDriver getDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		return driver;
	}

	public static void launchUrl(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static boolean elementDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}

	public static void input(WebElement element, String value) {

		try {
			if (elementDisplayed(element)) {
				element.sendKeys(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickOnElement(WebElement element) {
		try {
			if (elementDisplayed(element)) {
				element.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void screenshot(String name) {

		DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime date = LocalDateTime.now();
		String fileName = date.format(dateFormatted);
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			// File dest = new File(System.getProperty("user.dir") + "\\screenshots\\" +
			// fileName + ".png");
			File dest = new File("D:\\Avadi\\workspace1\\NykaaMaven_IPT\\screenshots\\" + fileName + ".png");

			FileHandler.copy(src, dest);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		try {
			if (elementDisplayed(element)) {

				a.moveToElement(element).build().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dragAndDrop(WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		try {
			if ((elementDisplayed(src)) && (elementDisplayed(dest))) {
				a.dragAndDrop(src, dest).build().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void confirmAlert(WebElement element, String condition) {

		Alert confirm_alert = driver.switchTo().alert();
		if (condition.equalsIgnoreCase("accept")) {
			confirm_alert.accept();
		} else if (condition.equalsIgnoreCase("dismiss")) {
			confirm_alert.dismiss();
		}

	}

	public static void selectFromDropDown(WebElement element, String option, String value) {

		Select s = new Select(element);
		if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("visibleText")) {
			s.selectByVisibleText(value);
		}

	}

	public static void scrollUsingCoordinates(int width, int height) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + width + "," + height + ");");
	}

	public static void frameUsingIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void frameUsingName(String name) {
		driver.switchTo().frame(name);
	}

	public static void frameUsingElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void switchToDefault() {
		driver.switchTo().defaultContent();
	}

	public static void switchToWindow(String windowId) {

		Set<String> all_Id = driver.getWindowHandles();
		for (String id : all_Id) {
			if (id == windowId) {
				driver.switchTo().window(id);
			}
		}
	}
	
	public static void switchWindow(int index) {
		Set<String> all_tab_id = driver.getWindowHandles();
		List<String> tab_id_list = new LinkedList<>(all_tab_id);
		
		driver.switchTo().window(tab_id_list.get(index));
		
	}

//		public static String getWindowId() {
	//
//			Set<String> all_Id = driver.getWindowHandles();
//			Iterator<String> itr = all_Id.iterator();
//			
//			
//			return windowId;
//		}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
