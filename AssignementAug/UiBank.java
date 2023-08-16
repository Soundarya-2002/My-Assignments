package AssignementAug;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {

	public static void main(String[]args) {
		
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//get the url
		driver.get("https://uibank.uipath.com/register-account");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter name
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("SOUNDARYA");
		
		//select tittle
		WebElement Tittle=driver.findElement(By.xpath("//select[@id='title']"));
		Select TittleDD=new Select(Tittle);
		TittleDD.selectByVisibleText("Ms");
		
		//enter initial
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("N");
		
		//enter last name
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Narayanan");
		
		//time duration
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//select gender
		WebElement Gender=driver.findElement(By.xpath("//select[@name='gender']"));
		Select GenderDD=new Select(Gender);
		GenderDD.selectByVisibleText("Female");
		
		//select employment status
		WebElement Emp=driver.findElement(By.xpath("//select[@id='employmentStatus']"));
		Select EmpDD=new Select(Emp);
		EmpDD.selectByVisibleText("Full-time");
		
		//enter name
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Soundarya");
		
		//enter email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sowmya@gmail.com");
		
		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sowmya Sweety");
		
		//close the browser
		driver.close();
		
		}

}
