package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Xpath {
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chrome-win64\\chrome.exe");
	
		
		//launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//load the application url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter the username as demosalesmanager
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemosalesManager");
		
		//enter the password as crmsfa
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//incase multiple matches in this code we can use Index based attribute
		//driver.findElement(By.xpath("(//input[text()='Login']")[2]
		
		//click the login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//click crmsfa hyperlink
	    driver.findElement(By.xpath("//a[contains(@class, 'CRM')]")).click();
		
	    //enter the duration time
	    
		
		
	}
	
	
	
	
	

}
