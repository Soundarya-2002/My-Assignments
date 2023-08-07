package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chrome-win64\\chrome.exe");
		
		//launch the chromebrowserr
		ChromeDriver driver=new ChromeDriver();
		
		//load the url
		driver.get("https://www.leafground.com/input.xhtml");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter the name
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("sowmya");
		
		//clear the description
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).clear();
		
		//enter the city
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("Chennai");
		
		//Verify if text box is disabled
		WebElement disabled=driver.findElement(By.xpath("(//input[@id='j_idt88:j_idt93']"));
		System.out.print(disabled.isEnabled());
		
		//clear the typetext
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		
		//type about yourself
		driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("Myself Soundarya");
		
		//got the  error message
		//driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).
		
		
		//dropdown
	}
}
		
		
		
		
		