/**
 * 
 */
package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author pooja
 *
 */
public class ContactPage 
{
	WebDriver d;
	
	By msg =By.xpath(".//*[@id='app']/div[3]/div/div/div[1]/div[2]/div/textarea");
	By name = By.xpath(".//*[@id='app']/div[3]/div/div/div[1]/div[3]/div[1]/input");
	By email = By.id(".//*[@id='contact-email']");
	By check = By.id("confirm");
	By submit = By.className("contact-submit");
	
	public ContactPage(WebDriver dv)
	{
		this.d = dv;
	}
	
	public void data(String msgs,String names,String id)
	{
	
		d.findElement(msg).sendKeys(msgs);
		d.findElement(name).sendKeys(names);
		d.findElement(email).sendKeys(id);
		d.findElement(check).click();
	}
	
	public void submit()
	{
		d.findElement(submit).click();
	}
	
}
