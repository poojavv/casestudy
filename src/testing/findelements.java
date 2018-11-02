package testing;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class findelements 

{	
	
		String baseUrl = "http://qatechhub.com";
		String fb = "https://www.facebook.com/";
		String fk = "https://www.flipkart.com/";
		String google = "https://www.google.co.in/";
		String ebay = "https://www.ebay.com/";
		String snap = "https://www.snapdeal.com/";
		//String gmail = ""
		
		WebDriver d = new ChromeDriver();
	
		JavascriptExecutor js = (JavascriptExecutor) d;
		
	
		public void mthd() //title match
		{
						
			d.manage().window().maximize();
			d.get(baseUrl);
			
			String exptitle = d.getTitle();
			String acttitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
			
			if(exptitle.equals(acttitle))
			{
				System.out.println("pass");
			}
				else
				{
					System.out.println("fail");
				}
		}
		
		public void fb() //print current url
		{
			d.navigate().to(fb);
			d.navigate().back();
			String cururl = d.getCurrentUrl();
			System.out.println(cururl);
			d.navigate().refresh();
			
		}
		
		public void flipkart() //count of links and print links
		{
			d.navigate().to(fk);
			java.util.List<WebElement> li = d.findElements(By.tagName("a"));
			int link = li.size();
			System.out.println(link);
			
			for(int i=1;i<=link;i++)
			{
				System.out.println(li.get(i).getText());
			}
		}
		
		public void flip() // count of checkbox , menus , textboxes
		{
			d.get(fk);
			java.util.List<WebElement> ck = d.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println(ck);
			
			
			java.util.List<WebElement> dropdown = d.findElements(By.tagName("select"));  
			System.out.println(dropdown.size());
			
			java.util.List<WebElement> textboxes = d.findElements(By.xpath("//input[@type='text'[@class='inputtext']")); 
			System.out.println(textboxes.size());

		}
		
		public void google() // links of particular section
		{
			d.get(google);
			WebElement sec = d.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]"));
			java.util.List<WebElement> s = sec.findElements(By.tagName("a"));
			
			
			for(int j=0;j<=s.size();j++)
			{
				System.out.println(s.get(j).getText());
			}
		}
		
		public void ebay()
		{
			d.get(ebay);
			WebElement we = d.findElement(By.id("gh-ac"));
			we.sendKeys("Apple watches");
			WebElement se = d.findElement(By.id("gh-shop-a"));
			se.click();
			WebElement pe = d.findElement(By.linkText("Watches"));
			pe.click();
			WebElement be = d.findElement(By.id("gh-btn"));
			be.click();
			  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			java.util.List<WebElement> li = d.findElements(By.tagName("a"));
			for(int i=0;i<=li.size();i++)
			{
				System.out.println(li.get(i).getText());
			}
			
		}
		
		
		public void snapdeal()//mouse Actions and wait
		{
			d.get(snap);
			Actions ac = new Actions(d);
			WebElement we = d.findElement(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"));
			ac.moveToElement(we).build().perform();
			
			WebElement login = d.findElement(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a"));
			
			WebDriverWait wait = new WebDriverWait(d, 5);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a")));
			ac.moveToElement(login).build().perform();
			login.click();
		}
			
		
		public static void main (String[] args)
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");

			findelements f = new findelements();
			//f.mthd();
			//f.fb();
			
			//f.google();
			// f.ebay();
			f.snapdeal();
			f.flipkart();
			f.flip();
		}
		
	}




