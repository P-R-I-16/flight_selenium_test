package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import utilities.BaseClass;
public class SearchTrain extends BaseClass{
    @BeforeTest
    public void beforeTest () throws InterruptedException {
        invokeBrowser("chrome");
        }
    
    

@Test
public void searchTrains() throws InterruptedException{

        clickElementByXpath("//span[@class='rightArrow pushRight']/../following::div");
        enterTextById("username","mmtfullerton123@gmail.com");
        Thread.sleep(1500);
        clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button");
        enterTextById("password","Key@1234");
        clickElementByXpath("//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[5]/a");
        clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[5]");
        Thread.sleep(1500);
        clickElementByXpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[5]/a/span[2]");
        clickElementByXpath("//input[@type='text']");
        Thread.sleep(3000);
        clickElementByXpath("//*[@id='fromCity']/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label");
        enterTextByXpath("//input[@aria-controls='react-autowhatever-1']", "Mumbai");
        Thread.sleep(3000);
        clickElementByXpath("(//div[@class='calc60'])[1]");
        clickElementByXpath("//*[@id='toCity']/div/div[2]/div/div/div/div[2]/div[1]/div[2]/label");
        enterTextByXpath("//input[@aria-controls=\"react-autowhatever-1\"]", "Chennai");
        Thread.sleep(3000);
        clickElementByXpath("(//li[@aria-selected='false'])[1]/div/img");
        clickElementByXpath("//*[@id='travelDate']/div/div[2]/div/div/div/div[2]/div[1]/div[3]/label");
        clickElementByXpath("//p[text()='9']");
        clickElementByXpath("//*[@id='class']/div/div[2]/div/div/div/div[2]/div[1]/div[4]/label");
        enterTextByXpath("//input[@aria-controls=\"react-autowhatever-1\"]", "All");
        clickElementByXpath("//a[text()='Search']");
        Thread.sleep(3000);
        
        
        
        
}
        

        //@AfterTest
        public void afterTest() {
            closeBrowser();
            
        }
    }