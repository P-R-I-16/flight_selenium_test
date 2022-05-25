
package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class SearchMMTActivityWithKeyword extends BaseClass {
	@FindBy(xpath = "//*[@id=\"id_country_switcher_continue\"]")
	WebElement continuetoInLink;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		invokeBrowser("chrome");
	}

	@Test
	public void searchActivity() throws InterruptedException {
		System.out.println("search for activity");

		// sets to IN ctry
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div/span[2]/span[1]");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[1]/div[1]/p/span[1]");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[2]/div[2]/p[1]");

		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[1]/div[2]/div[2]/ul/li/div/label");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[1]/button");

		/*
		 * if(BaseClass.isVisble(continuetoInLink)) continuetoInLink.click();
		 */

		Thread.sleep(1500);

		// login
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[3]/div/div[2]");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[2]");

		enterTextById("username", "mmtfullerton123@gmail.com");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button");
		enterTextById("password", "Key@1234");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button");

		// click on activity tab
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[10]/a/span[1]");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[10]/a/span[2]");

		clickElementByXpath("//*[@id=\"activitySearch\"]");
		clickElementByXpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div/div/p[1]");

		// search for activity
		clickElementByXpath("//*[@id=\"search_button\"]");
		Thread.sleep(10000);
		BaseClass.scrollDownToCertainHeight();
		Thread.sleep(1500);
		clickElementByXpath("//*[@id=\"root\"]/div/section[2]/div[2]/section[1]/div/a");
		Thread.sleep(3000);
		enterTextByXpath("//*[@id=\"root\"]/div/section[2]/div[2]/div/div/div[2]/div/div[1]/input", "wa");
		Thread.sleep(3000);

		clickElementByXpath(
				"//*[@id=\"root\"]/div/section[2]/div[2]/div/div/div[2]/div/div[2]/div/a/div/figure/span/img");
		clickElementByXpath("(//div[@class='dropdown css-2b097c-container'])[1]");
		Thread.sleep(1500);
		// sort the list by price
		clickElementByXpath("//div[text()='Price: Low to High']");
		Thread.sleep(5000);
		BaseClass.scrollDown();

		// clickElementByXpath("//*[@id=\"root\"]/div/section[2]/div[2]/section[2]/div[2]/div/div/a[1]/div/div[2]");
		// clickElementByXpath("//button[text()='SELECT PACKAGE']");

		Thread.sleep(10000);
		BaseClass.ScrollToTop();

	}

	//@AfterTest
	public void afterTest() {
		closeBrowser();

	}

}
