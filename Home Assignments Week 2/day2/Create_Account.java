package Homeassignment_Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Create_Account {

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

		// Click the create account tab
		driver.findElement(By.linkText("Create Account")).click();

		// Pass the Account name
		driver.findElement(By.xpath("(//input[@name=\"accountName\"])[2]")).sendKeys("12345678987701234569879651234");

		// Pass the Description
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Selenium Automation Tester");

		// Select the value i drop down
		WebElement Industry = driver.findElement(By.xpath("//select[@name=\"industryEnumId\"]"));

		// By using select method i need to get the data
		Select computer = new Select(Industry);

		// By using select method the passed visible text value
		computer.selectByVisibleText("Computer Software");

		// Select the value i drop down
		WebElement ownership = driver.findElement(By.xpath("//select[@name=\"ownershipEnumId\"]"));

		// By using select method i need to get the data
		Select Corporation = new Select(ownership);

		// By using select method the passed visible text value
		Corporation.selectByVisibleText("S-Corporation");

		// Select the value i drop down
		WebElement Source = driver.findElement(By.xpath("//select[@name=\"dataSourceId\"]"));

		// By using select method i need to get the data
		Select employee = new Select(Source);

		// By using select method the passed selectbyvalue
		employee.selectByValue("LEAD_EMPLOYEE");

		// Select the value i drop down
		WebElement Marketing_Campaign = driver.findElement(By.xpath("//select[@name=\"marketingCampaignId\"]"));

		// By using select method i need to get the data
		Select ecommerce = new Select(Marketing_Campaign);

		// By using select method the passed selectbyindex
		ecommerce.selectByIndex(6);

		// Select the value i drop down
		WebElement State_pro = driver.findElement(By.xpath("//select[@name=\"generalStateProvinceGeoId\"]"));

		// By using select method i need to get the data
		Select texas = new Select(State_pro);

		// By using select method the passed selectbyvalue
		texas.selectByValue("TX");

		// click the create button
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();

		// Validation the Account name
		WebElement actual = driver.findElement(By.xpath("(//span[@class=\"tabletext\"])[3]"));

		// Actual account name
		String ActulaAccountName = actual.getText();

		// Expected account name
		String ExpectedAccountName = "c (14897)";

		// Print in the console
		System.out.println(ActulaAccountName);

		// By using if condition we are validation value
		if (ActulaAccountName.contains(ExpectedAccountName)) {

			// If if conditon passed then it print in console
			System.out.println("Account Name Correct");
		}

		// If if condition then it will come to Else condition
		else {

			// If else conditon passed then it print in console
			System.out.println("Account Nmae inCorrect");
		}

		// Close the browser
		driver.close();
	}

}
