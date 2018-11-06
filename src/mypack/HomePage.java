package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
		WebDriver d;
	
		By search = By.xpath(".//*[@id='header']/div/div/div[2]");
		By checkbox = By.id("confirm");
		By emailid = By.name("email");
		By newsbtn = By.className("submit");
		By contact = By.linkText("Contact");
		By menu = By.xpath(".//*[@id='header']/div/div/div[1]");
		By dest = By.xpath(".//*[@id='menu']/div/div/div[1]/div[1]/div/div");
		//By destimg = By.className("destination-menu");
		By swipeleft = By.xpath(".//*[@id='menu']/div/div/div[1]/div[2]/div/div[3]");
		By swiperight = By.xpath(".//*[@id='menu']/div/div/div[1]/div[2]/div/div[2]");
		By destimg = By.cssSelector("a[href='/destination/usa/midwest/']");
		
				
		public HomePage(WebDriver dv)
		{
			this.d = dv;
		}
		
		//click on dropdown
		public void dropdown()
		{
			Select dropdown = new Select(d.findElement(By.className("locales-dropdown")));
			dropdown.selectByVisibleText("France");
			
		}
		//click on search
		public void clicksearch()
		{
			
			d.findElement(search).click();
		}
		
		//click on checkbox
		public void checkbox()
		{
			d.findElement(checkbox).click();
		}
		
		//enter emailid
		public void emaildid(String eid)
		{
			d.findElement(emailid).sendKeys(eid);
		}
		
		//click activate newsletter
		public void newsletter()
		{
			d.findElement(newsbtn).click();
			System.out.println("Test case 3-Successfully Subscribed to the newsletter");

		}
		
		//click on contact
		public void contact()
		{
			
			d.findElement(contact).click();
			
		}
		
		public void menudest()
		{
			d.findElement(menu).click();
		}
		
		public void clickdest()
		{
			d.findElement(dest).click();
		}
		
		public void navigate()
		{
			d.findElement(swipeleft).click();
			d.findElement(swiperight).click();
			System.out.println("Testcaes 4 : Successfully navigated through menu");

		}
		public void clickdestimg()
		{
			d.findElement(destimg).click();
		}
}
