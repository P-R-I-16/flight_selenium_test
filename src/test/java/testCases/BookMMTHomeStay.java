package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import utilities.BaseClass;

public class BookMMTHomeStay extends BaseClass {
	@FindBy(xpath="//*[@id=\"id_country_switcher_continue\"]")
	WebElement continuetoInLink;
	//@FindBy(xpath="//*[@id=\"room0\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/a/p]")
	//WebElement selectRoom;
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		invokeBrowser("chrome");
	}


	@Test
	public void SearchHomeStayWithFilter() throws InterruptedException {
		System.out.println("search for homestays above 4.5 rating");

		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div/span[2]/span[1]");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[1]/div[1]/p/span[1]");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[2]/div[2]/p[1]");

		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[1]/div[2]/div[2]/ul/li/div/label");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[1]/button");
//Thread.sleep(1500);
//clickElementByXpath("//*[@id=\"id_country_switcher_continue\"]");
		
		if(BaseClass.isVisble(continuetoInLink))
			continuetoInLink.click();

		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[3]/div/div[2]");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[2]");

		enterTextById("username", "mmtfullerton123@gmail.com");
		Thread.sleep(1500);
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button");
		enterTextById("password", "Key@1234");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[3]/a/span[1]");
		clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[3]/a/span[2]");
		clickElementByXpath("//input[@id=\"city\"]");
		clickElementByXpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div/div/div/p[1]");
		clickElementByXpath("//div[@role='gridcell']");
		
		clickElementByXpath("//div[text()='23']");
		clickElementByXpath("//div[text()='25']");
		//enterTextByXpath("//input[@id=\"city\"]", "Delhi");
		clickElementByXpath("//*[@id=\"hsw_search_button\"]");
		Thread.sleep(10000);
		clickElementByXpath("//*[@id=\"USER_RATING\"]/ul/li[1]/span[1]");
		Thread.sleep(10000);
		clickElementByXpath("//*[@id=\"Listing_hotel_0\"]/a/div/div/div[1]/div[1]/div/div[1]/img");
		//Thread.sleep(10000);
		BaseClass.scrollToBottom();	
		//BaseClass.scrollToView(selectRoom);
	
	//	clickElementByXpath("//a[text()='BOOK THIS NOW']");
		
		//clickElementByXpath("//*[@id=\"room0\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/a");
		
		Thread.sleep(5000);
		//clickElementByXpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/form/div[1]/div[1]/span/label");
		//enterTextById("fName", "Ratinagiri");
		//enterTextById("lName", "R");
	}

	//@AfterTest
	public void afterTest() {
		closeBrowser();

	}



}
