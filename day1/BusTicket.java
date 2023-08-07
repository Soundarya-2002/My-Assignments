package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BusTicket {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chrome-win64\\chrome.exe");
		
		//launch the chrome browser
		ChromeDriver driver =new ChromeDriver();
		
		//load the application url
		driver.get("https://www.abhibus.com/");
		
		//maximize the browser
		driver.manage().window().maximize();
				
			
		//time duration
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click the bus
		driver.findElement(By.xpath("//a[@id='pills-home-tab']")).click();
	
		driver.findElement(By.id("source")).sendKeys("Chennai");
		
		//Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		//Type "Bangalore" in the TO text box
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		
		//Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		//Select tomorrow's date in the Date field
		driver.findElement(By.id("datepicker1")).click();
		
		driver.findElement(By.xpath("//a[text()='5']")).click();
		// Click Search Buses
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		//Print the name of the first resulting bus (use .getText())
		WebElement name=driver.findElement(By.xpath("//h2[@title='Yolo Bus']"));
		name.click();
		String name1=name.getText();
		System.out.println("name of first resulting bus "+name1);
		
	    //Choose SLEEPER in the left menu from Bus Type
	    driver.findElement(By.id("Bustypes4")).click();
	  
	    //Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
	     WebElement name2=driver.findElement(By.xpath("//p[text()='15 Seats Available']"));
		name2.click();
		String name3=name2.getText();
		System.out.println("name of first resulting bus seat: "+name3);
		
		//Click SelectSeat
		driver.findElement(By.className("book")).click();
		
		//Choose any one Available seat
		driver.findElement(By.className("pillow")).click();
				
		//Print Seats Selected ,Total Fare
		WebElement seat=driver.findElement(By.id("seatnos"));
		seat.click();
		String seat1=seat.getText();
		WebElement fare=driver.findElement(By.id("ticketfare"));
		fare.click();
		String fare1=fare.getText();
		System.out.println("seat selected:"+seat1+"fare:"+fare1);
		//Select Boarding Point  and Dropping Point
		// Get the Title of the page(use .getTitle())
		// Close the browser
		driver.close();
     }
}

			
		
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	