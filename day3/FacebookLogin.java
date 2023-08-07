package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class FacebookLogin {
	public static void main(String[]args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chromedriver-win64\\chromedriver.exe");
		
		WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chrome-win64\\chrome.exe");
		
		//launch the chrome browser
		ChromeDriver driver =new ChromeDriver();
		
		//load the application url
		driver.get("https://www.facebook.com/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
	
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click the create account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//enter the firstname
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Soundarya");
		
		//enter the lastname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("narayanan");
		
		//enter the mobilenumber
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9629261272");
		
		//enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("sowmya");
	
		WebElement DayDropDown = driver.findElement(By.xpath("//select[@id='day']"));
		//Select the value from dropdown using select class
        Select DateOfBirthDropDown = new Select(DayDropDown);
        
        //Select the value from dropdown using visible text
        DateOfBirthDropDown.selectByVisibleText("11");
        
        WebElement MonthDropDown = driver.findElement(By.xpath("//select[@id='month']"));
        //select the value from dropdown using select class
        Select DOBDropDown = new Select(MonthDropDown);
        
        //Select the value from dropdown using visible text
        DOBDropDown.selectByVisibleText("Apr");
        
        WebElement YearDropDown = driver.findElement(By.xpath("//select[@id='year']"));
        //select the value from dropdown using select class
        Select DropDown = new Select(YearDropDown);
        
        //Select the value from dropdown using visible text
        DropDown.selectByVisibleText("2002");
        
        //click the radio button
        driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	}
}