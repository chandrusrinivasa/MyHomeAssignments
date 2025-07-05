package Homeassignment_Week2.day2;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interactions_with_Checkboxes {

	public static void main(String[] args) throws InterruptedException {

		// Intiate the chrome driver with
		ChromeDriver driver = new ChromeDriver();

		// Lauch the borwser of Leaftaps
		driver.get("https://leafground.com/checkbox.xhtml");

		// Maximize the screen
		driver.manage().window().maximize();

		// to load the screen
		Thread.sleep(2000);

		// Click the check box Basic fields
		driver.findElement(By.xpath("(//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"])[1]"))
				.click();

		// Click the check box for Notification
		driver.findElement(By.xpath("(//div[@class=\"ui-selectbooleancheckbox ui-chkbox ui-widget\"])[2]")).click();

		// to load the screen
		Thread.sleep(5000);

		// storage in webelement
		WebElement Nofication = driver.findElement(By.xpath("//div[@class=\"ui-growl-message\"]"));

		// Print in the console
		System.out.println("Notification :" + Nofication.getText());

		// Validation purpose i have used if condition
		if (Nofication.isDisplayed()) {

			// Print the output in the console
			System.out.println("After Click the Ajax checked Message is dispalyed");
		}

		// if if condition it will come else condition
		else {

			// Print the output in the console
			System.out.println("After Click the Ajax checked message is not dispalyed");

		}

		// To load the screen
		Thread.sleep(5000);

		// Click the check box for Choose your favorite language
		driver.findElement(By.xpath("(//div[@class=\"ui-chkbox ui-widget\"])[5]")).click();

		// To load the screen
		Thread.sleep(5000);

		// Click the Tri State Checkbox
		driver.findElement(By.xpath("(//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"])[5]"))
				.click();

		// To load the screen
		Thread.sleep(5000);

		// To will space between line
		System.out.println();

		// Validation the nofiticate message
		String Tri_State = driver.findElement(By.xpath("(//div[@class=\"ui-growl-item\"])[1]")).getText();

		// Print in the console
		System.out.println("Tri State Checkbox :" + Tri_State);

		// To load the screen
		Thread.sleep(5000);

		// Click the Toggle Switch
		driver.findElement(By.xpath("//div[@class=\"ui-toggleswitch-slider\"]")).click();

		// To load the screen
		Thread.sleep(5000);

		// To will space between line
		System.out.println();

		// Validation the Nofication Message
		WebElement Toggle_Switch = driver.findElement(By.xpath("//span[@class=\"ui-growl-title\"]"));

		// Print in console
		System.out.println("State of Toggle Switch : " + Toggle_Switch.getText());

		// Actual result from application
		String Actual = Toggle_Switch.getText();

		// validation the message
		if (Actual.equals("Checked")) {

			// Print the console
			System.out.println("Toggle Switch as be click ");
		}

		// If if condition got falied it will come Else condition
		else {

			// Print the console
			System.out.println("Toggle Switch as not be Click");
		}

		// To will space between line
		System.out.println();

		// Verify if check box is disabled or enabled
		boolean enabled = driver.findElement(By.xpath(
				"//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled\"]"))
				.isEnabled();

		// print in the Console
		System.out.println(enabled);

		// Click the Multpile fields
		driver.findElement(By.xpath(
				"//ul[@class=\"ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all\"]"))
				.click();

		// Search the name
		driver.findElement(
				By.xpath("//input[@class=\"ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all\"]"))
				.sendKeys("Paris");

		// Click the check box
		driver.findElement(By.xpath("(//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"])[8]"))
				.click();

		// Clear the search value
		driver.findElement(By.xpath(
				"//input[@class=\"ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled\"]"))
				.clear();

		// Search the name
		driver.findElement(
				By.xpath("//input[@class=\"ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all\"]"))
				.sendKeys("Brasilia");

		// Click the check box
		driver.findElement(By.xpath("(//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"])[5]"))
				.click();

		// Clear the search value
		driver.findElement(By.xpath(
				"//input[@class=\"ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled\"]"))
				.clear();

		// Search the name
		driver.findElement(
				By.xpath("//input[@class=\"ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all\"]"))
				.sendKeys("London");

		// To load the screen
		Thread.sleep(5000);

		// Click the check box
		driver.findElement(By.xpath("(//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"])[6]"))
				.click();

		// Close the mutliple select value
		driver.findElement(By.xpath("//a[@class=\"ui-selectcheckboxmenu-close ui-corner-all\"]")).click();

		// Close the browser
		driver.close();

		/*
		 * WebElement Drop_downvalue = driver.findElement(By.
		 * xpath("//ul[@class=\"ui-selectcheckboxmenu-items ui-selectcheckboxmenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset\"]"
		 * ));
		 * 
		 * Select select_Element = new Select(Drop_downvalue);
		 * 
		 * List<WebElement> options = select_Element.getOptions();
		 * 
		 * System.out.println(options.size());
		 * 
		 * for(WebElement e :options) {
		 * System.out.println("The value are "+e.getText()); }
		 * 
		 */
	}

}
