package Marathon_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PVR_Cinemas {
	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions option = new ChromeOptions();

		//option.addArguments("guest");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class=\"p-dropdown-trigger\"])[1]")).click();
		
		driver.findElement(By.xpath("//input[@class=\"p-inputtext p-component p-autocomplete-input p-autocomplete-input\"]")).sendKeys("Chennai");

	    driver.findElement(By.xpath("(//div[@class=\"cities-overlay cities-active\"])[6]")).click();
	
	    driver.findElement(By.xpath("//span[@class=\"cinemas-inactive\"]")).click();
	    
	    driver.findElement(By.xpath("(//span[@class=\"p-dropdown-label p-inputtext p-placeholder\"])[2]")).click();
	    
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	    driver.findElement(By.xpath("(//li[@class=\"p-dropdown-item\"])[3]")).click();

	    Thread.sleep(1000);
	    
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//li[@class=\"p-dropdown-item\"])[8]")).click();
        
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//li[@class=\"p-dropdown-item\"])[2]")).click();
        
        driver.findElement(By.xpath("//button[@class=\"p-button p-component sc-gNZgCX hrwxnG bgColor filter-btn\"]")).click();
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class=\"sc-dkBYrC cNsERm reject-terms\"]")).click();
        
	    driver.findElement(By.xpath("//span[@id=\"CL.CLUB|F:16\"]")).click();
	    
	    
	    Thread.sleep(5000);
	    WebElement Seat_Info = driver.findElement(By.xpath("//div[@class=\"seat-number\"]"));
	   
	    System.out.println("Seat Info details :" +Seat_Info.getText());

	    WebElement Grand_Total = driver.findElement(By.xpath("//div[@class=\"grand-prices\"]"));
	    System.out.println("Total Grand price deatils :" +Grand_Total.getText());
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@class=\"sc-dJkDXt bWYhCG btn-proceeded\"]")).click();
	
	    Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class=\"fb-added-btndesk\"]")).click();
	
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//i[@class=\"pi pi-times\"])[2]")).click();
	
	    System.out.println("Current url :"+driver.getTitle());
	    
	    driver.close();
	}

}
