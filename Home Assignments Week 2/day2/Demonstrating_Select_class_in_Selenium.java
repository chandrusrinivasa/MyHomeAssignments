package Homeassignment_Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demonstrating_Select_class_in_Selenium {

	public static void main(String[] args) {

		// Chorme options to avoid pop up regarss to chrome
		ChromeOptions option = new ChromeOptions();

		// so we are used Guest user
		option.addArguments("guest");

		// Intiate the chrome driver with option
		ChromeDriver driver = new ChromeDriver(option);

		// Lauch the borwser of Leaftaps
		driver.get("https://en-gb.facebook.com/");

		// Maximize the screen
		driver.manage().window().maximize();

		// click the Create new account
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();

		// Enter the First name
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Chandru");

		// Enter the lastname
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Srinivasan");

		// Enter the Mobile phone
		driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[5]")).sendKeys("9843821918");

		// Enter the Password
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Srinivasan");

		// Enter the brith the date
		WebElement Date = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));

		// by using the Select we all selected date
		Select four = new Select(Date);

		// By using selected method callin the value
		four.selectByValue("14");

		// Enter the birth the day
		WebElement Day = driver.findElement(By.xpath("//select[@id=\"month\"]"));

		// by using the Select we all selected date
		Select Aug = new Select(Day);

		// By using selected method callin the value
		Aug.selectByVisibleText("Aug");

		WebElement Month = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		Select year = new Select(Month);
		year.selectByVisibleText("1998");

		driver.findElement(By.xpath("(//input[@id=\"sex\"])[2]")).click();
	}

}
