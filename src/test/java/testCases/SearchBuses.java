package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import utilities.BaseClass;
public class SearchBuses extends BaseClass{
@BeforeTest
public void beforeTest () throws InterruptedException {
invokeBrowser("chrome");
}

@Test
public void searchBuses() throws InterruptedException{

clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div/span[2]/span[1]");
clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[1]/div[1]/p/span[1]");
clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[2]/div[2]/p[1]");

clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[1]/div[2]/div[2]/ul/li/div/label");
clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]/div[1]/button");
clickElementByXpath("//span[@class='rightArrow pushRight']/../following::div");
enterTextById("username","mmtfullerton123@gmail.com");
Thread.sleep(1500);
clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button");
enterTextById("password","Key@1234");
clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button");
clickElementByXpath("//li[@data-cy='menu_Buses']/a");
Thread.sleep(1500);
clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[6]/a/span[2]");
/*
clickElementByXpath("//input[@type='text']");
Thread.sleep(3000);
clickElementByXpath("//*[@id='fromCity']/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/label/input");
enterTextByXpath("//input[@aria-controls='react-autowhatever-1']", "Delhi");
Thread.sleep(3000);
clickElementByXpath("(//div[@class='calc60'])[1]");
clickElementByXpath("//*[@id='toCity']/div/div[2]/div/div/div[2]/div[1]/div[2]/label");
enterTextByXpath("//input[@aria-controls=\"react-autowhatever-1\"]", "Kanpur, Uttar Pradesh");
Thread.sleep(3000);
clickElementByXpath("(//li[@aria-selected='false'])[1]/div/img");
clickElementByXpath("//*[@id='travelDate']/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[3]/label/input");
clickElementByXpath("//p[text()='9']");
*/

clickElementByXpath("//*[@id=\"search_button\"]");
Thread.sleep(3000);

clickElementByXpath("//*[@id=\"busList\"]/div[1]/div/ul/li[1]/ul/li[2]/div/div[1]/span[2]");
Thread.sleep(3000);
BaseClass.scrollDown();
Thread.sleep(3000);
}

//@AfterTest
public void afterTest() {
closeBrowser();

}
}
