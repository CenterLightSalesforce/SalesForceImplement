package testCase;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingBetaVersion {
	static WebDriver driver;
   
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakther\\Desktop\\jahed\\java\\chromedriver\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get("https://test.salesforce.com");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.id("username")).sendKeys("jakther@centerlight.org.qual");
    	driver.findElement(By.id("password")).sendKeys("06082003Tuba");
    	driver.findElement(By.id("Login")).click();
    	Thread.sleep(2000);
		driver.findElement(By.id("Account_Tab")).click();
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.cssSelector(".dataCell>a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			WebElement ele=driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr["+(i+2)+"]/th/a"));
			System.out.println(ele.getText());
		
			switch(ele.getText()){
			case "MD J Akther":
				ele.click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[4]")).click();
				Thread.sleep(2000);
				
				 try {
				        Alert alert = driver.switchTo().alert();
				        alert.accept();
				        Thread.sleep(2000);
				           } catch (Exception e) {
				    }
				 break;
			
			case "Akther Nabil":
				ele.click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[4]")).click();
				Thread.sleep(2000);
				
				 try {
				        Alert alert = driver.switchTo().alert();
				        alert.accept();
				        Thread.sleep(2000);
				           } catch (Exception e) {
				    }
				 break;
				 default:
				}
			}
		}
   }
