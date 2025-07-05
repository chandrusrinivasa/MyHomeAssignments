package Homeassignment_Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Delete_Lead {

	public static void main(String[] args) throws InterruptedException {

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

		// Click the Find Leads
		driver.findElement(By.linkText("Find Leads")).click();

		// to lodaing broswer so i have used Thread sleep
		Thread.sleep(5000);

		// Click on the "Phone" tab
		driver.findElement(By.xpath("(//span[@class=\"x-tab-strip-text \"])[2]")).click();

		// Enter the PhoneArea code
		driver.findElement(By.xpath("//input[@name=\"phoneAreaCode\"]")).sendKeys("316");

		// Enter the PhoneNumber
		driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("123456789");

		// Click the Find lead button
		driver.findElement(By.xpath("(//button[@class=\"x-btn-text\"])[7]")).click();

		// to lodaing broswer so i have used Thread sleep
		Thread.sleep(5000);

		// click the Lead id
		driver.findElement(By.linkText("14738")).click();

		// to lodaing broswer so i have used Thread sleep
		Thread.sleep(5000);

		// Deleted the lead details in view lead
		driver.findElement(By.xpath("//a[@class=\"subMenuButtonDangerous\"]")).click();

		// to lodaing broswer so i have used Thread sleep
		Thread.sleep(5000);

		// click the Finds leads tab
		driver.findElement(By.linkText("Find Leads")).click();

		// to lodaing broswer so i have used Thread sleep
		Thread.sleep(5000);

		// passed the value into Lead Id
		driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys("14738");

		// to lodaing broswer so i have used Thread sleep
		Thread.sleep(5000);

		// Click the Find Leads button
		driver.findElement(By.linkText("Find Leads")).click();

		// to lodaing broswer so i have used Thread sleep
		Thread.sleep(5000);

		// Validation actual result dispalyed in screen
		WebElement Actualresult = driver.findElement(By.xpath("//div[@class=\"x-paging-info\"]"));

		// Print the Actualresult in console
		System.out.println(Actualresult.getText());

		// to lodaing broswer so i have used Thread sleep
		Thread.sleep(5000);

		// Expected result should displayed in screen
		String Expectedresult = "No records to display";

		// check by using if condition
		if (Actualresult.equals(Expectedresult)) {

			// Print in Console
			System.out.println("Records as been deleted sucessfully");

		}
		// If if conditon then it come to Else condition
		else {
			// Print in Console
			System.out.println("Records is not deleted");
		}
		// Close thr browser
		driver.close();

	}

}
