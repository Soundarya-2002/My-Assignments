package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chrome-win64\\chrome.exe");
		
	//launch the chrome browser
   ChromeDriver driver =new ChromeDriver();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//Maximizes the window
	driver.manage().window().maximize();
	
	//enter username
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
	//enter password
    driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
    
    //click the login button
    driver.findElement(By.className("decorativeSubmit")).click();
    String text=driver.findElement(By.tagName("h2")).getText();
    System.out.println(text);
    
    //click crm/sfa button
    driver.findElement(By.linkText("CRM/SFA")).click();
    
    //click leads
    driver.findElement(By.linkText("Leads")).click();
    
    //click find
    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
    
    //time durarion
    Thread.sleep(5000);
    
    //click email
    driver.findElement(By.xpath("//span[text()='Email']")).click();
    
    //Enter EmailId
    driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("soundarya.narayanan02@gmail.com");
    
  //time durarion
    Thread.sleep(5000);
    
    //Click find leads button
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    
     //time durarion
    Thread.sleep(5000);
    
    //10830 click first resulting lead
    driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
    
    //click delete
    //driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
    
    //time durarion
    Thread.sleep(5000);
    
    //click find leads
    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
    
     //enter lead id
    driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10830");
    
    //Click find leads button
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    
    //Verify message "No records to display"
    String text1="No records to display";
    String text2=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
    //System.out.println(X);
    //String text2=X.getText();
    System.out.println(text2);
    if(text1.equals(text2)){
    	System.out.println("pass");
    }
   else {
      System.out.println("fail");

	
	 
      }
	}
}

    
    
    
    
    
    
    
    
    
    
    
  