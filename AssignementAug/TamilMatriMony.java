package AssignementAug;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TamilMatriMony {
	public static void main(String[]args) {
		
 		        //launch the browser
 		        ChromeDriver driver = new ChromeDriver();
 		        
 		        //get the application url
 				driver.get("https://www.tamilmatrimony.in/");
 				
 				//maximize the window
 				driver.manage().window().maximize();
 				
 				//time duration
 				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 				
 				//select matrimony profile for
 				WebElement profile=driver.findElement( By.xpath("//select[@id='REGISTERED_BY']"));
 				Select profileDropDown=new Select(profile);
 				profileDropDown.selectByVisibleText("Myself");
 				
 				//enter the name
 				driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Soundarya");
 				
 				//click on female
 				driver.findElement(By.xpath("//input[@id='genderfemale']")).click();
 				
 				//click on date 
 				WebElement DropDown=driver.findElement(By.xpath("//select[@id='DOBDAY']"));
 				Select DayDropDown=new Select(DropDown);
 				DayDropDown.selectByVisibleText("11");
 				
 				WebElement DD=driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
 				Select MonthDropDown=new Select(DD);
 				MonthDropDown.selectByVisibleText("Apr");
 				
 				WebElement DroDow=driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
 				Select YearDropDown=new Select(DroDow);
 				YearDropDown.selectByVisibleText("2002");
 				
 				//select the religion
 				WebElement Religion=driver.findElement(By.xpath("//select[@id='RELIGION']"));
 				Select ReligionDropDown=new Select(Religion);
 				ReligionDropDown.selectByVisibleText("Hindu");
 				
 				//select the MotherTongue
 				WebElement MotherTongue=driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
 				Select MotherTongueDD=new Select(MotherTongue);
 				MotherTongueDD.selectByVisibleText("Tamil");
 				
 				//select the cast
 				WebElement Caste=driver.findElement(By.xpath("//select[@id='CASTE_NORMAL']"));
 				Select CastDropDown=new Select(Caste);
 				CastDropDown.selectByVisibleText("Don't wish to specify");
 				
 				//select the country
 				WebElement Country=driver.findElement(By.xpath("//select[@name='COUNTRY']"));
 				Select CountryDD=new Select(Country);
 				CountryDD.selectByVisibleText("India");
 				
 				//select country code
 				WebElement Code=driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
 				Select CodeDD=new Select(Code);
 				CodeDD.selectByVisibleText("+91");
 				
 				//enter the phoneno
 				driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9629261272");
 				
 				//enter email
 				driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("sowmya@gmail.com");
 				
 				//close the browser
 				driver.close();
		
	}

}
