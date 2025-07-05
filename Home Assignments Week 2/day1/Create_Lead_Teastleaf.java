package Homeassignment_Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Create_Lead_Teastleaf {

	public static void main(String[] args) {
		
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("guest");
		
		//ChromeDriver driver = new ChromeDriver(option);
		//Getting new instance of the EdgeDriver
		EdgeDriver driver = new EdgeDriver();
		
		//Maximize browser window
		driver.manage().window().maximize();
		
		//Launching browsher Testleaf
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Pass input value of username
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 
		 //Pass input value of Password
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 
		 //click the login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Click the CRM/SFA Link
		 driver.findElement(By.partialLinkText("CRM")).click();
		 
		 //Click the Leads element
		 driver.findElement(By.linkText("Leads")).click();
		 
		 //Click the to create account in tlead
		 driver.findElement(By.partialLinkText("Create ")).click();
		 
		 //Pass input value of firstname
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chandrusrinivasan");
 
		 //Pass input value of lastName
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sri");
	
		 //Pass input value of Companyname
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 
		 //Pass input value of title
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Testing");

		 //click the create lead button
		 driver.findElement(By.className("smallSubmit")).click();
		 
         //Print the title in console
		 System.out.println("Actual Title name :"+ driver.getTitle());
		 
		 //Store get title into local variable
		 String actualtitle = driver.getTitle();
		 
		 //verify the get title 
		 if(actualtitle.equals("http://leaftaps.com/crmsfa/control/viewLead?partyId=14210")) {
		  
		 // if actual tile and expected title is correct it will print console
			 System.out.println("Display Title is correct ");
		 }
		 else {
		
		//if actual tile and expected title is incoorect it will print console
			 System.out.println("Display Title is incorrect");
		 }
		 //close the browser
		 driver.close();
	}

}
