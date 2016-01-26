package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DelectData {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new FirefoxDriver();
	driver.get("https://test.salesforce.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("username")).sendKeys("jakther@centerlight.org.qual");
	driver.findElement(By.id("password")).sendKeys("06082003Tuba");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	List<WebElement>list =driver.findElements(By.cssSelector(".mruText"));
	System.out.println(list.size());
	
	for(WebElement ele: list){
		System.out.println(ele.getText());
		if(ele.getText().contains("tuba")){
			ele.click();
			break;
		}
		
		
		
	}
	
	
		
	}
	
	
	
	


}
