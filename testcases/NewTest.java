package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import mypack.NewClass;

public class NewTest 

{
  @Test
  public void VerifyLogin()
  {
	  
	  WebDriver d = new FirefoxDriver();
	  d.manage().window().maximize();
	  d.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=googlemail&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	 
	  NewClass login = new NewClass(d);
	  login.emailid();
	  login.next();
	  login.pwd();
	  login.nexttwo();
	  
	  d.quit();
  }
}
