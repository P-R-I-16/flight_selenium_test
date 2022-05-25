package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class SearchOneWayFlight extends BaseClass {
	@FindBy(xpath="//*[@id=\"id_country_switcher_continue\"]")
	WebElement continuetoInLink;
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		invokeBrowser("chrome");
	}

	@Test
	public void bookFlight() throws InterruptedException {
		System.out.println("Search One way flight");

		//set ctry to IN
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div/span[2]/span[1]");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[1]/div[1]/p/span[1]");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[2]/div[2]/p[1]");

		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[1]/div[2]/div[2]/ul/li/div/label");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[1]/button");

		if(BaseClass.isVisble(continuetoInLink))
			continuetoInLink.click();
		
		//Login to app
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[3]/div/div[2]");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[2]");
		enterTextById("username", "mmtfullerton123@gmail.com");
		Thread.sleep(1500);
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button");
		enterTextById("password", "Key@1234");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button");
		
		//click on the flights tab
		clickElementByXpath("//span[@class='chNavIcon appendBottom2 chSprite chFlights active']");
		Thread.sleep(1500);
		
		//enter from and to city information
		clickElementByXpath("//input[@type='text']");
		Thread.sleep(3000);
		clickElementByXpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[1]");
		enterTextByXpath("//input[@aria-controls='react-autowhatever-1']", "Mumbai");
		Thread.sleep(3000);
		clickElementByXpath("(//div[@class='calc60'])[1]");
		enterTextByXpath("//input[@aria-controls=\"react-autowhatever-1\"]", "Delhi");
		Thread.sleep(3000);
		clickElementByXpath("(//li[@aria-selected='false'])[1]/div/img");
		clickElementByXpath("//p[text()='21']");
		clickElementByXpath("//p[text()='23']");
		//click on search button
		clickElementByXpath("//a[text()='Search']");
		Thread.sleep(3000);
		clickElementByXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div[3]/button");
		
		//apply refundable filter
		clickElementByXpath("(//span[@class='filterName' and @title ='Refundable Fares'])[1]/../../span");
		Thread.sleep(3000);
		BaseClass.scrollToBottom();
		Thread.sleep(3000);
	}

	//@AfterTest
	public void afterTest() {
		closeBrowser();

	}

}
