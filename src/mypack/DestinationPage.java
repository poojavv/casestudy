/**
 * 
 */
package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author pooja
 *
 */
public class DestinationPage
{
	WebDriver d ;
	
	JavascriptExecutor js = (JavascriptExecutor) d;
	
	public DestinationPage(WebDriver dv)
	{
		this.d = dv;
	}
	public void countlink()
	{
		
		java.util.List<WebElement> li = d.findElements(By.tagName("a"));
		int link = li.size();
		System.out.println(link);
		
/*
	for(int i=1;i<=link;i++)
		{
			System.out.println(li.get(i).getText());
		}*/
	}
}
