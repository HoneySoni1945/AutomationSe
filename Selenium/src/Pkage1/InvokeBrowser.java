package Pkage1;

import java.awt.image.CropImageFilter;
import java.util.concurrent.TimeUnit;

import javax.swing.text.ChangedCharSetException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InvokeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver =new FirefoxDriver();
		WebDriver driver1=new ChromeDriver();
//		driver1.close();
	//	driver1.quit();
		//driver1.get("https://koinex.in/exchange/ripple");
		//System.out.println(driver1.getCurrentUrl());
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver1.get("http://magento.com");
		WebElement my_acc= driver1.findElement(By.linkText("MY ACCOUNT"));
		System.out.println(my_acc.getAttribute("href"));
		System.out.println(my_acc.getCssValue("color"));
		System.out.println(my_acc.getTagName());
		System.out.println(my_acc.getText());
		my_acc.click();
		WebElement reg = driver1.findElement(By.xpath("//span[text()='Register']"));
		reg.click();
		WebElement Fname = driver1.findElement(By.name("firstname"));
		Fname.sendKeys("honey");
		WebElement Lname = driver1.findElement(By.name("lastname"));
		Lname.sendKeys("Soni");
		WebElement ename = driver1.findElement(By.name("email"));
		ename.sendKeys("honey.soni1945@gmail.com");
		WebElement com_pr = driver1.findElement(By.name("company_type"));
		Select com_pr1 = new Select(com_pr);
		com_pr1.selectByValue("development");
		WebElement My_role = driver1.findElement(By.name("individual_role"));
		Select My_role1= new Select(My_role);
		My_role1.selectByValue("technical/developer");
		WebElement Sname = driver1.findElement(By.name("screen_name"));
		Sname.sendKeys("honey");
		WebElement pname = driver1.findElement(By.name("password"));
		pname.sendKeys("Goolgle@123");
		WebElement cname = driver1.findElement(By.name("confirmation"));
		cname.sendKeys("Google@123");
		WebElement Cbox = driver1.findElement(By.id("agree_terms"));
		Cbox.click();
		Cbox.submit();
		
		/*WebElement email = driver1.findElement(By.name("login[username]"));
		email.clear();
		email.sendKeys("honey.soni@gmail.com");
		WebElement password = driver1.findElement(By.id("pass"));
		password.clear();
		password.sendKeys("Google.com");
		password.submit();//workaround to click on login
*/		/*WebElement Login= driver1.findElement(By.name("send"));
		Login.click();*/
		/*String url= driver1.getCurrentUrl();
		System.out.println(url);
		System.out.println("Security level"+ url.contains("https"));
		System.out.println("Domin localization details " + url.contains("google.co.in"));
		System.out.println(driver1.getWindowHandle());
		System.out.println(driver1.getWindowHandles());
		driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver1.manage().timeouts().pageLoadTimeout(arg0, arg1);
		//driver1.manage().window().setPosition(new Point(500,500));
		Point p = driver1.manage().window().getPosition();
		driver1.manage().window().setPosition(new Point(p.x+500,p.y+500));
		driver1.manage().window().setSize(new Dimension(50,500));
		driver1.navigate().refresh();
		*/

	}

}
