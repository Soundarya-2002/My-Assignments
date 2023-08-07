package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;


public class MailIdLogin {
	public static void main(String[]args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chromedriver-win64\\chromedriver.exe");
		
				WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
				ChromeOptions options=new ChromeOptions();
				options.setBinary("C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chrome-win64\\chrome.exe");
				
				//launch the chromebrowserr
				ChromeDriver driver=new ChromeDriver();
				
			    //load the url
				driver.get("https://acme-test.uipath.com/login");
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//enter the mailId
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kumar.testleaf@gmail.com");
				
				//enter the password
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
				
				//click the login button
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				
				//get the tittle
				String text=driver.getTitle();
				System.out.print(text);
				
				//click on login
				driver.findElement(By.xpath("//a[text()='Log Out']")).click();
				
				//close the browser
				driver.close();
				
				}
	}
