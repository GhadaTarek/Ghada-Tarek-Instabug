package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\H\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:\\www.google.com");
		try {
		boolean LinkStatus = driver.findElement(By.linkText("Google")).isDisplayed();
		
		if(LinkStatus == true) {
			
			System.out.println("Passed.");
		}
		}catch (NoSuchElementException e){
			
			System.out.println("Google Link isnot exist! Failed! ");
			
		}
		
		//Bonus: Assertion on search results
		
		List<WebElement> results = driver.findElements(By.xpath("//*[@id="input"]"));   
		//Get the Total Count
		System.out.println(results.size());
		if(results.size() ==100)
		  {
                      System.out.println("100 REsults are found as Expected");
                  }

                 //display value for each results
                 for(WebElement each : results)
			{
  			     System.out.println(each.getAttribute("href"));
			}
	
		
		driver.close();
		

	}

}
