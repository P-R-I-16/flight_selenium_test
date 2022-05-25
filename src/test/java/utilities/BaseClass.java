package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public void invokeBrowser(String browserName) throws InterruptedException {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "ie driver path");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1500);
	}

	public void closeBrowser() {
		driver.quit();
	}

	public boolean explicitWaitVisible(By locator) {
		boolean bReturn = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			bReturn = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("breturn:" + bReturn);
		return bReturn;
	}

	public void clickElementByXpath(String xpath) {
		try {
			By locator = By.xpath(xpath);
			if (explicitWaitVisible(locator)) {
				System.out.println("xpath is visible" + xpath);
				driver.findElement(locator).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterTextById(String iD, String textToBeEntered) {
		try {
			By locator = By.id(iD);
			explicitWaitVisible(locator);
			driver.findElement(locator).click();
			driver.findElement(locator).sendKeys(textToBeEntered);
		} catch (Exception e) {
		}
	}

	public void enterTextByClassName(String className, String textToBeEntered) {
		try {
			By locator = By.className(className);
			explicitWaitVisible(locator);
			driver.findElement(locator).click();
			driver.findElement(locator).sendKeys(textToBeEntered);
		} catch (Exception e) {

		}
	}

	public void clickElementByClassName(String className) {
		try {
			By locator = By.className(className);
			explicitWaitVisible(locator);
			driver.findElement(locator).click();
		} catch (Exception e) {

		}
	}

	public void enterTextByXpath(String xpath, String textToBeEntered) {
		try {
			By locator = By.xpath(xpath);
			explicitWaitVisible(locator);
			driver.findElement(locator).click();
			driver.findElement(locator).sendKeys(textToBeEntered);

		} catch (Exception e) {

		}
	}

	public void clickElementById(String iD) {
		try {
			By locator = By.id(iD);
			explicitWaitVisible(locator);
			driver.findElement(locator).click();
		} catch (Exception e) {

		}
	}

	public static void scrollToBottom() throws InterruptedException {
		JavascriptExecutor jsDriver = (JavascriptExecutor) driver;

		try {
			long currentHeight = Long.parseLong(jsDriver.executeScript("return document.body.scrollHeight").toString());

			while (true) {
				jsDriver.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				Thread.sleep(300);

				long newHeight = Long.parseLong(jsDriver.executeScript("return document.body.scrollHeight").toString());

				if (currentHeight == newHeight)
					break;
				currentHeight = newHeight;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void scrollDown() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

	public static void scrollDownToCertainHeight() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

	}

	public static void ScrollTopToCertainHeight() {
		JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
		jsDriver.executeScript("window.scrollTo(-250,0)");
	}

	public static void ScrollToTop() {
		JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
		jsDriver.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}

	public static void scrollToView(WebElement element) {
		JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
		jsDriver.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static boolean isVisble(WebElement element) {
		boolean flag = false;
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		try {
			if (element.isDisplayed()) {
				flag = true;
				System.out.println("Banner is visible");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return flag;

	}

	public List<WebElement> getElementsByXpath (String xpath) {
		List<WebElement> elements = null;
		try {
			By locator = By.xpath(xpath);
			elements = driver.findElements(locator);
			Thread.sleep(2500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return elements;
	}
	public void switchToNewWindow(String parent) {
		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{
			String child_window=I1.next();
		if(!parent.equals(child_window)) {
			driver.switchTo().window(child_window);
			break;
			}
		}
	}
	
	public String getDate(int plusDays) {
		String output = null;
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Using today's date
		c.add(Calendar.DATE, plusDays); // Adding 5 days
		output = sdf.format(c.getTime());
		System.out.println(output);
		} catch (Exception e){
			e.printStackTrace();
		}
		return output;  
		
	}
}
