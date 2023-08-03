package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ChromeBrowser {
public static void main(String[] args) {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chromedriver-win64\\chromedriver.exe");
	
	WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
	ChromeOptions options=new ChromeOptions();
	options.setBinary("C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chrome-win64\\chrome.exe");
	//launch the chrome browser
	ChromeDriver driver =new ChromeDriver();
	
	//load the application url
	driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		//maximize the browser
		driver.manage().window().maximize();

		//enter the user name as Demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		//enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();

		//print welcome note
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);

		//click on hyper link button
		driver.findElement(By.linkText("CRM/SFA")).click();

		//click on leads tap
		driver.findElement(By.linkText("Leads")).click();

		//click on create lead button
		driver.findElement(By.partialLinkText("Create")).click();

		 //enter the company name
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("cognizant");

		 //Enter the first name
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("soundarya");

		 //enter the last name
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
			
		 //Enter the first name(local)
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sowmya");
			
		 //Enter department field
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
			
		//Enter the description  
		driver.findElement(By.id("createLeadForm_description")).sendKeys("test");

		//Enter the EmailAddress
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("soundarya.n02@gmail.com");
		
		WebElement StateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		//Select the value from dropdown using select class
        Select StateDropDown = new Select(StateDD);
        
      //Select the value from dropdown using visible text
        StateDropDown.selectByVisibleText("Indiana");
        
        //click on create lead button
        driver.findElement(By.name("submitButton")).click();
        
        
        String text1="View Lead | opentaps CRM";
        String text2=driver.getTitle();
        if(text1.equals(text2)) {
        	System.out.println("created successfully");
        }
        else {
        	System.out.println("not successfully");
        }
}
}
        
			
		
				
		
		

		
				
			
			
		 			

			
			

			
			

	

