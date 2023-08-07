package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeplicatedLead{
	public static void main(String[]args) {
	
		WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\Sowmi\\Downloads\\ChromeBrowser\\115\\chrome-win64\\chrome.exe");
		//launch the chrome browser
		ChromeDriver driver =new ChromeDriver();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ChromeDriver driver1 =new ChromeDriver();
	
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
    
    //check the current page visible is right by comparing
    String text1="View Lead | opentaps CRM";
    String text2=driver1.getTitle();
    System.out.println(text);
    if(text1.equals(text2)) {
    	System.out.println("Matches");
    }
    else {
    	System.out.println("error");
    }
    	//to create duplicate account click duplicate account
        driver1.findElement(By.className("Duplicate Lead")).click();
        
        //clear the account using clear keyword
        driver1.findElement(By.id("createLeadForm_companyName")).clear();
        
        //enter another new input in company name
        driver1.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        
        //clear the first name
        driver1.findElement(By.id("createLeadForm_firstName")).clear();
        
        //enter the new first name
        driver1.findElement(By.id("createLeadForm_firstName")).sendKeys("sowmya");
        
        //click submit button
        driver1.findElement(By.className("smallSubmit")).click();
        
        //check the viewed page matches 
        String text3="View Lead | opentaps CRM";
        String text4=driver.getTitle();
        if(text3.equals(text4)) {
        	System.out.println("Matching");
        }
        else {
        	System.out.println("not matching");

}
}
}