package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage 
{
	WebDriver d;
	By searchbox = By.xpath(".//*[@id='search']/div[1]/div[2]/input");
	By cancel = By.xpath(".//*[@id='header']/div/div/div[2]");
	
	public SearchPage(WebDriver dv)
	{
		this.d = dv;
	}
	
	public void searchtext(String txt)
	{
		d.findElement(searchbox).sendKeys(txt);
		d.findElement(searchbox).sendKeys(Keys.ENTER);
		System.out.println("Testcase 1: Successfully searched for Location:India");
		d.findElement(cancel).click();
	}
	
}