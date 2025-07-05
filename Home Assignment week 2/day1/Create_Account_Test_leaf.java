package Homeassignment_Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Create_Account_Test_leaf {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		
		//Getting new instance of the EdgeDriver
		EdgeDriver driver = new EdgeDriver();
		
		//Launching browsher Testleaf
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		//Maximize browser window
		 driver.manage().window().maximize();
		 
		 //Pass input value of username
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 
		 //Pass input value of Password
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 
		 //click the login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		//Click the CRM/SFA Link
		 driver.findElement(By.partialLinkText("CRM")).click();
		 
		//Click the Account element
		 driver.findElement(By.linkText("Accounts")).click();
		 
		//Click the create account element
		 driver.findElement(By.partialLinkText("Create ")).click();
		 
		 //Pass input value in Accountname
		 driver.findElement(By.id("accountName")).sendKeys("12367890123");
		 
		 //Pass input value in Description
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 
		//Pass input value in Number employees
		 driver.findElement(By.id("numberEmployees")).sendKeys("10");
		 
		 //Pass input vlaue in Tile
		 driver.findElement(By.className("inputBox")).sendKeys("LeafTaps");
		 
		//click the create account button
		 driver.findElement(By.className("smallSubmit")).click();
		 
		//Print the title in console
		 System.out.println("Actual Title name :"+ driver.getTitle());
		 
		 //Store get title into local variable
		 String actualtitle = driver.getTitle();
		 
		//verify the get title
		 if(actualtitle.equals("http://leaftaps.com/crmsfa/control/viewAccount?partyId=14207")) {
			 
		// if actual tile and expected title is correct it will print console	 
			 System.out.println("Display Title is correct ");
		 }
		 else {
		
		//if actual tile and expected title is incoorect it will print console
			 System.out.println("Display Title is incorrect :");
		 }
		 
		//close the browser
		 driver.close();
		 

	}

}
