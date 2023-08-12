package facebook.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingFindElementAndFindElements {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		
		//FinElement
		 WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
	    search.sendKeys("AmolMyLove");
	    
	    
	      WebElement link = driver.findElement(By.xpath("//div[@class='middleTop row']//a"));
	     System.out.println("1st get" + link.getText()); 
	     
	      List<WebElement> link1 = driver.findElements(By.xpath("//div[@class='middleTop row']//a"));
	   System.out.println("how many" + link1.size()); 
	   
	   for(WebElement any : link1)
	   {
		   System.out.println("printed"+ any.getText() ); 
	   }
	    
		

		 
	}

}
