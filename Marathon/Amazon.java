package Marathon_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.types.Duration;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions option = new ChromeOptions();

		//option.addArguments("guest");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Bags for boys");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id=\"sac-suggestion-row-1\"]")).click();
		
		WebElement Total_Number_of_result = driver.findElement(By.xpath("//h2[@class=\"a-size-base a-spacing-small a-spacing-top-small a-text-normal\"]"));
		System.out.println(Total_Number_of_result.getText());
		
		driver.findElement(By.xpath("//span[text()='Brands']//following::span[text()='Safari']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Brands']//following::span[text()='Gear']")).click();
		
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class=\"a-button-text a-declarative\"]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id=\"s-result-sort-select_4\"]")).click();

	    Thread.sleep(3000);
	    
    WebElement Bag_brand = driver.findElement(By.xpath("(//span[@class=\"a-size-base-plus a-color-base\"])[1]"));
	System.out.println("Name of the bag brand :" +Bag_brand.getText());
	
	WebElement Name_of_bag = driver.findElement(By.xpath("(//h2[@class=\"a-size-base-plus a-spacing-none a-color-base a-text-normal\"])[1]"));
	System.out.println("Bag name :" +Name_of_bag.getText());
	
	
	WebElement Price_of_bag = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[5]"));
	System.out.println("Price of bag :"+Price_of_bag.getText());
	
	System.out.println(driver.getTitle());
	
	driver.close();
	
	
	}

}