package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mypack.ContactPage;
import mypack.DestinationPage;
import mypack.HomePage;
import mypack.SearchPage;


public class Testcases 
{
	
	
	@Test
	public void setup()
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pooja\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://magazine.trivago.com/");

		d.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) d;
		
		WebDriverWait wait = new WebDriverWait(d , 40);
	
		//testcase 1
		HomePage home = new HomePage(d);
		
		home.clicksearch(); //click on search

		SearchPage search = new SearchPage(d); //go to search page
		search.searchtext("India"); //type text and click cancel
		
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		//testcase 3
		home.checkbox(); //tick checkbox for newsletter
		home.emaildid("poojavarde@gmail.com"); //enter emailid
		home.newsletter(); //click submit
		
		//testcase 4
		home.menudest(); //click on menu
		home.clickdest(); //click destination
		home.navigate(); //navigate right and left
		
		//testcase 5
		WebElement element = d.findElement(By.cssSelector("a[href='/destination/usa/midwest/']"));
		jse.executeScript("arguments[0].click();", element);
		System.out.println("Testcase 5 :Successfully opened articles from USA Midwest ");

		//testcase 6
		DestinationPage dest = new DestinationPage(d);
		dest.countlink(); //count of no. of articles
		System.out.println("Testcase 6 :Successfully found count of artices on USA Midwest destination ");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Contact")));
		 
		
		//testcase 2
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Contact")));
		
		home.contact(); //click on contact link
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		ContactPage cp = new ContactPage(d); //go to contact page
		
		
		cp.data("hello hi", "pooja", "poojavarde65@gmail.com"); //fill form
		cp.submit();
		

	}
}
