package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class FlightsNegative extends BaseClass{
	@BeforeTest
	public void beforeTest () throws InterruptedException {
		invokeBrowser("safari");
		}
	
	@Test
	public void bookFlight() throws InterruptedException{

		// Login
		clickElementByXpath("//span[@class='rightArrow pushRight']/../following::div");
		enterTextById("username","mmtfullerton123@gmail.com");

		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button");
		enterTextById("password","Key@1234");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button");
		clickElementByXpath("//span[@class='chNavIcon appendBottom2 chSprite chFlights active']");
		clickElementByXpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]");
		clickElementByXpath("//input[@type='text']");
		
		// select From location
		enterTextByXpath("//input[@aria-controls='react-autowhatever-1']", "Delhi");

		clickElementByXpath("(//div[@class='calc60'])[1]");
		
		// select To location
		enterTextByXpath("//input[@aria-controls=\"react-autowhatever-1\"]", "Delhi");

		clickElementByXpath("(//div[@class='calc60'])[1]");
        // clickElementByXpath("(//li[@aria-selected='false'])[1]/div/img");
		
		//
		int elementSize = getElementsByXpath("//span[text()='From & To airports cannot be the same']").size();
		if (elementSize > 0) {
			System.out.println("From and To locations cannot be the same. Please select a different destination.");
		}

		
		
	}

	@AfterTest
	public void afterTest() {
		closeBrowser();
		
	}
}
