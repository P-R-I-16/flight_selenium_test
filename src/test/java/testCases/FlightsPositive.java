package testCases;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class FlightsPositive extends BaseClass{
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
		enterTextByXpath("//input[@aria-controls='react-autowhatever-1']", "Mumbai");

		clickElementByXpath("(//div[@class='calc60'])[1]");
		
		// select To location
		enterTextByXpath("//input[@aria-controls=\"react-autowhatever-1\"]", "Delhi");

		clickElementByXpath("(//div[@class='calc60'])[1]");
        // clickElementByXpath("(//li[@aria-selected='false'])[1]/div/img");
		
		// select From date
		String fromDate = getDate(1);
		clickElementByXpath("//div[@aria-label='"+fromDate+"']/div");
		String toDate = getDate(7);
		// select To date
		clickElementByXpath("//div[@aria-label='"+toDate+"']/div");
		clickElementByXpath("//a[text()='Search']");
		Thread.sleep(3000);
		
		// sort From date flights
		clickElementByXpath("(//span[text()='Price'])[1]");
		Thread.sleep(2000);
		
		// sort To date flights
		clickElementByXpath("(//span[text()='Price'])[2]");
		Thread.sleep(2000);
		
		
		// Select 1st flight in From date
		clickElementByXpath("((//div[@class='paneView'])[1]/div[2]/div/div/label/div/div[2]/div[2]/span[@class='customRadioBtn'])[1]");

		// Select 1st flight in To date
		clickElementByXpath("((//div[@class='paneView'])[2]/div[2]/div/div/label/div/div[2]/div[2]/span[@class='customRadioBtn'])[1]");
		
		// Click on Book now
		clickElementByXpath("//button[text()='Book Now']");
		
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		
		// Click on Continue button on the pop up
		clickElementByXpath("//button[text()='Continue']");
		Thread.sleep(7000);
		
		// Switch to the new window opened
		switchToNewWindow(parent);
		
		// Click on I do not wish to secure my trip
		scrollDown();
		int elementSize = getElementsByXpath("//span[contains(text(),'I do not wish')]").size();
		if (elementSize > 0) {
			clickElementByXpath("//span[contains(text(),'I do not wish')]");
		}
		
	
		// Click on Add new Adult
		scrollDown();
		clickElementByXpath("//button[contains(text(),'ADD NEW ADULT')]");
		
		//Enter the First name
		enterTextByXpath("//input[@placeholder='First & Middle Name']", "Ratinagiri");
		
		//Enter the Last name
		enterTextByXpath("//input[@placeholder='Last Name']", "Rhamachandran");
		
		// Click on MALE
		clickElementByXpath("//input[@value='MALE']/..");
		
		// Click on Continue button at the bottom
		scrollDown();
		clickElementByXpath("//button[text()='Continue']");
	
		// Click on Confirm button in the pop up
		clickElementByXpath("//button[text()='CONFIRM']");
		
		//click on Yes, please
		clickElementByXpath("//button[text()='Yes, Please']");
		
		// Click on Skip seat selection link at the bottom
		scrollDown();
		//clickElementByXpath("//span[text()='Skip to add-ons']");
		clickElementByXpath("//span[@class='linkText ']");
		
		// Click on Proceed to pay button at the bottom
		scrollDown();
		scrollDown();
		clickElementByXpath("//button[text()='Proceed to pay']");
		Thread.sleep(10000);
		
	}

	@AfterTest
	public void afterTest() {
		closeBrowser();
		
	}
}
