package Homeassignment_Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Edit_Lead {

	public static void main(String[] args) {

		// Chorme options to avoid pop up regarss to chrome
		ChromeOptions option = new ChromeOptions();

		// so we are used Guest user
		option.addArguments("guest");

		// Intiate the chrome driver with option
		ChromeDriver driver = new ChromeDriver(option);

		// Lauch the borwser of Leaftaps
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the screen
		driver.manage().window().maximize();

		// Pass input value of username
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demosalesmanager");

		// Pass input value of Password
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");

		// click the login button
		driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();

		// Click the CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();

		// Click the Leads furture
		driver.findElement(By.linkText("Leads")).click();

		// Click the Create Lead tab
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter the Company Name
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("TestLeaf");

		// Enter the First Name
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Chandru");

		// Enter the Last Name
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("Sri");

		// Enter the First Name local
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("Chandru");

		// Enter the Department Name
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_departmentName\"]")).sendKeys("Testing Filed");

		// Enter the Primary Email
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryEmail\"]"))
				.sendKeys("chandru.srinivasan98@gmail.com");

		// Enter the Address
		driver.findElement(By.xpath("//textarea[@id=\"createLeadForm_description\"]"))
				.sendKeys("Pillayar Kovil Thottam, Lakshmi Nager");

		// enter the State province in the drop down value - New york
		WebElement State_Province = driver
				.findElement(By.xpath("//select[@id=\"createLeadForm_generalStateProvinceGeoId\"]"));
		Select New_York = new Select(State_Province);
		New_York.selectByVisibleText("New York");

		// Click the create button
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();

		// Click the edit button
		driver.findElement(By.linkText("Edit")).click();

		// Clear the description details and passed the value
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).clear();

		// Clear the company name
		WebElement Company = driver.findElement(By.xpath("//input[@id=\"updateLeadForm_companyName\"]"));

		// so i have used the clear method
		Company.clear();

		// passed the value for Company name
		Company.sendKeys("Test Purpose");

		// clear the first name
		WebElement First_name = driver.findElement(By.xpath("//input[@id=\"updateLeadForm_firstName\"]"));

		// So i have used the clear method
		First_name.clear();

		// passed the value for first name
		First_name.sendKeys("Demo Test");

		// clear the last name
		WebElement Last_Name = driver.findElement(By.xpath("//input[@id=\"updateLeadForm_lastName\"]"));

		// So i have used the clear method
		Last_Name.clear();

		// Passed the value for last name
		Last_Name.sendKeys("Update");

		// Click the update button to update the data
		driver.findElement(By.xpath("(//input[@name=\"submitButton\"])[1]")).click();

		// Print the title detials in consule
		System.out.println(driver.getTitle());

		// Close the Browser
		driver.close();

	}

}
