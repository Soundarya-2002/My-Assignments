package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonShopping {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chrome-win64\\chrome.exe");
		
		//launch the Chrome browser
		ChromeDriver driver =new ChromeDriver();
		
		//load the application url
		driver.get("https://www.amazon.in/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
	   //time duraiton
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	   //enter the bag in the SearchBox field
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
	   
	   //select the value bags for boys
	   driver.findElement(By.xpath(" //span[text()=' for boys']")).click();
	   
	   WebElement Bag =driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
	   String Results=Bag.getText();
	   System.out.println("Total No of Results: "+Results);
	   
	   //select the brand ADISA
	   driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
	   
	   //select the brand 
	   driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
	   
	   //click the (sort)
	   driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
	   
	   //click the newArrivals
	   driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	   
	  //print the first resulting bag info(name)
	   WebElement name=driver.findElement(By.xpath("(//span[text()='Safari'])[1]"));
	   String BagInfoName=name.getText();
	   System.out.println("First resulting BagInfoName:" +BagInfoName);
	   
	  //print the first resulting bag info(discount)
	   WebElement discount=driver.findElement(By.xpath("//span[text()='(76% off)']"));
	   String BagInfoDiscount=discount.getText();
	   System.out.println("First resulting BagInfoDiscount:" +BagInfoDiscount);
	   
	   //get the tittle
		String text=driver.getTitle();
		System.out.println("Page Tittle:"+text);
	   
		 driver.close();
		
	}
} 
	   
	   
	   
	   
	   
	    
	   
	   
	  
