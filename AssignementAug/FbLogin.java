package AssignementAug;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FbLogin {
      public static void main(String[]args) {
    	  //WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
  		//ChromeOptions options=new ChromeOptions();
  		//options.setBinary("C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chrome-win64\\chrome.exe");
  		
  		   //launch the browser
  		   ChromeDriver driver=new ChromeDriver();
  		
  		   //get the application url
  		   driver.get("https://www.facebook.com/");
  		
  		   //maximize the window
  		   driver.manage().window().maximize();
  		
  		   //time duration
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
  	        
  	        //close the browser
  	        driver.close();

      }
}
