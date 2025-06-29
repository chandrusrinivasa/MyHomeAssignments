package Create_Account;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Create_Account_Test_leaf {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		
		EdgeDriver driver = new EdgeDriver();
		
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		
		 driver.findElement(By.partialLinkText("CRM")).click();
		 
		 driver.findElement(By.linkText("Accounts")).click();
		 
		 driver.findElement(By.partialLinkText("Create ")).click();
		 
		 driver.findElement(By.id("accountName")).sendKeys("12367890123");
		 
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 
		 driver.findElement(By.id("numberEmployees")).sendKeys("10");
		 
		 driver.findElement(By.className("inputBox")).sendKeys("LeafTaps");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 System.out.println("Actual Title name :"+ driver.getTitle());
		 
		 String actualtitle = driver.getTitle();
		 
		 if(actualtitle.equals("http://leaftaps.com/crmsfa/control/viewAccount?partyId=14207")) {
			 System.out.println("Display Title is correct :"+actualtitle);
		 }
		 else {
			 System.out.println("Display Title is incorrect :"+actualtitle);
		 }
		 

	}

}
