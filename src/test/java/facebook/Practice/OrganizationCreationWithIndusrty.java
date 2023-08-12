package facebook.Practice;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrganizationCreationWithIndusrty {

	public static void main(String[] args) {
		

		Random ran = new Random();
		int random = ran.nextInt(1000);
		// TODO Auto-generated method stub
	
		//Step1: launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888/"); 
		
		//step2: loin to application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
       
		//step3: click on organization link
		driver.findElement(By.linkText("Organizations")).click();
		
		//step4: click on organization look up image
		 driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		 
		 //step5: create organization with mandatory field
		 driver.findElement(By.name("accountname")).sendKeys("landMark"+ran);
	}

}

