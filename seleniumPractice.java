package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumPractice {

	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parih\\Desktop\\Training Testing\\selenium pre\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().fullscreen();;
		driver.findElementByXPath("//*[@id='post-body-3077692503353518311']/div/div/div[3]/input").sendKeys("Bhupender");;
		driver.findElementByXPath("//*[@id='post-body-3077692503353518311']/div/div/div[6]/input").sendKeys("Parihar");;
		driver.findElementByXPath("//*[@id='sex-0']").click();;
		driver.findElementByXPath("//*[@id='exp-0']").click();;
		driver.findElementByXPath("//*[@id='datepicker']").sendKeys("21 feb 2021");;
		driver.findElementByXPath("//*[@id='profession-1']").click();;
		driver.findElementByXPath("//*[@id='tool-2']").click();;
		
		Select selectobj = new Select(driver.findElementByXPath("//*[@id='continents']"));
		selectobj.selectByIndex(3);
		
		Select selectmultiobj = new Select(driver.findElementByXPath("//*[@id='selenium_commands']"));
		selectmultiobj.selectByIndex(1);
		selectmultiobj.selectByIndex(2);
		
		driver.findElementByXPath("//*[@id='photo']").sendKeys("C:\\Users\\parih\\Desktop\\cover.png");;;
		//driver.findElementByXPath("//*[@id='post-body-3077692503353518311']/div/div/div[29]/div[2]/div/a").click();;
		driver.findElementByXPath("//*[@id='submit']").click();;
	}
}
