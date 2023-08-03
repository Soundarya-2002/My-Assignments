package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chrome-win64\\chrome.exe");
		
		//Launching the chrome
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximizes the window
		driver.manage().window().maximize();
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//enter password
	    driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	    
	    //click the login button
        driver.findElement(By.className("decorativeSubmit")).click();
        
        //Check whether we are the page is correct using the text over there and print it
        String text=driver.findElement(By.tagName("h2")).getText();
        System.out.println(text);
        
        //click crm/sfa button
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        //click leads
        driver.findElement(By.linkText("Leads")).click();
        
        //create leads 
        driver.findElement(By.partialLinkText("Create")).click();
        
       //enter the company name
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("cognizant");
       
    //enter the first name
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("soundarya");
    
    //enter the last name
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
    
    //enter the departmentname
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Tester");
    
    //enter the description
    driver.findElement(By.id("createLeadForm_description")).sendKeys(" Testing");
    
    //enter the email id
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("soundarya.narayanan02@gmail.com");
    
    //select the state using drop down with the help of Select keyword
    WebElement StateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
    
    //create an object to select the state
    Select StateDropDown = new Select(StateDD);
    StateDropDown.selectByVisibleText("Indiana");
    
    //click submit button
    driver.findElement(By.name("submitButton")).click();
    
    //Editing the Lead, click on edit link
    driver.findElement(By.linkText("Edit")).click();
    
    //clear the description
    driver.findElement(By.id("updateLeadForm_description")).clear();
    
    //add inputs in important note
    driver.findElement(By.name("importantNote")).sendKeys("Good Knowledge in Manual Testing and Automation Testing");
    
    //submit using the submit button
    driver.findElement(By.name("submitButton")).click();
    
    //check the page opened is right by comparing
    String text1="View Lead | opentaps CRM";
    String text2=driver.getTitle();
    if(text1.equals(text2)) {
    	System.out.println("created successfully");
    }
    else {
    	System.out.println("created not successfully");
    }      
}
}
