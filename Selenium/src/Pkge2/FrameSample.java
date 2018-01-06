package Pkge2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("http://naukri.com");
Set<String> winids= driver.getWindowHandles();
Object[] ids = winids.toArray();
driver.switchTo().window(ids[1].toString());
driver.close();
driver.switchTo().window(ids[1].toString());

/*for(string winid:winids)
{
driver.switchTo().window(winid);
System.out.println("url is "+driver.getCurrentUrl());
System.out.println("Title is "+driver.getTitle());
}*/


/*driver.get("https://netbanking.hdfcbank.com/netbanking/");
driver.switchTo().frame("login_page");
driver.switchTo().frame(0);
driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='RSLogin.html?v=7')));"
		driver.findElement(By.name("fldLoginUserId")).sendkeys("12345");*/
		
	}

}
