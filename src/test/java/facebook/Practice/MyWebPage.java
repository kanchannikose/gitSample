package facebook.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyWebPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kanchan/Desktop/sel.html");
		
		//isDisplayed                     //isEnabled
		 WebElement fname = driver.findElement(By.xpath("//lable[text()='First Name']"));
		System.out.println("Element is displayed  "  + fname.isDisplayed()); //true
		System.out.println("Element is Enabled  "  + fname.isEnabled()); //true
		
	     WebElement lname = driver.findElement(By.xpath("//lable[text()='Last Name']"));
	      System.out.println("Element is displayed"  + lname.isDisplayed());//true
	      System.out.println("Element is Enabled  "  + lname.isEnabled()); //true
	    
		
		
		//isSelected
		
		WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
	     System.out.println(male.isSelected());//false
	     
	      WebElement female = driver.findElement(By.xpath("//input[@value='Female']"));
	     System.out.println(female.isSelected());//false
	     
	     male.click();//male radio is selected
	     System.out.println("male is selected" + male.isSelected());  //true
	     System.out.println("female is selected"  + female.isSelected()); //false
	     
	     female.click(); //female radio is selscted
	     System.out.println("male is selected " + male.isSelected());//false
	     System.out.println("female is selected " + female.isSelected()); //true
	     
	     
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	Thread.sleep(2000);
		WebElement dayList = driver.findElement(By.xpath("//select[@id='day']"));
		dayList.click();
		dayList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		dayList.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		WebElement monthList = driver.findElement(By.id("month"));
		monthList.click();
		monthList.sendKeys(Keys.ARROW_UP);*/
		
		
	      // WebElement emailAddress = driver.findElement(By.xpath("//input[@name='email']"));
	      // System.out.println("the element dispayed : "  + emailAddress.isDisplayed());
	       
	     //  System.out.println("the element enabled is : " + emailAddress.isEnabled());
		
		
		
		
	         
		
		
		
		
		
		
		
}
}